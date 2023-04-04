package Homework_1;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
        JavaQ6.java
        print season by today's month
        4-4-2023
        Dounguk Kim
 */
public class JavaQ6 {
    public static void main(String[] args){
        Date today=new Date();
        SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
        int m=Integer.parseInt(date.format(today).substring(5,7));
//        System.out.println(Integer.parseInt(date.format(today).substring(5,7)));

        if (m>=3 && m<=5){
            System.out.println("봄");
        }
        else if(m>=6 && m<=8){
            System.out.println("여름");
        }
        else if(m>=9 && m<=11){
            System.out.println("가을");
        }
        else {
            System.out.println("겨울");
        }

    }
}
