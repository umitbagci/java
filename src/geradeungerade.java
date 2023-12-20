import java.util.Scanner;

public class geradeungerade {
    public static void main(String[] args) {
        System.out.println(" GERADE ODER UNGERADE");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie die Lenght des Arrays ");
        int arraylength= scanner.nextInt();
        scanner.nextLine();

        int[] zahl = new int[arraylength];

        for (int i = 0; i < zahl.length; i++) {
            System.out.println("Geben Sie die index von" + i);
            zahl[i]=scanner.nextInt();
            scanner.nextLine();
            }

        for (int wert :zahl) {geradeoderungerade(wert);}
        {

        }{

        }
            
        }
        
        
        
public static void geradeoderungerade(int zahl){


        if(zahl%2==0){
            System.out.println("zahl : " + zahl + " gerade");
        }
        else {
            System.out.println("zahl : " + zahl+ " ungerade");
        }
}


    }

