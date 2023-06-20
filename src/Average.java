import java.util.InputMismatchException;
import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("My score : ");
        int myScore=sc.nextInt();
        double above=0;
        int aCount=0;
        double total=0;

        while(true){
            System.out.println("Score : ");
            try{
                above=sc.nextDouble();
                total+=above;
                if(above>myScore){
                    aCount++;
                }
                count++;
                System.out.println("total student : "+count);
            } catch (InputMismatchException e){

                System.out.println("average : "+(total/count)+"\nmy score : "+myScore);
                System.out.println("total student : "+count+" \nabove me : "+aCount);
                break;
            }

        }



    }
}
