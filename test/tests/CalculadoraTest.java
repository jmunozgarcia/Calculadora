package tests;
import calculadora.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
public CalculadoraTest() {
}
@BeforeClass
public static void setUpClass() {
System.out.print("Ejecutando tests.....");
}
@AfterClass
public static void tearDownClass() {
System.out.print("Finalizando tests.....");
}
@Before
public void setUp() {
System.out.print("Comienza el test");
}
@After
public void tearDown() {
System.out.print("Finaliza el test");
}
/**
* Test of suma method, of class Calculadora.
*/
@Test
public void testSuma() {
System.out.println("suma");
double numero1 = 6;
double numero2 = 2;
double expResult = 8;
Calculadora instance= new Calculadora(numero1, numero2);
double result = instance.suma();
assertEquals(expResult, result, 0.0);
assertEquals(expResult, result, 0.0);
// TODO review the generated test code and remove the default call to fail.
//fail("The test case is a prototype.");
}
}
