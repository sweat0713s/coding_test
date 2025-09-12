package org.example.section01;

import java.util.Scanner;

public class Test03_02 {

    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > max) {
                max = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }

        // while문에서는 마지막 공백기준으로만 동작하기 때문에 마지막 처리 필요
        if(str.length() > max){
            answer = str;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test03_02 T = new Test03_02();

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        System.out.println(T.solution(str));
    }
}
/**
 * 3. 문장 속 단어
 *
 * 설명:
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장 속의 각 단어는 공백으로 구분됩니다.
 *
 * 입력:
 * - 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어진다.
 * - 문장은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력:
 * - 첫 줄에 가장 긴 단어를 출력한다.
 * - 가장 길이가 긴 단어가 여러 개인 경우, 문장에서 가장 앞쪽에 위치한 단어를 출력한다.
 *
 * 예시 입력 1:
 * it is time to study
 *
 * 예시 출력 1:
 * study
 */
