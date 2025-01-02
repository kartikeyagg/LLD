package SystemDesign.LLD.FactoryPattern;

public class FactoryBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookFactory bookFactory =  new BookFactory() ;
		
		BookAPI book1   = bookFactory.getBook("Novel") ;
		BookAPI book2 =  bookFactory.getBook("TextBook");
		
		book1.material();
		book2.material();

	}

}
