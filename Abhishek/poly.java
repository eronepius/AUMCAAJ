class A {
    int a = 5;
    int b = 6;
    
  public void operation() {
    System.out.println(a+b);
  }
}

class B extends A {
  public void operation() {
    System.out.println(a*b);
  }
}

class C extends A {
  public void operation() {
    System.out.println(a-b);
  }
}

class poly{
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();
    
    a.operation();
    b.operation();
    c.operation();
  }
}