import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Inserisci le lunghezze decimali dei lati del rettangolo");
        Scanner input = new Scanner(System.in);
        double l1 = Double.parseDouble(input.nextLine());
        double l2 = Double.parseDouble(input.nextLine());
        double p = perimetroRettangolo(l1,l2);
        System.out.println("Il perimetro del rettangolo è: " + p);
        System.out.println(" ");
        System.out.println("Inserisci un numero intero");
        int n = Integer.parseInt(input.nextLine());
        int b = pariDispari(n);
        if(b==0){
            System.out.println("Questo è un numero pari");
        } else {
            System.out.println("Questo è un numero dispari");
        }
        System.out.println(" ");
        System.out.println("Ora inserisci le lunghezze decimali dei lati di un triangolo");
        double lato1 = Double.parseDouble(input.nextLine());
        double lato2 = Double.parseDouble(input.nextLine());
        double lato3 = Double.parseDouble(input.nextLine());
        double peri = perimetroTriangolo(lato1,lato2,lato3);
        System.out.println("Il perimetro del triangolo è: " + peri);
        double area = areaTriangolo(lato1,lato2,lato3);
        System.out.println("L'area del triangolo è: " + area);
        System.out.println(" ");
        System.out.println("Arrivederci e grazie");
        input.close();
    }
    public static double perimetroRettangolo(double b,double h){
        return 2*(b+h);
    }
    public static int pariDispari(int num){
        if(num%2==0){
            return 0;
        }else {
            return 1;
        }
    }
    public static double perimetroTriangolo(double a, double b, double c){
        return a + b + c;
    }
    public static double areaTriangolo(double a, double b, double c){
        double p = a+b+c;
        double s = p/2;
        double molt = s*(s-a)*(s-b)*(s-c);
        double area = Math.sqrt(molt);
        return area;
    }

}
