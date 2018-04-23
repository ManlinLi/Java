package net.home;




public class Chapter2Questions {

    public static void main (String[] args){
        char a='a';
        char b=-10;//fail to compile
        char c='1';
        integer d= 1000;//fail to compile
        System.out.println(++a + b++ * c - d);//fail to compile
    }
}
//negative can't assign to char
//int or Integer
//d failed to compile