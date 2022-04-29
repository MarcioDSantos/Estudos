//Exercicio 6.29
import java.security.SecureRandom;
import java.util.Scanner;

public class CaraOuCoroa
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int opção, face = 0, cara = 0, coroa = 0;

        // Tive que fazer uma ganbiara para entrar no while
        System.out.print("Aperte 1 para iniciar : ");
        opção = input.nextInt();
        System.out.println("\t\t** Joga Cara ou Coroa **\nEscolha uma opção abaixo.");
        System.out.print("1: Lançar Moeda\n2: Sair\n");

        while (opção != 2)
        {
            System.out.print("Opcão : ");
            opção = input.nextInt();

            if (flip(opção,face) == 1)
            {
                cara += 1;
            }
            else
            {
                coroa += 1;
            }
            System.out.println("Cara : " + cara);
            System.out.println("Coroa : " + coroa + "\n");
        }

        double pcara, pcoroa;
        pcara = 100*((double)cara / (cara+ coroa));
        pcoroa = 100*((double)coroa / (cara+ coroa));
        System.out.printf("A frequencia de Caras  foi de %.2f%% e Coroas foi de %.2f%%", pcara, pcoroa);
    }

    public static int flip(int opção, int face)
    {
        SecureRandom randomNumbers = new SecureRandom();
        face = 1 + randomNumbers.nextInt(2);
        switch (face)
        {
            case 1:
                opção =1;
                break;
            case 2:
                opção =2;
                break;
        }
        return opção;
    }
}
