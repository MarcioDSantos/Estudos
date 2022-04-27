import java.util.Scanner;

public class ArredondandoNúmeros
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double number;

        System.out.print("Digite um número fracionado :");
        number = input.nextDouble();
        System.out.println("\nO número "+ number +" após utilizar a função floor torna-se "+ arredondar(number)+".");

    }
    public static double arredondar( double number)
    {
        double arredondado = Math.floor(number);
        return arredondado;
    }
}
