import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println("Failure of test cases and its details are : "+result.getName());
    }

}
