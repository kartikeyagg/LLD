package SystemDesign.LLD.Memento.Configuration;

public class ConfigurationMemento {
	
	private int height ;
	private int width;
	public ConfigurationMemento(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	

}
