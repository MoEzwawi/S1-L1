import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Please write three strings and press Enter after each time");
        Scanner input = new Scanner(System.in);

        String s1 = input.nextLine();
        String s2 = input.nextLine();
        String s3 = input.nextLine();

        System.out.println("Direct order: " + s1 + " " + s2 + " " + s3);
        System.out.println("Reverse order: " + s3 + " " + s2 + " " + s1);
    }
}
