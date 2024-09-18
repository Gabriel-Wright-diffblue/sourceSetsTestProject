package org.example;

public class Main {
       public static void main(String[] args) {
              System.out.println("Hello world!");
              Main main = new Main();
              System.out.println("3*2:"+main.multiply(3,2));
       }

       private int multiply(int a, int b) {
              return a * b;
       }
}