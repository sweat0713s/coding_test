package org.example.section01;

import java.util.Scanner;

public class Test05 {

    public String solution(String str) {
        String answer;

        char[] arr = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while (lt < rt) {
            if(!Character.isAlphabetic(arr[lt])) {
                lt++;
            }
            else if(!Character.isAlphabetic(arr[rt])) {
                rt--;
            }
            else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(arr);

        return answer;
    }

    public static void main(String[] args) {
        Test05 T = new Test05();

        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(T.solution(str));
    }
}
/**
 * 5. 특정 문자 뒤집기
 *
 * 설명:
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면
 * 영어 알파벳만 뒤집고, 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 * 입력:
 * - 첫 줄에 길이가 100을 넘지 않는 문자열이 주어진다.
 *
 * 출력:
 * - 첫 줄에 알파벳만 뒤집힌 문자열을 출력한다.
 *
 * 예시 입력 1:
 * a#b!GE*T@S
 *
 * 예시 출력 1:
 * S#T!EG*b@a
 */
