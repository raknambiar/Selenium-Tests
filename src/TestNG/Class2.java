package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2 {
	 @BeforeClass
	  public void Login() {
		  System.out.println("Login successful");
	  }

	  @AfterClass
	  public void logout() {
		  System.out.println("logout succesful");
	  }

	 @Test (priority =4)
	  public void DeleteVendor() {
		  System.out.println("Delete vendor successful");
	  }
	  @Test (priority =5)
	  public void DeleteProduct() {
		  System.out.println("Delete product successful");
	  }
	  @Test (priority =6)
	  public void DeleteCurrency() {
		  System.out.println("Delete currency successful");
	  }
  }

