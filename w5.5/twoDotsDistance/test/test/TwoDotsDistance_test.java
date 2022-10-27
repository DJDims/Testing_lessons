package test;

import classes.TwoDotsDistance;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TwoDotsDistance_test {
    @Parameters
    public static Collection dotsValues(){
        return Arrays.asList(new Object[][]{
            {68, 99, 97, 35, 70.264},
            {7, 9, 5, 15, 6.325},
            {-5, 98, -50, 3, 105.119},
            {35, 98, -90, 7, 155.616},
            {0, 0, 5, 5, 7},
        });
    }

    TwoDotsDistance tdd = new TwoDotsDistance();
    int x1, y1, x2, y2;
    double expDistance;

    public TwoDotsDistance_test(int x1, int y1, int x2, int y2, double expDistance) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.expDistance = expDistance;
    }
    
    @Test
    public void test_distance1(){
        double distance = tdd.distance(x1, y1, x2, y2);
        assertEquals(expDistance, distance, 0.001);
    }
}
