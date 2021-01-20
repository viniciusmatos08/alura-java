public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(1231,34523);
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(1231, 12435);
		segundaConta.deposita(50);
		System.out.println(segundaConta.getSaldo());
		
		System.out.println("valor contido na primeira conta: "+ primeiraConta.getSaldo());
		System.out.println("valor contido na segundaConta: "+ segundaConta.getSaldo());
		
		
		
	}
}
