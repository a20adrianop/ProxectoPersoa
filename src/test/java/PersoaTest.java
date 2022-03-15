/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author wadmin
 */
public class PersoaTest {
    
    public PersoaTest() {
    }

    @Test
    public void testIdadeValida() {
        System.out.println("Idade 50");
        Persoa instance = new Persoa();
        instance.setIdade(50);
        boolean result = instance.idadeValida();
        assertTrue(result); 
    }
    @Test
    public void testIdadeValida18() {
        System.out.println("Idade 18");
        Persoa instance = new Persoa();
        instance.setIdade(18);
        boolean result = instance.idadeValida();
        assertTrue(result); 
    }
    
    @Test
    public void testIdadeValida60() {
        System.out.println("Idade 60");
        Persoa instance = new Persoa();
        instance.setIdade(60);
        boolean result = instance.idadeValida();
        assertTrue(result); 
    }
    @Test
    public void testIdadeNoValida80() {
        System.out.println("Idade 80");
        Persoa instance = new Persoa();
        instance.setIdade(80);
        boolean result = instance.idadeValida();
        assertFalse(result);
    }
    
    @Test
    public void testIdadeNoValida61() {
        System.out.println("Idade 61");
        Persoa instance = new Persoa();
        instance.setIdade(61);
        boolean result = instance.idadeValida();
        assertFalse(result);
    }    
    @Test
    public void testIdadeNoValida17() {
        System.out.println("Idade 61");
        Persoa instance = new Persoa();
        instance.setIdade(17);
        boolean result = instance.idadeValida();
        assertFalse(result);
    }
}
