import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float sumarNumero = 0;
        String salirMenu = "";
        float numero;

        System.out.println("Introduce numeros");
        System.out.println("Introduce 'Q' para hacer la suma de los numeros");

        while (!salirMenu.equals("Q")) {
            salirMenu = scan.nextLine();

            if (!salirMenu.equals("Q")) {
                numero = Float.parseFloat(salirMenu);
                GenericQueue Numeros = new GenericQueue();
                Numeros.enqueue(numero);
                sumarNumero = sumarNumero + numero;
                
            } else {
                System.out.println("La suma de los valores introducidos es: " + sumarNumero);
            }
        }
    }
}