package org.example.section02;

import java.util.Scanner;

public class Main04_02 {

    public void solution(int n) {
        int a = 1;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Main04_02 T = new Main04_02();

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        T.solution(n);
    }
}
/**
 * 4. 피보나치 수열
 *
 * 설명
 * 1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 *
 * 입력
 * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 *
 * 출력
 * 첫 줄에 피보나치 수열을 출력합니다.
 *
 * 예시 입력 1
 * 10
 *
 * 예시 출력 1
 * 1 1 2 3 5 8 13 21 34 55
 */
