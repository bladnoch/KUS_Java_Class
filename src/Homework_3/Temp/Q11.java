package Homework_3.Temp;

public class Q11 {
    public static void main(String[] args){
        Students[] temp=new Students[10];
        for(int i=0;i<10;i++){
            temp[i]=new Students();
            System.out.println(temp[i].getStudentID()+"\n"+temp[i].isMale());

        }
    }
}
