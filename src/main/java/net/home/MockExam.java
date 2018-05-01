package net.home;

public class MockExam {
    static int x = 10;
    public static void main(String[] args) {
        int x = 10;
        int y = new MockExam().change(x);
        System.out.print(x+y);
    }
        int change(int x){
        x=12;
        return x;
        }
    }

