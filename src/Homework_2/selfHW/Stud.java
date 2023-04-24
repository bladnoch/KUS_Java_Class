package Homework_2.selfHW;

public class Stud {
    /**
     * 정수 2개짜리
     * @param firstNum 정수1
     * @param secondNum 정수2
     * @return 더한 값
     */
    public int getSums(int firstNum, int secondNum) {

        return firstNum+secondNum;
    }

}
class Stud2 extends Stud {
    /**
     * 3개짜리
     * @param firstNum 정수1
     * @param secondNum 정수2
     * @param thirdNum 정수3
     * @return 더한 값
     */
    public int getSums(int firstNum, int secondNum, int thirdNum) {

        return firstNum+secondNum+thirdNum;
    }

}

class Stud3 extends Stud2 {
    /**
     *  정수 배열 받는 메소드
     * @param nums 모든 정수 배열
     * @return 모든 정수 더한 값
     */
    public int getSums(int[] nums) {
        int temp=0;
        for (int i=0; i<nums.length;i++){
            temp+=nums[i];
        }
        return temp;
    }

}
class Stud4 extends Stud3 {
    /**
     * 모든 실부 받는 곳
     * @param nums 모든 실수
     * @return 모든 실수 더한 값
     */
    public double getSums(double[] nums){
        double temp=0;
        for (int i=0; i<nums.length;i++){
            temp+=nums[i];
        }
        return temp;
    }
}
