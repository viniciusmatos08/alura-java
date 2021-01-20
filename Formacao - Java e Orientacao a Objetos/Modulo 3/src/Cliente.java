
public class Cliente  implements Autentificavel{
	
	AutenticacaoUtil autenticador;
	
	public Cliente() {
		autenticador = new AutenticacaoUtil();
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
