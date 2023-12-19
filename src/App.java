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

            
      

        
        scanner.close();
    }

   
}
