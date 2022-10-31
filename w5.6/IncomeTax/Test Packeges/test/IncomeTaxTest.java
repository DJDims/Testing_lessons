package test;

import classes.IncomeTax;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class IncomeTaxTest {
    @Parameterized.Parameters
    public static Collection dotsValues(){
        return Arrays.asList(new Object[][]{
            //ЗП    ГЗП   ННС   ОНС     ПОЗ
            {500, 6000, 6000, 8400, 6000.0},
            {700, 8300, 7000, 5000, 7920.0},
            {900, 10800, 6000, 3600, 9840.0},
            {1000, 12000, 6000, 2400, 10800.0},
            {1199, 14388, 6000, 12, 12710.4},
            {1200, 14400, 6000.0, 8400.0, 12720.0},
            {1500, 18000, 4000.0, 14000.0, 15200.0},
            {2000, 24000, 666.667, 23333.333, 19333.333},
            {2099, 25188, 6.667, 25181.333, 20151.733},
            {2100, 25200, 0.0, 25200.0, 20160.0},
            {2500, 32000, 6000, 29000, 24000.0},
        });
    }
    
    IncomeTax incomeTax = new IncomeTax();
    
    int salary, expYearSalary;
    double expTaxFreeSalary, expTaxSalary, expTaxPercent;
    
    public IncomeTaxTest(int salary, int expYearSalary, double taxFreeSalary, double taxSalary, double taxPercent) {
        this.salary = salary;
        this.expYearSalary = expYearSalary;
        this.expTaxFreeSalary = taxFreeSalary;
        this.expTaxSalary = taxSalary;
        this.expTaxPercent = taxPercent;
    }
    
    @Test
    public void yearIncome_test(){
        int yearSalary = incomeTax.yearIncome(salary);
        assertEquals(expYearSalary, yearSalary);
    }
    @Test
    public void taxFreeIncome_test(){
        double taxFreeSalary = incomeTax.taxFreeIncome(salary);
        assertEquals(expTaxFreeSalary, taxFreeSalary, 0.001);
    }
    @Test
    public void taxIncome_test(){
        double taxSalary = incomeTax.taxIncome(salary);
        assertEquals(expTaxSalary, taxSalary, 0.001);
    }
    @Test
    public void taxIncomePercent_test(){
        double taxPercent = incomeTax.taxIncomePercent(salary);
        assertEquals(expTaxPercent, taxPercent, 0.001);
    }
    
}
