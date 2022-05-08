package com.ikennascode;

public class Polymorphism {

    static class Bird {
        public void sing(){
            System.out.println("tweet tweet tweet");
        }
    }

    static class Robin extends Bird{
        public void sing(){
            System.out.println("robiiiiiiiiiindllllle");
        }
    }


    public static void main(String[] args){
//        Bird b = new Bird();
        Robin b = new Robin();
        b.sing();


    }
}
