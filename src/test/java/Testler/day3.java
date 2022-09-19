package Testler;

import org.testng.Assert;
import org.testng.annotations.*;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class day3 {


    @Test
    public  void webLogin(){
        Assert.assertTrue(false);
        System.out.println("WEb Login");
    }

    @Test(dataProvider = "getData")
    public  void MobileLogin(String username, String password){

        System.out.println(username+ " "+ password);
    }


     @Test(groups = {"Smoke"})
    public  void MobileSignin(){

        System.out.println("Mobile Sign in");



    }

    @Test(timeOut = 4000)
    public  void MobileLogOut(){
        System.out.println("Mobile Log out");
    }

    @Test(groups = {"Smoke"})
    public  void ApLogin(){
        System.out.println("Api login");
    }

    @Test(dependsOnMethods = {"webLogin","ApLogin"})
    public  void APIcarLoan(){
        System.out.println("Api Car loan");
    }
    @BeforeTest
    public  void requirement(){
        System.out.println("Before Test Method Executed");
    }

    @BeforeClass(groups = {"Smoke"})
    public  void beforeClass(){
        System.out.println("Before class method executed..");
    }

    @AfterTest
    public void lastExececution(){
        System.out.println("After test method executed");
    }
    @DataProvider
    public Object[][] getData(){

        Object [][] data=new Object[3][2];
        data[0]= new Object[]{"usernam-1", "password-2"};
        data[1]= new Object[]{"usernam-2", "password-2"};
        data[2]= new Object[]{"usernam-3", "password-3"};
        return data;
    }
}
