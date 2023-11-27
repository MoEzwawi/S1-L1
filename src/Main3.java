import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Inserisci le lunghezze decimali dei lati del rettangolo");
        Scanner input = new Scanner(System.in);
        double l1 = Double.parseDouble(input.nextLine());
        double l2 = Double.parseDouble(input.nextLine());
        double p = perimetroRettangolo(l1,l2);
        System.out.println("Il perimetro è: " + p);

    }
    public static double perimetroRettangolo(double b,double h){
        return 2*(b+h);
    }
}
