import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti numeri voui sommare?: ");
        int dimensione= scanner.nextInt();
        scanner.nextLine();


        int[] arr = new int[dimensione];

        for(int i=0; i < dimensione; i++){
            System.out.print((i + 1) + " Numero: " + "\n");
            int numeroUtente = scanner.nextInt();
            arr[i] = numeroUtente;
        }

        System.out.println("La somma è: " + sommaAray(arr));

        scanner.close();
    }



    public static int sommaAray (int[] arr){
        int somma = 0;
        for(int i=0; i < arr.length; i++){
            somma += arr[i];
        }

        return somma;
    }


   
}
