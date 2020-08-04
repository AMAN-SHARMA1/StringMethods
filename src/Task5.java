import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t5 = sc.nextLine();
        char[] ch = t5.toCharArray();
        System.out.print("index: ");
        for (int i = 0; i < t5.length(); i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.print("chars: ");

        for (char c : ch) {
            System.out.print(c + "\t");
        }
    }
}
