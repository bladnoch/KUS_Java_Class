package chapter9;

import java.util.Iterator;
import java.util.Vector;

/**
 * Chap9Program4.java
 * use iterater instade of for loop
 * @since 2023-04-12
 * @author Dounguk Kim
 */

public class Chap9Program4 {
    public static void main(String[] args){
        Vector<Integer> v=new Vector<>();

        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2,100); //인덱스에 두번째에 100을 추가하고 나머지 요소는 뒤로 밀려난다.

        Iterator<Integer> it=v.iterator();

        while(it.hasNext()){
            int n = it.next();
            System.out.println(n);
        }

    }
}
