package chapter11.Self11;
/*
        자동차가 있다.
        - 바퀴의 크기
        - 차의 타입
        - 차의 색
        - 차의 가격
        을 받는 변수가 있다.
        내 자동차 클래스에 변수의 값을 설정하고 출력하라
        매인 클래스는 따로 만들어야 한다.
 */
public class P1Self {
    public static void main(String[] args){
        CustomCar myCar=new CustomCar();
        myCar.setAll();
        myCar.printAll();
    }
}