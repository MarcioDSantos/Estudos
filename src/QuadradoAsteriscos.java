import java.util.Scanner;

public class QuadradoAsteriscos
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print(" Digite o numero do tamanho do quadrado de 1 a 20 :");
        int tamanho = input.nextInt();
        int counterLs = 1, counterRow = 0, counterLi = 1;

        //linha superior
        while (counterLs <= tamanho)
        {
            System.out.print("* ");
            counterLs++;
        }

        //Laterias
        while (counterRow <= tamanho - 2)
        {
            System.out.print("\n*");
            int counterEspaço = 1;

            //contador de espaços
            while (counterEspaço  <= tamanho - 2)
            {
                System.out.printf("  ");
                counterEspaço++;
            }

            System.out.print(" *");
            counterRow++;
        }

        System.out.println();

        //Linha inferior
        while(counterLi <= tamanho)
        {
            System.out.print("* ");
            counterLi++;
        }
    }
}

