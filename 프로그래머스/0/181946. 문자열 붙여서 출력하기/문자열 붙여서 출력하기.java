import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String orgStr = sc.nextLine();
        String newStr = orgStr.replaceAll(" ", "");

        System.out.println(newStr);

    }
}