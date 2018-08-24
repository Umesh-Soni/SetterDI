package beans;

import java.util.Properties;
import java.util.Set;

public class DataBaseProperties {
	
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	public void getPrint(){
		Set tempSet = properties.keySet();
		for(Object obj:tempSet){
			System.out.println("Key...."+properties.getProperty(obj.toString()));
		}
	}

	@Override
	public String toString() {
		return "DataBaseProperties [properties=" + properties + "]";
	}
	
	

}
