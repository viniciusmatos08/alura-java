
public class TestaFuncionario {

	public static void main(String[] args) {
		Gerente funcionario = new Gerente();
		
		funcionario.setNome("Vinicius");
		funcionario.setCpf("233.093.093-12");
		funcionario.setSalario(800);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
		
		

	}

}
