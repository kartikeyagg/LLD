package SystemDesign.LLD.CompositeDesignPattern.FileSystem;

public class File implements FileSystem  {
	
	private String filename;

	public File(String filename) {
		super();
		this.filename = filename;
	}



	@Override
	public void ls() {
		// TODO Auto-generated method stub
		System.out.println( this.filename );
	}

}
