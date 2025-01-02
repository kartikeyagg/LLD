package SystemDesign.LLD.FactoryPattern;

public class BookFactory {
	
	
	
	public BookAPI getBook(String type) {

		switch (type) {
		case "Novel": {
			
			return new Novel(); 
			

		}
		case "TextBook": {
			return new TextBook();
			

		}
		default:
			return null; 
		}
		
	}

}
