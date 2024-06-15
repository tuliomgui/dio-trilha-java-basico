import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Cria um scanner para capturar as informações pelo terminal
        Scanner consoleScanner = new Scanner(System.in).useLocale(Locale.US);

        // Pega o número da conta pela entrada do usuário no terminal
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = consoleScanner.nextInt();
        // Pega o número da agência pela entrada do usuário no terminal
        System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = consoleScanner.next();
        // Pega o nome do cliente pela entrada do usuário no terminal
        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = consoleScanner.next();
        // Pega o saldo da conta pela entrada do usuário no terminal
        System.out.println("Por favor, digite o saldo da conta: ");
        float saldoConta = consoleScanner.nextFloat();

        // Monta a mensagem que será exibida no terminal
        String mensagemFinal = "Olá ".concat(nomeCliente);
        mensagemFinal = mensagemFinal.concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(numeroAgencia);
        mensagemFinal = mensagemFinal.concat(", conta ").concat(String.valueOf(numeroConta));
        mensagemFinal = mensagemFinal.concat(" e seu saldo ").concat(String.valueOf(saldoConta));
        mensagemFinal = mensagemFinal.concat(" já está disponível para saque.");

        System.out.println(mensagemFinal);
    }
}