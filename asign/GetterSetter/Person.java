public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String []args){
        Person p1 = new Person();
        p1.setName("Rohit sharma");
        String name = p1.getName();
        System.out.println(name);
        p1.setAge(36);
        int age = p1.getAge();
        System.out.println(age);

    }
}
