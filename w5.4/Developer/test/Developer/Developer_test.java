package Developer;

import developer.Developer;
import developer.DeveloperLogic;
import org.junit.Test;
import static org.junit.Assert.*;

public class Developer_test {
    Developer dev = new Developer("Dmitrii", "Kreivald", "Programmer", 4000);
    DeveloperLogic devlog = new DeveloperLogic();
    
    public Developer_test() {
    }
    
    @Test
    public void test_firstnameField(){
        String name = dev.getFirsName();
        assertEquals("Dmitrii", name);
    }
    @Test
    public void test_laststnameField(){
        String lastname = dev.getLastName();
        assertEquals("Kreivald", lastname);
    }
    @Test
    public void test_specialityField(){
        String speciality = dev.getSpecialty();
        assertEquals("Programmer", speciality);
    }
    @Test
    public void test_salaryField(){
        int salary = dev.getSalary();
        assertEquals(4000, salary);
    }
    @Test
    public void test_hourSalary(){
        int hourRate = devlog.calculateHourRate(dev);
        assertEquals(25, hourRate);
    }
    
    @Test
    public void test_annualSalary(){
        int annualSalary = devlog.calculateAnnualSalary(dev);
        assertEquals(48000, annualSalary);
    }
}
