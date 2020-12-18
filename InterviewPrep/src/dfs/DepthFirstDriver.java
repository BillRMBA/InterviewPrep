package dfs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DepthFirstDriver {
	public static void main(String [] args) {
		
		Properties prop = new Properties();
		String propFileName = "config.properties";
		try {
			prop.load(new FileInputStream(propFileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			InputStream inputStream = new FileInputStream(propFileName);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println(prop.getProperty("graph"));
		System.err.println("YOU GOT PROBLEMS BRO");
	}

}
