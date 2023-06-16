package chapter13.Practice5;

public class SThread extends Thread{
    public static long sum;
    private int start;
    private int end;

    public SThread(int start,int end){
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
