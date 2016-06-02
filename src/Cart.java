public class Cart {

    public static void sayGoodbye() {
        System.out.println("Thanks for using Famazon Cart!");
    }

    public void sayHello() {
        System.out.println("Famazon Cart v 1.0 *started*");
    }

    public static void main(String[] arguments) {
        sayHello();
        boolean doWeHaveArguments = false;
        //String argsLength = arguments.length.toString();
        // bad code, fixing below
        int length = arguments.length;
        for (int counter = 0; <= arguments.length; counter ++)
        {System.out.println(counter arguments )
        if (length >= 1) {
            doWeHaveArguments = true;
        }

        if (doWeHaveArguments = true) {
            // if true, let the user know
            // awesome but they are not needed
            System.out.println("Thanks but we don't need arguments");
        } else {
            // otherwise let them know thanks
            // for not spamming
            System.out.println("Thanks for not spamming! :)");
        }
    }

}