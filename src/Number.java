import java.util.*;

public class Number {
    public static void main(String[] args){
        HashMap<String,String> a=new HashMap();

        a.put("24-1","https://www.youtube.com/watch?v=BfcXoB9y4rc");
        a.put("24-2","https://www.youtube.com/watch?v=BfcXoB9y4rc");
        a.put("24-3","https://www.youtube.com/watch?v=BfcXoB9y4rc");
        a.put("24-4","https://www.youtube.com/watch?v=BfcXoB9y4rc");
        a.put("25","https://youtu.be/VOLy6JxEDLw?t=9");
        a.put("26","https://youtu.be/PGFs7n6n3-8?t=1084");
        a.put("27","https://youtu.be/XqLkbg62dLg?t=1092");
        a.put("29","https://www.youtube.com/watch?v=S4Bo2ho37iA");
        a.put("30","https://www.youtube.com/watch?v=TgBz7LnvUaQ");
        a.put("33","https://www.youtube.com/watch?v=K2snTkaD64U");
        a.put("36","https://www.youtube.com/watch?v=Szdziw4tI9o");
        a.put("37","https://www.youtube.com/watch?v=fx6i7sXcRqo");
        a.put("18"," https://www.youtube.com/watch?v=dsiaT8gmjYY");

        Set<String >keySet=a.keySet();
        List<String> keys=new ArrayList<>(keySet);

        Collections.shuffle(keys);

        for (String key : keys) {
            System.out.println(key + " : " + a.get(key));
        }

    }









}
