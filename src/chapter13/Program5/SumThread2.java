package chapter13.Program5;

public class SumThread2 extends Thread{
    public static long sum;
    private  int start;
    private int end;

    public SumThread2(int start, int end){
        this.start=start;
        this.end=end;
    }

    @Override
    public void run() {
        long temp=0;
        for (int i=start;i<=end;i++){
            temp+=i;

        }
        sum+=temp;
    }
}
