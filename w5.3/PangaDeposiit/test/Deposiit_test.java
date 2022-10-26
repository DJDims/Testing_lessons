
import classes.Deposiit;
import org.junit.Test;
import static org.junit.Assert.*;

public class Deposiit_test {
    
    public Deposiit_test() {
    }
    
    @Test
    public void test_deposiit(){
        Deposiit dep = new Deposiit();
        double[] test = dep.deposiit(5);
        assertEquals(1102.5, test[0], 0.01);
        assertEquals(2, test[1], 0.0);
    }
    
}
