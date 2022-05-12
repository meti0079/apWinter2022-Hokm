package config;

import java.util.Properties;

public class Configs extends Properties {
	public int readInteger(String name){
		System.out.println(this.getProperty(name));
		return Integer.parseInt(this.getProperty(name));
	}
	boolean readBoolean(String name){
		return Boolean.parseBoolean(this.getProperty(name));
	}
}

