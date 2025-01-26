package SystemDesign.LLD.CompositeDesignPattern.FileSystem;

public class FileSystemLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Directory dir1 =  new Directory("Movies") ;
		
		FileSystem file1 =  new File("MI2") ;
		
		dir1.add(file1);
		
		Directory dir2 = new Directory("Comedy") ;
		dir1.add(dir2);
		
		FileSystem file2 = new File("Liar Liar" ) ;
		FileSystem file3  = new File ("Detective Pikachu ") ;
		dir2.add(file2);
		dir2.add(file3);
		
		dir1.ls();
	}

}
