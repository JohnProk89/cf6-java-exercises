package chapter7strings;

/**
 * Encrypts a String
 */
public class Crypto {

    public static void main(String[] args) {

        //Declaration and Initialization
        String testString = "abc";
        int[] asciiArrayForm = new int[testString.length()];
        StringBuilder encryptedString = new StringBuilder();

        //Calculations
        for (int i = 0; i < testString.length(); i++) {
            asciiArrayForm[i] = testString.charAt(i);
            asciiArrayForm[i]++;
            encryptedString.append((char) asciiArrayForm[i]);
        }

        //Printing Results
        System.out.println("Initial string: " + testString);
        System.out.println("Encrypted string: " + encryptedString);
    }
}
