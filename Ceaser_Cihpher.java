import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Ceaser_Cihpher {
    public static void main(String[] args) {

        Encryption encrypiton = new Encryption();

        Decryption decrypiton = new Decryption();

        try {
            File file = new File("text.txt");
            Scanner myReader = new Scanner(file);

            int shift = 3;
            // String text = "hey there neha here";

            while (myReader.hasNextLine()) {
                String text = myReader.nextLine();
                String cipher = encrypiton.Encrypt(text, shift);

                String plain = decrypiton.Decrypt(cipher, shift);

                System.out.println("   FILE TEXT = ");
                System.out.println(
                        "------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println(text);
                System.out.println(" CIPHER TEXT = ");
                System.out.println(
                        "------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println(cipher);
                System.out.println("  PLAIN TEXT = ");
                System.out.println(
                        "------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println(plain);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}
