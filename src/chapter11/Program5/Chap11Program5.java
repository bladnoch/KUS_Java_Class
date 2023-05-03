package chapter11.Program5;

public class Chap11Program5 extends Calculator{ // 

    public static void main(String[] args){
        Chap11Program5 in =new Chap11Program5();
        System.out.println(in.add(1,2));
        System.out.println(in.subtract(2,3));
        System.out.println(in.average(new int[] {1,3,4,5,3}));
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public double average(int[] a) {
        double sum=0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum/a.length;
    }
}
