package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Class1 {
  @Test (priority =1)
  public void AddVendor() {
	  System.out.println("Add vendor successful");
  }
  @Test (priority =2)
  public void AddProduct() {
	  System.out.println("Add product successful");
  }
  @Test (priority =3)
  public void AddCurrency() {
	  System.out.println("Add currency successful");
  }
  @BeforeClass
  public void Login() {
	  System.out.println("Login successful");
  }

  @AfterClass
  public void logout() {
	  System.out.println("logout succesful");
  }

}
