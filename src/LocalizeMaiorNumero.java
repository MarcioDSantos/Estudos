import java.util.Scanner;
public class LocalizeMaiorNumero
{
    public static void main(String[] args)
    {   //Declaração das váriáveis
        Scanner input = new Scanner(System.in);
        int counter = 1, number, largest1 = 0,largest2 = 0;
        System.out.println("Informe 10 números inteiros:");

        while (counter < 10)
        {
            System.out.print(counter+"º number : ");
            number = input.nextInt();

            //Determina o maior valor
            if(number > largest1)
            {
                largest2 = largest1;
                largest1 = number;
            }
            else if(number <= largest1 && number > largest2)
            {
                largest2 = number;
            }
            counter += 1;
        }
        System.out.println(largest1+" e "+largest2+" foram os maiores números informados.");
    }
}
