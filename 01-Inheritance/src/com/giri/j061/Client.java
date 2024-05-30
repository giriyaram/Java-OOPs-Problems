package com.giri.j061;

class Parent{
    int a= 100;
    int b= 200;
}

class Child extends Parent{
    int a =10;
    int b=20;

    public void display(){
        System.out.println("Current class elements retrieved using 'this' keyword");
        System.out.println(this.a);
        System.out.println(this.b);

        System.out.println("Super class elements retrieved using 'super' keyword");
        System.out.println(super.a);
        System.out.println(super.b);
    }
}
public class Client {
    public static void main(String[] args) {

        new Child().display();
    }
}
