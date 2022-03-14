package demoGit;

import org.testng.annotations.Test;

public class ReaddataTest {
	@Test
	public void readdata()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		

		String URL = System.getProperty("url");
		System.out.println(URL);
		
	}
}
