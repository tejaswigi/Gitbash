package frameworks;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert 
{

	@Test 
	
		public void createcontact()
		{
			System.out.println("step1");
			System.out.println("step2");
		SoftAssert st= new SoftAssert();
		st.assertEquals(false,true);
		System.out.println("step3");
		System.out.println("step4");

}
	@Test 
	public void m1()
	{
		String expname="shoba";
		String actualname="shobarani";
		Assert.assertEquals(expname, actualname);
		
	}
}