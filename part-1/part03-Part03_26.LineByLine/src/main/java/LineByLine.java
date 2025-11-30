import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String txt = scanner.nextLine();
            if (txt.equals("")) {
                break; // Exit the loop when input is empty
            }

            String[] splitResult = txt.split("\\s+"); // Handles multiple spaces
            for (String part : splitResult) {
                System.out.println(part);
            }
        }
    }
}
