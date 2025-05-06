package vorlage2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import vorlage.Main;


public class MainTest {
	
    @Test
    public void test() {
    	Main test=new Main();
    	int x=test.check(10);
    	assertEquals(10, x);
    }
}
