package q5;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class LifeCycleTest {
  static  LifeCycle test;

    @BeforeAll
    static void setUpAll() {
        System.out.println("@ Before All");
    }

    @BeforeEach
    void setUp() {
        test = new LifeCycle();
        test.array=new int[]{5,4,3,9,6,2,1};
        
        System.out.println("@ Before Each");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("@ After All");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@ After Each");
    }

    @Test
    void arraySum() {
        System.out.println("Array sum method testing");
        assertEquals(30,test.arraySum());
    }
    @Test
    @DisplayName("Multiplication")
    void testMultiply() {
        System.out.println("Multiplication done");
        assertEquals(30,test.multiply(15,2));
    }
    

    
   
}
