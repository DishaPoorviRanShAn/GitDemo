package dataRepo;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;


public class jsondataReader {
	
	public void jsonread() throws IOException
	
	{
				FileUtils.readFileToString((new File("C:\\Users\\Disha gaur\\eclipse-workspace\\MyOwnFramework\\src\\test\\java\\dataRepo\\PurchasePrder.json")),null);
				//JSON to string reader
				
	}

}
