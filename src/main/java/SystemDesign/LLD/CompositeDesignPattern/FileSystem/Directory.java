package SystemDesign.LLD.CompositeDesignPattern.FileSystem;

import java.util.ArrayList;

public class Directory implements FileSystem  {
	
	private String name;
	private ArrayList<FileSystem> subs ;
	
	

	public Directory(String name) {
		super();
		this.name = name;
		this.subs = new ArrayList<FileSystem>() ;
	}
	
	public void add(FileSystem file) {
		this.subs.add(file) ;
	}



	@Override
	public void ls() {
		// TODO Auto-generated method stub
		
		System.out.println(name);
		
		for(FileSystem files: this.subs) {
			
			files.ls(); 
		}
		
		
	}

}
