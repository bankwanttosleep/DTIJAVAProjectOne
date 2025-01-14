package com.sau.tech;

public class MyClass01 {
    public static void met1() {
        System.out.println(111);
    }
    //public static void main(String[] args) {
    //static public void main(String[] args) {
    //static public void main(String args[]) {
    public static void main(String[] args) {
        System.out.println("AAAA");
        System.out.println("BBBB");
        met1();
        met1();
        met2();
    }

    public static void met2() {
        System.out.println(222);
    }
}


