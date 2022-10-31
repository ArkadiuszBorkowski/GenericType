import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class NumbersReaders {
    public static void main(String[] args) {
        final String filename = "numbers.txt";

        try (
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        ) {
            int num1 = Integer.parseInt(br.readLine());
            int num2 = Integer.parseInt(br.readLine());
            int num3 = Integer.parseInt(br.readLine());

            BigInteger aBig = new BigInteger(br.readLine());
            BigInteger aBig2 = new BigInteger(br.readLine());

            System.out.println("a+b+c = " + (num1 + num2 + num3));
            System.out.println("aBig+bBig = " + aBig.add(aBig2));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
