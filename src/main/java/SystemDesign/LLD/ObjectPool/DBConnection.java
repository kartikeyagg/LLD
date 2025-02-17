package SystemDesign.LLD.ObjectPool;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private Connection mySqlConnection;

	public DBConnection() {

		try {
			mySqlConnection = DriverManager.getConnection("URL");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
