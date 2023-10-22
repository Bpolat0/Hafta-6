import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("src/numbers.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int sum = 0;
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                sum += Integer.parseInt(line);
            }
            System.out.println("Sayıların Toplamı : " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}