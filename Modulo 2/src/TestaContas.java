
public class TestaContas {
	public static void main(String[] args) {
		Conta contaDoVinicius = new Conta();
		Conta contaDoGuilherme = new Conta();
		
		contaDoVinicius.deposita(1000);
		contaDoGuilherme.deposita(2000);
		
		System.out.println("A conta do Vinicius possui: ");
		System.out.println(contaDoVinicius.getSaldo());

		System.out.println("A conta do Guilherme possui: ");
		System.out.println(contaDoGuilherme.getSaldo());
		
		contaDoVinicius.saca(200);
		contaDoGuilherme.saca(300);
		
		System.out.println("A conta do Vinicius, apos sacar 200, possui: ");
		System.out.println(contaDoVinicius.getSaldo());

		System.out.println("A conta do Guilherme, apos sacar 300, possui: ");
		System.out.println(contaDoGuilherme.getSaldo());
		
		contaDoVinicius.transfere(400, contaDoGuilherme);
		System.out.println("A conta do Vinicius, apos transferir 400, possui: ");
		System.out.println(contaDoVinicius.getSaldo());

		System.out.println("A conta do Guilherme, apos a tranferencia de Vinicis, possui: ");
		System.out.println(contaDoGuilherme.getSaldo());

	}
}
