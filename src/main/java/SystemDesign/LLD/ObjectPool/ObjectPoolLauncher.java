package SystemDesign.LLD.ObjectPool;

public class ObjectPoolLauncher {
	
	public static void main(String[] args) {
		
	DBConnection dbConnection1 = DBConnectionPoolManager.getInstance().getDBConnection() ;
	DBConnection dbConnection2 = DBConnectionPoolManager.getInstance().getDBConnection() ;
	DBConnection dbConnection3 = DBConnectionPoolManager.getInstance().getDBConnection() ;
	DBConnection dbConnection4 = DBConnectionPoolManager.getInstance().getDBConnection() ;
	DBConnection dbConnection5 = DBConnectionPoolManager.getInstance().getDBConnection() ;
	DBConnection dbConnection6 = DBConnectionPoolManager.getInstance().getDBConnection() ;
	
	DBConnectionPoolManager.getInstance().releaseConnection(dbConnection3);
	
	}
	

}
