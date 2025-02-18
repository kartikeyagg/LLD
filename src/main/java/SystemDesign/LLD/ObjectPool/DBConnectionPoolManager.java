package SystemDesign.LLD.ObjectPool;

import java.util.ArrayList;
import java.util.List;

import SystemDesign.LLD.Singleton.DBManager;

public class DBConnectionPoolManager {

	private final int INITIAL_POOL_SIZE = 3;
	private final int MAX_POOL_SIZE = 6;

	private List<DBConnection> freeConnectionInPool;
	private List<DBConnection> connectionInUse;
	
	private static volatile DBConnectionPoolManager obj ;

	private DBConnectionPoolManager() {

		freeConnectionInPool = new ArrayList<DBConnection>();
		connectionInUse = new ArrayList<DBConnection>();

		for (int i = 0; i < INITIAL_POOL_SIZE; i++) {

			this.freeConnectionInPool.add(new DBConnection());

		}

	}
	
	public static  DBConnectionPoolManager getInstance() {

		if (obj == null) {

			synchronized (DBManager.class) {

				if (obj == null) {

					obj = new DBConnectionPoolManager();

				}

			}

		}

		return obj;
	}

	public DBConnection getDBConnection() {

		if (freeConnectionInPool.size() != 0) {

			DBConnection dbConnection = this.freeConnectionInPool.remove(this.freeConnectionInPool.size() - 1);

			connectionInUse.add(dbConnection);
			return dbConnection;

		} else if (connectionInUse.size() < MAX_POOL_SIZE) {

			DBConnection dbConnection = new DBConnection();
			connectionInUse.add(dbConnection);
			return dbConnection;

		}

		return null;

	}

	public void releaseConnection(DBConnection dbConnection) {

		connectionInUse.remove(dbConnection);

		this.freeConnectionInPool.add(dbConnection);

		return;

	}

}
