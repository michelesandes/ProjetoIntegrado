import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Conversor de Decimal para Binário");

        int decimalNumero;
        int contagem;
        int resultado;
        int resto;

        System.out.print("Digite um valor entre 1 e 100: ");
        Scanner teclado = new Scanner(System.in);
        decimalNumero = teclado.nextInt();
        if(decimalNumero >=1 && decimalNumero<=100){
            contagem = 0;
            System.out.println (" -- número digitado --- " + decimalNumero);
            while (decimalNumero != 1) {
                resultado = decimalNumero/2;
                resto = decimalNumero%2;
                int binarioNum[] = new int[12];
                binarioNum[contagem] = resto;
                decimalNumero = resultado;
                System.out.print("Resultado = "+resultado+" .. resto = " +resto+" ..contagem = " +contagem);
                contagem +=1;
                
            }

        }else{
            System.out.println("tente de novo");
        }
        



    }
}
