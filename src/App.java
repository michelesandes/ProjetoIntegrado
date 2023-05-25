import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Conversor de Decimal para Binário");

        int decimalNumero;
        int contagem;
        int Resultado;

        Scanner teclado = new Scanner(System.in);
        decimalNumero = teclado.nextInt();
        if(decimalNumero == 5){
            System.out.println (decimalNumero + "Número digitado");

        }else{
            System.out.println("tente de novo");
        }
        



    }
}
