package flippadcipher;
import java.util.*;

public class FlipPadCipher {
    public static void main(String[] args) {
        // Example usage of textToBinary method
        String myS = "2";
        System.out.println(textToBinary(myS));
        String mySS = "00110010";
        System.out.println(binaryToText(mySS));

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the text to be encrypted
        System.out.println("Enter the text to be encrypted: ");
        String text = sc.nextLine();

        // Prompt user to enter the key
        System.out.println("Enter the key: ");
        String key = sc.nextLine();

        // Check if text or key is empty
        if (text.isEmpty() || key.isEmpty()) {
            System.out.println("Error: Text and key must not be empty.");
            return;
        }

        // Encrypt the text using the key
        String encrypted = encrypt(text, key);
        System.out.println("Encrypted text: " + encrypted);

        // Decrypt the encrypted text using the key
        System.out.println("Decrypted text: " + decrypt(encrypted, key));
    }

    // Method to encrypt the text using the key
    private static String encrypt(String text, String key) {
        String textBinary = textToBinary(text); // Convert text to binary
        String keyBinary = textToBinary(key); // Convert key to binary
        String xorResult = xor(textBinary, keyBinary); // XOR the binary text and key
        return xorResult;
    }

    // Method to decrypt the encrypted text using the key
    private static String decrypt(String encrypted, String key) {
        String keyBinary = textToBinary(key); // Convert key to binary
        String xorResult = xor(encrypted, keyBinary); // XOR the encrypted text and binary key
        return binaryToText(xorResult); // Convert the result back to text
    }

    // Method to convert text to binary representation
    private static String textToBinary(String text) {
        StringBuilder binary = new StringBuilder();
        for (char c : text.toCharArray()) {
            binary.append(String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0')); // Convert each character to 8-bit binary
        }
        return binary.toString();
    }

    // Method to convert binary representation back to text
    private static String binaryToText(String binary) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 8) {
            String byteString = binary.substring(i, i + 8); // Get 8-bit binary string
            char c = (char) Integer.parseInt(byteString, 2); // Convert binary string to character
            text.append(c);
        }
        return text.toString();
    }

    // Method to perform XOR operation on two binary strings
    private static String xor(String textBinary, String keyBinary) {
        StringBuilder extendedKey = new StringBuilder();
        while (extendedKey.length() < textBinary.length()) {
            extendedKey.append(keyBinary); // Extend the key to match the length of the text
        }
        keyBinary = extendedKey.substring(0, textBinary.length());

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < textBinary.length(); i++) {
            char textBit = textBinary.charAt(i);
            char keyBit = keyBinary.charAt(i);
            result.append(textBit == keyBit ? '0' : '1'); // XOR each bit of text and key
        }
        return result.toString();
    }
}
