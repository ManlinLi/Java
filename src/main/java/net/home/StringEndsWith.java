package net.home;

public class StringEndsWith {
    public static void main(String[] args) {

        String strOrig = "Hello World";

        if(strOrig.endsWith("World")){
            System.out.println("String ends with World");
        }else{
            System.out.println("String does not end with World");
        }

        String str = "Hello World";

        //length() method of String returns the length of a String.
        int length = str.length();
        System.out.println("Length of a String is : " + length);

        String strOriginal = "Hello World";
        System.out.println("Original String : " + strOriginal);

        strOriginal = new StringBuffer(strOriginal).reverse().toString();

        System.out.println("Reversed String : " + strOriginal);
    }
}

