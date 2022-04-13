import java.util.Scanner;

public class CalculoGasolina {

    public static void main(String[] args)
    {
        //Declarar variaveis
        Scanner input = new Scanner(System.in);
        int counter = 1;
        double  totalKm= 0,totalGas = 0;

        // Calcula a media de quilometros por litro de 5 viagens.
        while (counter<=5)
        {
            // Recebe a quantidade de quilometros percorridos
            int gasolina= 0 ,quilometros = 0;
            System.out.println(counter+"º Viagem");
            System.out.print("Informe a kilometragem percorrida : ");
            quilometros = input.nextInt();

            // Recebe a quantidade de gasolina gasta
            System.out.print("Informe a gasolina utiliza em litros : ");
            gasolina = input.nextInt();

            // Faz a média dos parametros
            double D =  (double)quilometros/gasolina;
            System.out.printf("%.2fKm/l\n\n",D);
            ++counter;
            totalGas += gasolina;
            totalKm += quilometros;
        }
        System.out.println("Foram percorridos "+totalKm+"Km e utilizado "+totalGas+"l de gasolina.");
    }
}

