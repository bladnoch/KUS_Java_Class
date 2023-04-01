package chapter6;
/*
    Chap6Program1.java
    calc. average grade of the student
    3-28-2023
    Dounguk Kim
 */

public class Chap6Program1 {
    public static void main(String[] args){
        double score[][]={{3.3,3.4},{3.5,3.6},{3.7,2.0},{4.1,4.2}};
        double sum=0;

        for(int year=0;year<score.length;year++){
            for(int term=0;term<score[year].length;term++){
                sum+=score[year][term];
            }
        }

        for (int i=0;i<score[0].length;i++){
            System.out.println(score[i][0]);
        }

        int years=score.length;         //information of year
        int semester= score[0].length;     //number of semester in year
        System.out.println("ave grade:"+sum/(years*semester));
    }

}
