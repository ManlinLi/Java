package net.home;

public class Gamma extends Beta {
    String getType() {
        return "gamma";
    }
    public static void main(String[] args) {
        Gamma g1 = new Alpha();//fail
        Gamma g2 = new Beta();//fail
        System.out.println(g1.getType() + " "+ g2.getType());
    } }
