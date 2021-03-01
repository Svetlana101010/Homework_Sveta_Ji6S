import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Random;


public class RandomGenTest {
    @Test
    public void main() {
        Random r = new Random();
        int result = r.nextInt(50);
        int min = 0;
        int max = 50;
        assertTrue(result > min);
        assertTrue(result < 50);


    }

    @Test
    public void mainFalse() {
        Random r = new Random();
        int result = r.nextInt(50);
        int min = 0;
        int max = 50;
        assertFalse(result < min);
        assertFalse(result > 50);
    }

    @Test
    public void maimSum() {
        Random r = new Random();
        int sum = 0;
        int randomInt;
        for (int i = 0; i < 3; i++) {
            randomInt = r.nextInt(50);

            sum = sum + randomInt;
            assertTrue(sum < 150);
            assertTrue(sum > 0);

        }

    }
 @Test
    public void mainSumFalse (){
    Random r = new Random();
    int sum = 0;
    int randomInt;
    for (int i = 0; i < 3; i++){
        randomInt = r.nextInt(50);
        sum = sum + randomInt;
        assertFalse(sum > 150);
        assertFalse(sum < 0);
    }
}
}
