import org.testng.annotations.Test;

public class TestClass2 {

    @Test(groups = {"smoke"})
    public void test3(){
        System.out.println("This is third test");
    }

    @Test(groups={"smoke","regression"})
    public void test4(){
        System.out.println("This is fourth test");
    }
}
