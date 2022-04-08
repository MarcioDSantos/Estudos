import java.util.Scanner;


public class CalculadorSalários
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean runProgram = true;
        int counter = 0;


        do{
            menu();
            int option = input.nextInt();
            System.out.println();

            switch (option){
                case 1:
                    System.out.println("Informe o nome do funcionário e horas extras na semana");
                    counter++;
                    calculadora(counter);
                    break;
                case 2:
                    runProgram = false;
            }
        } while(runProgram);
        System.out.println("Sistema finalizado!");
    }

    public static void menu(){
        System.out.println("Menu : ");
        System.out.println("1. Calcular o salário de um colaborador.");
        System.out.println("2. Finalizar!");
        System.out.print("> ");
    }

    public static double calculadora(int contador){
        double valorHora = 0, salário = 0, horasExtras = 0;
        String nome;
        System.out.println("Funcionario "+ contador);
        System.out.print("Nome : ");
        nome = input.next();
        System.out.print("Número de horas extas : ");
        horasExtras= input.nextInt();
        System.out.print("Valor por hora : R$ ");
        valorHora = input.nextDouble();
        salário = 40*valorHora + horasExtras*1.5;
        System.out.println("Funcionário "+nome+" tem a receber R$"+salário+" .\n");

        return salário;
    }
}

