package SystemDesign.LLD.Singleton;

public class DBManagerImproved {
	
	private static volatile DBManagerImproved dbManager;
	
	private int port;

	private DBManagerImproved(  ) {
		
		this.port = 6980;
	} 

	public static DBManagerImproved getInstance() {

		if (dbManager == null) {

			synchronized (DBManager.class) {

				if (dbManager == null) {
					dbManager = new DBManagerImproved();
				}

			}

		}

		return dbManager;

	}
	

}
