public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        checkNumber(45);
    }
    public static void checkNumber(int num) {
        if (num > 0) System.out.println("positive");
        else if (num < 0) {
            System.out.println("negative");
        } else System.out.println("is zero");
    }

}