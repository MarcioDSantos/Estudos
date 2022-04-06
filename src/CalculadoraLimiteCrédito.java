//Biblioteca utilizada para janelas gráficas.
import javax.swing.JOptionPane;
public class CalculadoraLimiteCrédito
{
    public static void main(String [] args)
    {
        //Declação de variáveis.
        int numeroConta, cobrançasMensais, créditosAplicados, limíteCreditos,
                saldoNovo;
        String sConta, ssaldoInicial,scobrançasMensais, scréditosAplicados, slimíteCreditos,
                ssaldoNovo;
        sConta = JOptionPane.showInputDialog("Informe o numero da conta ou digite -1 para sair");
        numeroConta = Integer.parseInt(sConta);

        while (numeroConta!= -1)
        {
            ssaldoInicial = JOptionPane.showInputDialog("Informe o saldo no início do mês");
            scobrançasMensais = JOptionPane.showInputDialog("Informe o total de gastos no crédito do mês");
            cobrançasMensais = Integer.parseInt(scobrançasMensais);
            scréditosAplicados = JOptionPane.showInputDialog("Informe o total de créditos disponibilizados ao cliente esse mês ");
            créditosAplicados = Integer.parseInt(scréditosAplicados);
            slimíteCreditos = JOptionPane.showInputDialog("informe o limite de crédito do cliente");
            limíteCreditos = Integer.parseInt(slimíteCreditos);
            saldoNovo =  Integer.parseInt(ssaldoInicial) + cobrançasMensais -créditosAplicados;

            if(saldoNovo > limíteCreditos)
            {
                JOptionPane.showMessageDialog(null,"Limite de crédito excedido",
                        "Aprovação de crédito",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Limite aprovado",
                        "Aprovação de crédito",JOptionPane.INFORMATION_MESSAGE);
            }

            sConta = JOptionPane.showInputDialog ("Digite o número da conta ou -1 para sair: ");
            numeroConta = Integer.parseInt(sConta);
        }
    }
}
