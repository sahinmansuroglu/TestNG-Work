package Testler;

import org.testng.annotations.*;

public class day2
{
    @BeforeSuite
    public  void beforeSuit(){
        System.out.println("Before Suit Method executed");
    }
    @Test(groups = {"Smoke"})
    public  void Demo(){
        System.out.println("Testler.day2 Demo Helooo ");
    }

    //testng skiip this method execution when enable equaals false
    @Test(enabled = false)
    public  void SecondTest(){
        System.out.println("Testler.day2 Second Test Helooo");
    }
    @AfterTest
    public void  afterTest(){
        System.out.println("After Test Method");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod executed");
    }
}
