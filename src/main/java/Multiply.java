import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiply {

    @Test
    @Parameters({"a","b"})
    public void multiple(int a, int b){
        System.out.println("The multiplication is :"+ (a*b));
    }
}
