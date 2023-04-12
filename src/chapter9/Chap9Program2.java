package chapter9;
/**
 * Chap9Program2.java
 * to learn treemap, arraylist to creat and using it
 * @since 2023-04-12
 * @author Dounguk Kim
 */
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Chap9Program2 {
    public static void main(String[] args){
        Map catalog;
        catalog=new TreeMap();
        ArrayList keys=new ArrayList();
        ArrayList values=new ArrayList();


//          같은 정보를 맵으로 구현
        catalog.put("CS101","Intro java programing" );
        catalog.put("CS301","Database design" );
        catalog.put("CS413","Software design for mobile devices" );


//        같은 정보를 어레이 리스트로 구현
        keys.add("CS101");
        keys.add("CS301");
        keys.add("CS413");

        values.add("Intro java programing");
        values.add("Database design");
        values.add("Software design for mobile devices");


        if (catalog.containsKey("CS101")){
            System.out.println("we teach java this semester");
        }
        else {
            System.out.println("no java courses this semester");
        }

        if(keys.contains("CS101")){
            System.out.println("we teach java this semester");
        }
        else {
            System.out.println("no java courses this semester");
        }


    }
}
