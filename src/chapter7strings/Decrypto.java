package chapter7strings;

/**
 * Decrypts a String
 */
public class Decrypto {

    public static void main(String[] args) {

        //Declaration and Initialization
        String encryptedString = "BCD";
        int[] asciiArrayForm = new int[encryptedString.length()];
        StringBuilder decryptedString = new StringBuilder();

        //Calculations
        for (int i = 0; i < encryptedString.length(); i++) {
            asciiArrayForm[i] = encryptedString.charAt(i);
            asciiArrayForm[i]--;
            decryptedString.append((char) asciiArrayForm[i]);
        }

        //Printing Results
        System.out.println("Encrypted string: " + encryptedString);
        System.out.println("Decrypted string: " + decryptedString);

    }
}
