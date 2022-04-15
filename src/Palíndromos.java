import java.util.Scanner;

public class Palíndromos
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int invertido = 0, aux1 = 0, aux2 = 0, aux3 = 0, aux4 = 0, aux5 = 0, numero, counter = 0, verificador = 0;
        System.out.println("Digite um número interior que contenha 5 digitos");
        System.out.print("Número : ");
        numero = input.nextInt();

        // Enquanto não for 5 digitos pedir para digitar novamente
        while (numero < 10000 || numero > 99999)
        {
            System.out.println("Número inválido, digite novamente!");
            numero = input.nextInt();
        }

        //Inverter número
        aux1 = (numero % 10) * 10000;
        aux2 = (numero / 10 % 10) * 1000;
        aux3 = (numero / 100 % 10) * 100;
        aux4 = (numero / 1000 % 10) * 10;
        aux5 = (numero / 10000) % 10;

        // Verificar se o número original e o invertido são iguais
        int soma = aux1 + aux2 + aux3 + aux4 + aux5;

        if (numero == soma)
        {
            System.out.println("*** É palindromo ***");
        }
        else {
            System.out.println("*** Não é palindromo ***");
        }
    }
}
