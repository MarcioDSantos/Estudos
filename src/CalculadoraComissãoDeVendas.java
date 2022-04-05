import java.util.Scanner;

public class CalculadoraComissãoDeVendas {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int contador = 1;
        double valorItem = 0,total = 0;
        System.out.println("Informe o nome e valor de cada item");
        System.out.println("ITEM\t\tVALOR");

        while (valorItem != -1)
        {
            System.out.printf(contador+"\t\t\tR$");
            valorItem = input.nextDouble();
            contador += 1;
            total += valorItem;
        }

        System.out.println("Total Vendas :"+total);
        total = total*0.09 + 200;
        System.out.printf("Total a receber : %.2f ",total);
    }
}
