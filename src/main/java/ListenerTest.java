import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

public class ListenerTest {


    @Test
    public void pass(){

        Assert.assertEquals(true,true);
    }

    @Test
    public void fail(){
        System.out.println("check 1");
        Assert.assertEquals(true,false);
    }
}
