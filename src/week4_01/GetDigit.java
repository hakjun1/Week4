package week4_01;

import java.util.Scanner;

public class GetDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        while (n > 0) {//자릿수 합계와 비슷하게
            n = n/10;//1234 = 123, 123 = 12, 12 = 1 , 1 = 0 총4번
            cnt += 1;
        }
        System.out.println(cnt);
    }
}
