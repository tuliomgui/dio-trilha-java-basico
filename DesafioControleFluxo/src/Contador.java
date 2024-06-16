import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        //Cria as variaveis que serão coletadas pelo Scanner
        int parametroUm, parametroDois;

        // Solicita o primeiro parêmtro ao usuário
        while (true) {
            System.out.println("Digite o primeiro parâmetro: ");
            if (!terminal.hasNextInt()) {
                System.out.println("O parâmetro deve ser um número inteiro. Tente novamente...");
                continue;
            }
            parametroUm = terminal.nextInt();
            break;
        }
        // Solicita o segundo parêmtro ao usuário
        while (true) {
            System.out.println("Digite o segundo parâmetro");
            if (!terminal.hasNextInt()) {
                System.out.println("O parâmetro deve ser um número inteiro. Tente novamente...");
                continue;
            }
            parametroDois = terminal.nextInt();
            break;
        }

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        // Valida se parametroUm é MAIOR que parametroDois e lança a exceção
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        // Executa o loop e imprime o resultado no console
        for (int indiceContagem = 1;indiceContagem <= contagem; indiceContagem++)
            System.out.println("Imprimindo o número " + indiceContagem);
    }
}