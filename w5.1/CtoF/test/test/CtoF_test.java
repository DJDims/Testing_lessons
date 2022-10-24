package test;

import classes.CtoF;
import org.junit.Test;
import static org.junit.Assert.*;

public class CtoF_test {
    
    public CtoF_test() {
    }
    
    @Test
    public void test_getTF(){
        CtoF ctof = new CtoF();
        float TF = ctof.getTF(25);
        assertEquals(77, TF, 0.001);
    }
    @Test
    public void test_getTF2(){
        CtoF ctof = new CtoF();
        float TF = ctof.getTF(100);
        assertEquals(212, TF, 0.001);
    }
    @Test
    public void test_getTF3(){
        CtoF ctof = new CtoF();
        float TF = ctof.getTF(-10);
        assertEquals(14, TF, 0.001);
    }
    @Test
    public void test_getTF4(){
        CtoF ctof = new CtoF();
        float TF = ctof.getTF(0);
        assertEquals(32f, TF, 0.001);
    }
    @Test
    public void test_getTF5(){
        CtoF ctof = new CtoF();
        float TF = ctof.getTF(10000);
        assertEquals(18032f, TF, 0.001);
    }
    
}
