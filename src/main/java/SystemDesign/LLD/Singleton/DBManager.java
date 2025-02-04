package SystemDesign.LLD.Singleton;

public class DBManager {
	
	
	private static DBManager dbManager;

	private DBManager() {
	}

	public static DBManager getInstance() {

		if (dbManager == null) {

			synchronized (DBManager.class) {

				if (dbManager == null) {
					dbManager = new DBManager();
				}

			}

		}

		return dbManager;

	}
	
	
	
	
	
	
}
