package Homework_2.selfHW;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  TQ5_2.java
 *  get height for check ideal weight
 * @since 4-24-2023
 * @author Dounguk Kim
 */
public class TQ5_2{
    /**
     * 인풋을 입력받아 1, 또는 2 로 받아 성별을 정하고 setHeight()함수를 호출해서 저장된 성별 정보를 같이 보낸다.
     */
    public static void getGen() {
        int gen = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your gender? put number please \n1)male 2)female");
        while (true) {
            try {
                gen = sc.nextInt();
            } catch (InputMismatchException e) {

            }
            if (gen == 1 || gen == 2) {
                break;
            }
            else {
                System.out.println("put right number");
                sc.nextLine();
            }
        }
        setHeight(gen);
    }

    /**
     *  키를 받아서 다음 함수를 호출한다 호출하는 메소드에는 키 정보와 성별 정보를 파라미터로 보낸다
     * @param gen 성별 정보 1 남 2 여
     */
    public static void setHeight(int gen){
            int genn=gen;
            int height=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("your height?");
            while(true){
                try{
                    height=sc.nextInt();
                } catch (InputMismatchException e){
                    }
                if(height>0){
                    getIdeal(height,genn);
                    break;
                }
                else{
                    sc.nextLine();
                    System.out.println("put number");
                }
            }
        }

    /**
     * 키 정보와 성별 정보를 바탕으로 계산 후 출력한다.
     * @param height 전 함수에서 구한 키
     * @param gender 전전 함수에서 구한 성별
     */
    public static void getIdeal(int height, int gender){
        if (height<150 && gender==1){
            System.out.println(40);
        }
        else if(height<150 && gender==2){
            System.out.println(37.8);
        }
        else if (gender==1){
            System.out.println(40+0.89*(height-150));
        }
        else {
            System.out.println(37.8+0.75*(height-150));
        }
    }



    public static void main(String[] args){
        getGen(); //키와 나이를 받아서 계산하는 함수를 호출
    }
}
