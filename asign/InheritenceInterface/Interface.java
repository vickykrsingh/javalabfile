interface Printable {
    void print();
}

interface Showable {
    void show();
}

class MyClass implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void show() {
        System.out.println("Showing...");
    }
}

public class Interface{
    public static void main(String []args){
        MyClass c1 = new MyClass();
        c1.print();
        c1.show();
    }
}