import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 //첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int C = Integer.parseInt(str[2]);

        System.out.println( (A+B)%C );
        System.out.println( (A%C + B%C) % C);
        System.out.println( (A*B)%C );
        System.out.println( (A%C * B%C) % C);
    }
}