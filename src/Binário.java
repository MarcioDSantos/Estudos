import java.util.Scanner;
public class Binário
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //Declaração de variáveis
        int binário, decimal = 0, numero, potencial = 0;

        System.out.println("** Código conversor de números binários para decimais. **");
        System.out.println();
        System.out.print("Informe um número Binário ( apenas 0's e 1's): ");
        binário = input.nextInt();

        while (binário > 0)
        {
            numero = binário%10;
            decimal += numero*Math.pow(2,potencial);
            binário = binário/10;
            potencial++;
        }
       System.out.println("\nO binário informado resulta no decimal " + decimal + ".");
    }
}

