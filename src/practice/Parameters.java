package practice;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Parameters {

	@Test 
	public void m1() throws Throwable
	{
		String Browser=System.getProperty("browser");
		String Url=System.getProperty("url");

	}

}
