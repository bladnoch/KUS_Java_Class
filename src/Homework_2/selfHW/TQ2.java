package Homework_2.selfHW;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * TQ2.java
 * get numbers and print max, and average value
 * @since 4/23/2023
 * @author Dounguk Kim
 */
public class TQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10]; // 최대 10개의 숫자를 저장할 수 있는 배열
        int count = 0; // 입력된 숫자의 개수
        int sum = 0; // 숫자의 합

        while (count < 10) {
            try {
                int number = scanner.nextInt();
                numbers[count] = number;
                count++;
                sum += number;
            } catch (InputMismatchException e) {
                System.out.println("숫자가 아닙니다. 입력을 종료합니다.");
                break;
            }
        }

        if (count == 0) {
            System.out.println("입력된 숫자가 없습니다.");
        } else {
            int max = numbers[0];
            for (int i = 1; i < count; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            double average = (double) sum / count;
            System.out.println("평균: " + average);
            System.out.println("최대값: " + max);
        }
    }

}
