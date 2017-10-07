package com.learning.day7;

/**
 * Created by kavin on 07/10/17.
 */
public class Main {
    public static class Ex extends Exception{

    }
    public static class Ex2 extends RuntimeException{

    }

    // Exception is modern goto
    public static void main(String args[]){
        try {
            divideByZero();
        }catch (ArithmeticException e){
            //tell user or some entity something went wong
            //try to gracefully degrade like: closing files, resource release, etc... // do it in finally that is better
            //handle the error (only error no domain logic)
            //Important "don't use it as a control flow"
            //Catch block should not be empty its a bad practice
            System.out.println("Try a different number");
        }
    }

    public static Integer divideByZero(){
        //reads a file
        //writes into a file
//        int i = 1/0;
        String j = null;
        throw new Ex2();
    }
}
