public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);
		
		System.out.println("valor contido na primeira conta: "+ primeiraConta.saldo);
		System.out.println("valor contido na segundaConta: "+ segundaConta.saldo);
		
		
		
	}
}
