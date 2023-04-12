package chapter9;
/**
 * Chap9Program3.java
 * Creat v object with vector
 * @since 2023-04-12
 * @author Dounguk Kim
 */
import java.util.Vector;

public class Chap9Program3 {
    public static void main(String[] args){
        Vector<Integer> v=new Vector<>();

        v.add(5);
        v.add(4);
        v.add(-1);

        v.add(2,100); //인덱스에 두번째에 100을 추가하고 나머지 요소는 뒤로 밀려난다.

        System.out.println("# of element "+ v.size());
        System.out.println("capacity of vector "+v.capacity()); //
        for (int i=0;i<v.size();i++){
            int n = v.get(i);
            System.out.println(n);
        }

    }
}
