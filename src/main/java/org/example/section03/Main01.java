package org.example.section03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main01 {

    public ArrayList<Integer> solution(int n, int[] arrA, int m, int[] arrB) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while (p1 < n && p2 < m) {
            if (arrA[p1] < arrB[p2]) {
                answer.add(arrA[p1++]);
            }
            else {
                answer.add(arrB[p2++]);
            }
        }

        while (p1 < n) {
            answer.add(arrA[p1++]);
        }

        while (p2 < m) {
            answer.add(arrB[p2++]);
        }



        return answer;
    }

    public static void main(String[] args) {
        Main01 T = new Main01();

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = input.nextInt();
        }

        int m = input.nextInt();
        int[] arrB = new int[m];
        for (int i = 0; i < m; i++) {
            arrB[i] = input.nextInt();
        }

        for (int x : T.solution(n, arrA, m, arrB)) {
            System.out.print(x + " ");
        }
    }
}
/**
 * 1. 두 배열 합치기
 *
 * 설명
 * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
 * 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
 * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
 * 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
 *
 * 출력
 * 오름차순으로 정렬된 배열을 출력합니다.
 *
 * 예시 입력 1
 * 3
 * 1 3 5
 * 5
 * 2 3 6 7 9
 *
 * 예시 출력 1
 * 1 2 3 3 5 6 7 9
 */

