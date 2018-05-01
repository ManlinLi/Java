package net.home;

public class MockExam {
    public static void main(String[] args) {
        int x = 0, y=10;
       try{
           y /=x;
       }
       System.out.print("/ by 0");
       catch(Exception e){  //error
         System.out.print("error");
       }
    }
}
