import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Add {

    @Test
    @Parameters({"a", "b"})
    public void add(int a,int b ){
        System.out.println("The sum is :"+ (a+b));
    }
}
