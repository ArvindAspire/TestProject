import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.testng.annotations.*;

import java.util.Collections;

public class Annotation {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }

    @BeforeTest
    public  void beforeTest(){
      System.out.println("before test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");

    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite");
    }

    @Test
    public void test5(){
        System.out.println("Test5");
    }

    @Test
    public void test6(){
        System.out.println("Test6");
    }

}