import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {

            FileReader fileReader = new FileReader("src/notepad.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            System.out.println("Dosya da yazanlar :");

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
            bufferedReader.close();

            FileWriter fileWriter = new FileWriter("src/notepad.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Lütfen yazmak istediğiniz metni giriniz!");
            String userInput = input.nextLine();

            fileWriter.write(userInput + "\n");
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
