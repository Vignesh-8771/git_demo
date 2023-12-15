package frameworkproperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class properties {
	
	
  public static void main (String [] args) throws FileNotFoundException, IOException {
	
	Properties properties = new Properties();
	
	properties.load(new FileInputStream("./amazoneng.prop.india"));
	
	String property = properties.getProperty("Amazon");
	
	System.out.println(property);

  }
  
}
