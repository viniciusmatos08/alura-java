
public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setCpf("233.023.342-05");
		gerente.setNome("joao");
		gerente.setSalario(6000);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(2222);
		
		boolean autenticou = gerente.autentica(2222);
		
		System.out.println(autenticou);
		
		System.out.println(gerente.getBonificacao());

	}

}
