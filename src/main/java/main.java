import java.util.Scanner;

public class main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите фразу");
            String word = scanner.nextLine();

            Obed.Obed(word);
        }
    }

