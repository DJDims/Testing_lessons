package test;

import classes.Roots;
import org.junit.Test;
import static org.junit.Assert.*;

public class Roots_test {
    
    public Roots_test() {
    }
    
    @Test
    public void test_sum(){
        Roots roots = new Roots();
        float[] rootsArray = roots.quadraticEquation(1, 3, 2);
        assertEquals(-1, rootsArray[0], 0.001);
        assertEquals(-2, rootsArray[1], 0.001);
    }
    
}
