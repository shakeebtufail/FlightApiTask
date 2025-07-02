package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Utils {
	
	static String projectPath = System.getProperty("user.dir");
	public static RequestSpecification req;
	
	public static RequestSpecification createRequestSpecification(String basePath, Object body) throws IOException
	{
		req=new RequestSpecBuilder()
				.setBaseUri(getGlobalValue("baseURI"))
				.setBasePath(getGlobalValue(basePath))
				.setBody(body)
				.setContentType(ContentType.JSON)
				.build();
		return req;
		
		
	}
	public static RequestSpecification createRequestSpecification(String basePath) throws IOException
	{
		req=new RequestSpecBuilder()
				.setBaseUri(getGlobalValue("baseURI"))
				.setBasePath(getGlobalValue(basePath))
				.setContentType(ContentType.JSON)
				.build();
		return req;
		
		
	}
	
	public static String getGlobalValue(String key) throws IOException
	{
		Properties prop =new Properties();
		FileInputStream fis =new FileInputStream(projectPath+"/src/test/java/resources/global.properties");
		prop.load(fis);
		return prop.getProperty(key);
		
	}

}
