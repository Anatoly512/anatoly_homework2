import java.util.Scanner;

public class inputData {

    public static String stringInput () {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        return name;
    }


    public static int numberInput () {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        return number;
    }
}

