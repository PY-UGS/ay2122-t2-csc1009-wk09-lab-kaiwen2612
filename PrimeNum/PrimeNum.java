package PrimeNum;
import java.util.Random;

public class PrimeNum {
    public static int getRandPrimeNum() {
        int num = 0;
        Random rand = new Random(); // generate a random number
        num = rand.nextInt(100) + 1;
        while (!isPrime(num)) {          
            num = rand.nextInt(100) + 1;
        }
        return num;
    }

    // To check if a number is a prime 
    public static boolean isPrime(int num) {
        boolean prime = true;
        for (int i = 2; i <= num/2; i++) { // any divisor more than half the number will return a number between 1 and 2
            if (num % i == 0) {
                prime = false;
                break;
            } 
        }
        return prime;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Prime number generated: " + getRandPrimeNum());
        }
    }
}