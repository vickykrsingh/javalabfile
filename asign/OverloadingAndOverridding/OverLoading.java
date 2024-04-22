public class OverLoading {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public OverLoading() {
        System.out.println("Default constructor called");
    }

    public OverLoading(int num) {
        System.out.println("Parameterized constructor called with value: " + num);
    }

    public static void main(String []args){
        OverLoading ele1 = new OverLoading();
        OverLoading ele2 = new OverLoading(2);
        double res1 = ele1.add(24.5,22.1);
        int res2 = ele1.add(12, 14);
        double res3 = ele2.add(43.5,63.8);
        int res4 = ele2.add(54, 92);
        System.out.println(res1+"\n"+res2+"\n"+res3+"\n"+res4);
    }
}

