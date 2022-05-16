package config;

public class PanelConfig extends SwingConfig 
{
	public PanelConfig(String name){
		super(name);
		initialize();
	}

	private int cardSize;

	protected void initialize() {
		super.initialize();
		cardSize=properties.readInteger("c");
	}

	@Override
	protected void setProperties() {
		this.properties = ConfigLoader.getInstance("default").getPanelProperties(name);
	}

	public int getCardSize() {
		return cardSize;
	}
}

