package vorlage2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import vorlage.Messwert;


public class MesswertTest {
	
    @Test
    public void test() {
    	Messwert test=new Messwert();
    	int x=test.check(10);
    	assertEquals(10, x);
    }
}
