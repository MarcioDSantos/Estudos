//Exercicio 5.1
import java.util.Scanner;

public class CalculadoraJurosCompostos
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int anos ;
        double valorInvestido, total = 0,juros, valorInicial = 0;

        System.out.print("Valor inicial investido : ");
        valorInvestido = input.nextDouble();
        System.out.print("Tempo , em anos, que deseja deixa investido : ");
        anos = input.nextInt();
        System.out.print("Taxa anual de juros : ");
        juros = input.nextDouble();
        valorInicial = valorInvestido;
        for (int counter = 1; counter <= anos; ++counter)
        {

            total = valorInvestido*(1+(juros/100));
            System.out.printf("%dº ano : R$ %.2f\n",counter,total);
            valorInvestido = total;
        }
        System.out.printf("\nTotal economizado R$ %.2f\nTotal de juros R$ %.2f \n",valorInicial,total);
    }
}
