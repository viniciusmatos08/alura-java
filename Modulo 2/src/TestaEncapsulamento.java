
public class TestaEncapsulamento {
	public static void main(String[] args) {
		Conta conta = new Conta(1232,3654);
		Cliente cliente = new Cliente();
		
		conta.setNumero(5733);
		conta.setAgencia(567);
		conta.setTitular(cliente);
		
		conta.getTitular().setNome("Pedro");
		conta.getTitular().setCpf("523.555.784-03");
		conta.getTitular().setProfissao("DEV");
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getNumero());
		System.out.println(conta.getTitular().getProfissao());
		
	}

}
