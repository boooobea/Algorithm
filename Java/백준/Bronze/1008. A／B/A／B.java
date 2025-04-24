import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextInt();
        double num2 = sc.nextInt();

        double total = num1 / num2;
        System.out.println(total);
    }
}