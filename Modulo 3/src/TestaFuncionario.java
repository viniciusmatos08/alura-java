
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Vinicius");
		funcionario.setCpf("233.093.093-12");
		funcionario.setSalario(800);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
		
		

	}

}
