package chapter6;

/*
    Chap6Program3.java
    put values in array by method
    3-28-2023
    Dounguk Kim
 */


public class Chap6Program3 {
    public static void main(String[] args){
        int[] arr;  //어레이 생성
        arr=array();    //어레이 메소드에 연결

//        output
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static int[] array(){    //어레이에 숫자 넣고 리턴
        int[] arra=new int[4];
        for(int i=0;i<arra.length;i++){
            arra[i]=i;
        }
        return arra;
    }
}
