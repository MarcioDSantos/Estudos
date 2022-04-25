// Exercicio 6.31

import java.util.Random;
import java.util.Scanner;

public class AdivinheNúmeroModificado
{
    public static void main(String[] args)
    {
        int number = 0, aux, counter = 1 , continuar = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(" *** Adivinhe o Numero ***");
        System.out.println("Informe um número entre 1 e 1000");

        while (continuar != -1)
        {
            Random gerador = new Random();
            aux = gerador.nextInt(1000);
            System.out.print("Digite o número : ");

            while (aux != number)
            {
                number = input.nextInt();
                certo(number, aux,counter);
                counter++;
            }

            continuar = input.nextInt();
            if (continuar == - 1 )
            {
                System.out.println("\n *** Finalizado ***");
            }
        }
    }

    public static void certo(int number, int aux, int counter )
    {
        if ( number < aux)
        {
            System.out.println("\nMuito baixo. Tente novamente!");
            System.out.print("Próximo palpite : ");
        }
        else if ( number > aux)
        {
            System.out.println("\nMuito alto. Tente novamente!");
            System.out.print("Próximo palpite : ");
        }
        else
        {
            System.out.println("\nAcertou!! O número era " + aux + ".");
            System.out.println();
            if (counter <10)
            {
                System.out.println("Você sabe o segredo ou tem muita sorte, acertou com apenas " + counter +" tentativas !\n");
            }
            else if (counter == 10)
            {
                System.out.println("Aha! Você sabe o segredo! Acertou com 10 tentativas\n");
            }
            else
            {
                System.out.println("[Você deve ser capaz de fazer melhor, deu tempo de eu morrer e voltar " + counter + " tentativas\n");
            }

            System.out.print("Deseja jogar novamente aperte 1 ou -1 para sair :");

        }
    }
}
