package com.driver;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(a.meth());
        System.out.println(b.meth());
    }
  static class A{
      public String meth(){
          return "Invoking method from class A";
      }
  }

  static class B extends A{
        @Override
      public String meth(){
          return "Method is overridden in Extendend class B";
      }
  }
}