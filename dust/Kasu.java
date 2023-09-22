import java.util.Scanner;

public class Kasu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while (input < 1000 || input > 9999) {
            System.out.print("四桁の整数を入力してください: ");
            input = scanner.nextInt();
        }
        System.out.println("入力された整数は " + input + " です。");
    }
}