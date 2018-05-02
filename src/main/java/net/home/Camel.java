package net.home;

interface Rideable { String getGait(); }
public class Camel implements Rideable {
    int weight = 2;
    String getGait() { return " mph, lope"; }//fail to implement
    void go(int speed) {
        ++speed; weight++;
        int walkrate = speed * weight;
        System.out.print(walkrate + getGait());
    }
    public static void main(String[] args) {
        new Camel().go(8);
    }
}