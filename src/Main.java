
public class Main {
	public static void main(String[] args) {
		
		Cliente venilton = new Cliente();
		
		venilton.setNome("Venilton");
		
		ContaCorrente cc = new ContaCorrente(venilton);
		ContaPoupanca poupanca = new ContaPoupanca(venilton);
		cc.depositar(100);
		
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
}
