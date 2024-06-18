import br.com.greatbank.domain.Cliente;
import br.com.greatbank.conta.Conta;
import br.com.greatbank.conta.ContaCorrente;
import br.com.greatbank.conta.ContaPoupanca;

public class Main {
	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		ContaCorrente cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		cc.depositar(10);
		cc.efetuarCompraCartaoCredito(30);
		cc.pagarFaturaCartaoCredito();
		cc.efetuarCompraCartaoCredito(100);
		cc.pagarFaturaCartaoCredito();
	}
}
