
public class Gerente extends Funcionario implements Autentificavel{
	
	AutenticacaoUtil autenticador;
	
	public Gerente() {
		autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		return this.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
