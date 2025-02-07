package tutorials_java;

public class functions {
    public static void main(String[] args) {
        int first_number = 1;
        int second_number = 2;

        System.out.println(first_number + "+" + second_number + "=" + add(first_number, second_number));
        System.out.println(first_number + "-" + second_number + "=" + sub(first_number, second_number));
        System.out.println(first_number + "*" + second_number + "=" + multi(first_number, second_number));
        System.out.println(first_number + "/" + second_number + "=" + divide(first_number, second_number));

    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int multi(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

}
