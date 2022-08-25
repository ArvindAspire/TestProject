import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Subtract {

    @Test
    @Parameters({"a","b"})
    public void subtract(int a,int b){
        System.out.println("The subtract is  :"+ (a-b));
    }
}
