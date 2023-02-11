public class Encryption {
    public String Encrypt(String plainText, int shift) {

        int StrLength = plainText.length();
        String cipherText = "";

        // shift number is greater than 26 (length of english alphabets then take
        // modulus and make it single digit)
        if (shift > 26) {
            shift = shift % 26;
        }
        // shift number is less than 0 take modulus and make it single digit and add 26
        else if (shift < 0) {
            shift = (shift % 26) + 26;
        }
        // for every char iterate
        for (int index = 0; index < StrLength; index++) {
            // take curr indexed plaintext char
            char currChar = plainText.charAt(index);
            // if its an alphabet then shift it else no change in special characters or
            // numbers
            if (Character.isLetter(currChar)) {
                // for lover case alphabets ASCII 97 - 122
                if (Character.isLowerCase(currChar)) {
                    char cipherChar = (char) (currChar + shift);
                    // the new char is out of bound of ascii alphabets the start over
                    if (cipherChar > 'z') {
                        cipherText += (char) (currChar - (26 - shift));
                    } else {
                        cipherText += cipherChar;
                    }
                }
                // for uppercase alphabets ASSCI 65 - 90
                else if (Character.isUpperCase(currChar)) {
                    char cipherChar = (char) (currChar + shift);
                    // the new char is out of bound of ascii alphabets the start over
                    if (cipherChar > 'Z') {
                        cipherText += (char) (currChar - (26 - shift));
                    } else {
                        cipherText += cipherChar;
                    }
                }
            } else {
                cipherText += currChar;
            }
        }
        return cipherText;
    }
}
