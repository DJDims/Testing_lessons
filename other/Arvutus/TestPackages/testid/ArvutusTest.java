package testid;

import classes.arvutus;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArvutusTest {
    
    public ArvutusTest() {
        
    }
    
    @Test
    public void test_sum(){
        arvutus obj = new arvutus();
        double tulemus = obj.Sum(5, 6);
        assertEquals(11, tulemus, 0.001);
    }
    @Test
    public void test_sub(){
        arvutus obj = new arvutus();
        double tulemus = obj.Sub(1000, 7);
        assertEquals(993, tulemus, 0.001);
    }
    @Test
    public void test_mul(){
        arvutus obj = new arvutus();
        double tulemus = obj.Mul(10, 50);
        assertEquals(500, tulemus, 0.001);
    }
    @Test
    public void test_div(){
        arvutus obj = new arvutus();
        double tulemus = obj.Div(5000, 1000);
        assertEquals(5, tulemus, 0.001);
    }
}
