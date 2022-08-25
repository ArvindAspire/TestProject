import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Map;

public class LearnTestNG  extends  BaseClass{


    @Test(groups ={"smoke","regression"})
    public void test1(){
        System.out.println("This is first test case");
    }

    @Test(groups={"sanity"})
    public void test2(){
     System.out.println("This is second test case");

    }

    @Test(dataProvider = "student", dataProviderClass = BaseClass.class)
    public void data(Map<String,Integer> hashmap ){
    for(Map.Entry map  : hashmap.entrySet())
        System.out.println("The name is :"+ map.getKey() + "  and Number is :"+map.getValue());

    }

}
