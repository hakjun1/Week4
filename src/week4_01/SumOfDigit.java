package week4_01;

public class SumOfDigit {
    public int solution(int n) {
        //n을 string으로 변경
        //String -> int -> String 좋은점수를 받기는 힘들다
        String str = String.valueOf(n);
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return result;
    }

    public int solution1(int n) {
        // %연산 이용 몫, 나머지
        //Currency 5만원권 몇개 1만원권 몇개
        int result = 0;
        int origin = n;

        //for문으로는 안된다 while문으로
        while (origin > 0) {
            result += origin%10;
            origin = origin/10;
            System.out.printf("origin: %d result: %d\n",origin,result);
        }
        return result;
    }

    public int solution2(int n) {
        int result = 0;
        //while(n>0){result += n%10; n/10}
        //한줄로 짤수도있지만 가독성면에서 비추(학습단계에서는 하면안됨)
        while (n > 0) {
            result += n%10;
            n = n/10;
        }
        return result;
    }
    public static void main(String[] args) {
        //687 = 6+ 8+7 = 21
        SumOfDigit sod = new SumOfDigit();
        int result1 = sod.solution2(1234);

        if (result1 == 10) {
            System.out.println("테스트 통과했습니다");
        } else {
            System.out.printf("테스트 실패 : %d \n",result1);
        }
    }
}
