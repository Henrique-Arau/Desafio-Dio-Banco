
public class Main {
	
	
	public static void main(String[] args) {
		Cliente henrique = new Cliente();
		henrique.setNome("Henrique");
		
		IConta cc = new ContaCorrente(henrique);
		cc.depositar(100);
		
		IConta poupanca = new ContaPoupanca(henrique);
		cc.transferir(100, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
