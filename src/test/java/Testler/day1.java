package Testler;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1
{

    @Parameters({"URL","APKEY"})
    @Test
    public  void Demo(String url,String apkey){

        System.out.println(url+" "+ apkey);
        System.out.println("Testler.day1 Demo Helooo ");
    }

    @Test(groups = {"Smoke"})
    public  void SecondTest(){
        System.out.println("Testler.day1 Second Test Helooo");
    }
}
