package org.example.section01;

import java.util.Scanner;

public class Test11 {

    public String solution(String str) {
        String answer = "";

        str = str + " ";
        int cnt = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            }
            else {
                answer = answer + str.charAt(i);
                if (cnt > 1) {
                    answer = answer + cnt;
                }
                cnt = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test11 T = new Test11();

        Scanner input = new Scanner(System.in);

        String str = input.next();
        System.out.println(T.solution(str));
    }
}
/**
 * 11. 문자열 압축
 *
 * 설명:
 * 알파벳 대문자로 이루어진 문자열을 입력받아
 * 같은 문자가 연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로
 * 문자열을 압축하는 프로그램을 작성하세요.
 *
 * 단, 반복 횟수가 1인 경우 생략합니다.
 *
 * 입력:
 * - 첫 줄에 문자열이 주어진다.
 * - 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력:
 * - 첫 줄에 압축된 문자열을 출력한다.
 *
 * 예시 입력 1:
 * KKHSSSSSSSE
 *
 * 예시 출력 1:
 * K2HS7E
 *
 * 예시 입력 2:
 * KSTTTSEEKFKKDJJGG
 *
 * 예시 출력 2:
 * KST3SE2KFK2DJ2G2
 */



