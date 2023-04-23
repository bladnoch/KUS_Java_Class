package Homework_2.selfHW;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TQ4 {

        final static int ARRLEN = 8;

        /**
         * start bubble sort with array arr, and number of values-1
         *
         * @param arr
         */
        public static void bubbleSort(int[] arr) {
            bubbleSort(arr, ARRLEN - 1);
        }

        /**
         * swap the values for sort
         * 정렬을 위해 값들을 스왑한다.
         *
         * @param arr
         * @param lastArr
         */
        public static void bubbleSort(int[] arr, int lastArr) {
            int temp = 0;
            if (lastArr > 0) {
                for (int i = 1; i <= lastArr; i++) {
                    if (arr[i - 1] > arr[i]) {
                        temp = arr[i - 1];
                        arr[i - 1] = arr[i];
                        arr[i] = temp;
                    }
                }
                bubbleSort(arr, lastArr - 1); //lastArr이 하나씩 줄면서 나중엔 루프가 종료
            }

        }

        /**
         * print sorted array
         * 솔트된 배열을 프린트한다.
         *
         * @param arr
         */
        public static void printArr(int[] arr) {
            for (int i = 0; i < ARRLEN; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        /**
         * get 8 integers and return not sorted array
         * 정수 8개를 입력받고 입력받은 정리안된 배열을 리턴한다.
         *
         * @return arr
         */
        public static int[] makeArr() {
            int[] arr = new int[ARRLEN];
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < ARRLEN; i++) {
                try {
                    System.out.print("정수 입력 : ");
                    arr[i] = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Input value is not Integer, Please try it again!");
                    sc.nextLine();
                    i--;
                }
            }
            return arr;
        }

        public static void main(String[] args) {
            int[] arr = makeArr();
            bubbleSort(arr);
            printArr(arr);

        }

}
