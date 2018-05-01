package net.home;

public class TestQ12 {
    public static void main(String args[]){
        Q12 p1 = new Q12("John" , 22);
        TestQ12 te = new TestQ12();
        Q12 p2 = te.change(p1);
        System.out.println(p2.pid +" "+p2.name+ " "+p2.age);
        System.out.print(p1.pid +" "+p1.name+" "+ p1.age);
        }
     private Q12 change(Object o){
         Q12 p2 = (Q12)o;
        p2.age = 25;
        return p2;
        }
}
