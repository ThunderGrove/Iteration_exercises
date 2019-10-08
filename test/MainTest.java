import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest{

    @Test
    void sumRange(){
        assertEquals(0,Main.sumRange(-10,10),"1. test failed");
        assertEquals(120,Main.sumRange(0,15),"2. test failed");
        assertEquals(-55,Main.sumRange(-10,0),"3. test failed");
    }

    @Test
    void countEvenAndOdd(){
        assertArrayEquals(new int[]{50,50},Main.countEvenAndOdd(0,99),"1. test failed");
        assertArrayEquals(new int[]{46,45},Main.countEvenAndOdd(0,90),"2. test failed");
        assertArrayEquals(new int[]{11,10},Main.countEvenAndOdd(-10,10),"3. test failed");
    }

    @Test
    void isPrime(){
        assertEquals(true,Main.isPrime(5),"1. test failed");
        assertEquals(false,Main.isPrime(10),"2. test failed");
        assertEquals(true,Main.isPrime(17),"3. test failed");
    }
}