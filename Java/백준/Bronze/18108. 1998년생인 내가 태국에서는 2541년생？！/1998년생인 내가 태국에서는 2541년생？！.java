import java.util.Scanner;

 //불기 연도를 서기 연도로 변환한 결과를 출력
 // 서기 = 불기 - 543
 // 불기 = 서기 + 543
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bool = sc.nextInt();
        int diff = 543;

        System.out.println(bool - diff);

    }
}