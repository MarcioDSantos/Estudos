import java.util.Scanner;
public class EstimativaSomaFatorial
{
    public static void main (String []args)
    {
        Scanner input = new Scanner(System.in);
        double fatorial, numero, counter, resultado = 0;
        System.out.print("Digite um número : ");
        numero = input.nextInt();

        if (numero > 0) {
            for (counter = 1, fatorial = 1; counter <= numero; counter++)
            {
                fatorial *= counter;
                resultado += 1 / fatorial;
            }
            System.out.printf("\nA soma do fatorial de " + numero + " com " + numero + " termos  é: %.8f.\n", resultado);
        }
        else
        {
            System.out.println("Numero negativo não possui fatorial.");
        }
    }
}