package net.home;




public class Chapter2Question4 {

    public static void main (String[] args){
        Boolean buy = new Boolean(true);
        Boolean sell = new Boolean(true);
        System.out.println(buy ==sell);   //false
        Boolean buyPrim=buy.booleanValue();
        System.out.print(!buyPrim);  //false
        System.out.print(buy && sell);  //true
    }
}
