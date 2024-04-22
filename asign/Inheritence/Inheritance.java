class Parent extends Grandparent {
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class method");
    }
}

class Grandparent {
    void print() {
        System.out.println("Grandparent class method");
    }
}

class Child1 extends Parent {
    void show1() {
        System.out.println("Child1 class method");
    }
}

class Child2 extends Parent {
    void show2() {
        System.out.println("Child2 class method");
    }
}


public class Inheritance{
    public static void main(String []args){
        Child c1 = new Child();
        c1.display(); // accessing parent method
        c1.show();
        Parent p1 = new Parent();
        p1.print(); // accessing grand parent method
        
    }
}