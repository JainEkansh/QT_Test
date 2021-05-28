package Com.Test.Ekansh.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class PropFileHandler
{
	public static Properties testData = new Properties();
	
	public static String readProperty(String property)
	{
		String value;
		try 
		{
			FileInputStream in = new FileInputStream("src/test/resources/TestData/TestData.properties");
			try 
			{
				testData.load(in);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		value=testData.getProperty(property);
		return value;
	}
}
