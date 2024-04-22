public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println("Number of command line arguments: " + args.length);
        System.out.println("Arguments are:");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
