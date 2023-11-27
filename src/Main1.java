import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main1 {
    public static void main(String[] args) {

        System.out.println("Hello and welcome, my dear users!");
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        //primo esercizio
        System.out.println("Please insert the first integer and press Enter");
        int primoNumero = Integer.parseInt(input.nextLine());
        System.out.println("Please insert the second integer and press Enter");
        int secondoNumero = Integer.parseInt(input.nextLine());
        int res = moltiplica(primoNumero,secondoNumero);
        System.out.println("The result of multiplication is: " + res);
        System.out.println(" ");
        // secondo esercizio
        System.out.println("Please insert a string of your choice and press Enter");
        String myString = input.nextLine();
        System.out.println("Please insert a number of your choice and press Enter");
        double randomNumber = Double.parseDouble(input.nextLine());
        String resultString = concatena(myString,randomNumber);
        System.out.println("Result of the concatenation: " + resultString);

        //terzo esercizio
        String[] arrayDiStringhe ={"Welcome ","dear ",", nice to ","meet ","you!"};
        System.out.println("Please insert your name");
        String userName = input.nextLine();
        String[] welcomeMessageArray = inserisciInArray(arrayDiStringhe,userName);
        String welcomeMessage=arrayToString(welcomeMessageArray);
        System.out.println(welcomeMessage);

    }

    public static int moltiplica(int num1,int num2){
        return num1*num2;
    }
    public static String concatena(String s,double d){
        return s + d;
    }

    public static String[] inserisciInArray(String[] a,String b){
        String[] result =new String[6];
        result[0]=a[0];
        result[1]=a[1];
        result[2]=b;
        result[3]=a[2];
        result[4]=a[3];
        result[5]=a[4];
        return result;
    }

    public static String arrayToString(String[] arr){
        String result = "";
        for (int i=0;i<arr.length;i++){
            result += arr[i];
        }
        return result;
    }


}