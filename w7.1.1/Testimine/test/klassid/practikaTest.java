/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klassid;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author pupil
 */
public class practikaTest {
    
    public practikaTest() {
    }
    /*
    @Test
    public void testTaisarv1() {
        System.out.println("taisarv1");
        int a = 5;
        practika instance = new practika(); //создается обьект класса
        int expResult = 6; //ожидаемое число
        int result = instance.taisarv(a); //реальное число 
        assertEquals(expResult, result); // метод, который позволяет сравнить на равенство ожидаемое и реальное число
       
    }
    @Test
    public void testTaisarv2() {
        System.out.println("taisarv2");
        int a = -5;
        practika instance = new practika(); //создается обьект класса
        int expResult = -5; //ожидаемое число
        int result = instance.taisarv(a); //реальное число 
        assertEquals(expResult, result); // метод, который позволяет сравнить на равенство ожидаемое и реальное число
       
    }
    //@Ignore//при использовании игнора, цветное поле - серое(не красное, не зеленое)
    @Test
    public void testTaisarv3() {
        System.out.println("taisarv3");
        int a = -5;
        practika instance = new practika(); //создается обьект класса
        int expResult = 0; //ожидаемое число
        int result = instance.taisarv(a); //реальное число 
        assertEquals(expResult, result); // метод, который позволяет сравнить на равенство ожидаемое и реальное число
       
    }
    */
    //----------------------------------
    
    public void testTaisarvA1() {
        System.out.println("taisarvA1");
        int a = 5;
        practika instance = new practika(); //создается обьект класса
        int expResult = 6; //ожидаемое число
        int result = instance.taisarvA(a); //реальное число 
        assertEquals(expResult, result); // метод, который позволяет сравнить на равенство ожидаемое и реальное число
       
    }
    public void testTaisarvA2() {
        System.out.println("taisarvA2");
        int a = -5;
        practika instance = new practika(); //создается обьект класса
        int expResult = -7; //ожидаемое число
        int result = instance.taisarvA(a); //реальное число 
        assertEquals(expResult, result); // метод, который позволяет сравнить на равенство ожидаемое и реальное число
       
    }

    /**
     *
     */
    public void testTaisarvA3() {
        System.out.println("taisarvA3");
        int a = 0;
        practika instance = new practika(); //создается обьект класса
        int expResult = 10; //ожидаемое число
        int result = instance.taisarvA(a); //реальное число 
        assertEquals(expResult, result); // метод, который позволяет сравнить на равенство ожидаемое и реальное число
       
    }
    
}

