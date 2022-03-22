package PrimeNum;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeNumTest {
    @Test
    public final void testPrimality() {
        int num = PrimeNum.getRandPrimeNum();
        assertTrue(PrimeNum.isPrime(num));
    }
}
