package Homework_3.Temp;

import javax.swing.*;



public class Q11 {
    private JFrame frame;
    public Q11(){
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

    public static void main(String[] args){
        Students[] temp=new Students[10];
        for(int i=0;i<10;i++){
            temp[i]=new Students();
            System.out.println(temp[i].getStudentID()+" : "+(temp[i].isMale()? "male":"female"));
            System.out.println("height: "+temp[i].getHeight()+"\nweight: "+temp[i].getWeight());
            System.out.println(" ");
        }
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Q11();
            }
        });
    }
}
