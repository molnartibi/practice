
import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testjunit2.TestJUnit2;


public class JUnitTest {
    
    TestJUnit2 test = new TestJUnit2();
    
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void turulje() {
        test.add("Gyula");
        test.add("Margit néni");
    }
    
    @After
    public void tearDown() {
        test.removeAll();
    }
    
    
    
    
    @Test
    public void lookEmpty(){
        assertFalse(test.isEmpty());
        
        //Ez is működik:
        //assertEquals("Lássuk, üeres-e.", false, test.isEmpty());
    }
    
    
    @Test
    public void lookSize(){
        assertEquals("Oszt mekkora ez a tömb?", 2, test.size());
    }
    
    
    @Test
    public void testAdd(){
        test.add("Cilike");
        assertEquals("Bekerült Cilike a listábe?", 3, test.size());
    }
    
    
    @Test
    public void lookRemoveAll(){
        test.removeAll();
        assertTrue(test.isEmpty());
    }
    
    @Test(expected = NoSuchElementException.class)
    public void lookRemoveFalse(){
        test.remove("Ferike");
    }
    
    @Test
    public void lookRemove(){
        test.remove("Gyula");
        assertEquals("Törlés utáni méret?", 1, test.size());
    }
    
    
}
