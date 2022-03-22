package Wk09;

import java.util.Random;

public class RandomCharacter {

    public static char getRandomLowerCaseLetter() {
        int n = new Random().nextInt(26);
        char val = (char)(n + 97);
        return val;
    }

    public static char getRandomUpperCaseLetter() {
        char ch = (char) (Math.random() * 26 + 'A');
        return ch;
    }

    public static char getRandomDigitCharacter() {
        int randDigit = new Random().nextInt(10);
        char randDigitChar = Character.forDigit(randDigit, 10);
        return randDigitChar;
    }

    public static char getRandomCharacter() {
        String chars = "!\"#$%&\'()*+,-./";
        char randChar = chars.charAt(new Random().nextInt(chars.length()));
        return randChar;
    }

    public static void main (String[] args) {
        for (int i = 0; i < 15; i++) {
            System.out.println("Random lower case letter: " + getRandomLowerCaseLetter());
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("Random upper case letter: " + getRandomUpperCaseLetter());
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("Random digit character: " + getRandomDigitCharacter());
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("Random character: " + getRandomCharacter());
        }
    

    }
}

