//Exercicio 6.10
import java.util.Scanner;

public class ArredondandoNúmeros2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double integer, tenths, hundredths, thousandths;
        System.out.print("Digite um numero fracionado :");
        integer = input.nextDouble();
        System.out.print("Digite um numero fracionado com dezenas :");
        tenths = input.nextDouble();
        System.out.print("Digite um numero fracionado com centenas :");
        hundredths = input.nextDouble();
        System.out.print("Digite um numero fracionado com milhares :");
        thousandths = input.nextDouble();
        System.out.print("\nO número " + integer + " após utilizar a função floor torna-se " + roundToInteger(integer) + "\n");
        System.out.print("\nO número " + tenths + " após utilizar a função floor torna-se " + roundToTenths(tenths) + "\n");
        System.out.print("\nO número " + hundredths + " após utilizar a função floor torna-se " + roundToHundredths(hundredths) + "\n");
        System.out.print("\nO número " + thousandths + " após utilizar a função floor torna-se " + roundToThousandths(thousandths) + "\n");
    }

    public static double roundToInteger(double integer)
    {
        double y = Math.floor(integer + 0.5);
        ;
        return y;
    }

    public static double roundToTenths(double tenths)
    {
        double y = Math.floor((tenths * 10 + 0.5) / 10);
        ;
        return y;
    }

    public static double roundToHundredths(double hundredths)
    {
        double y = Math.floor((hundredths * 100 + 0.5) / 100);
        ;
        return y;
    }

    public static double roundToThousandths(double thousandths)
    {
        double y = Math.floor((thousandths * 1000 + 0.5) / 1000);
        ;
        return y;
    }
}
