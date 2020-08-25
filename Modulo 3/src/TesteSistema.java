
public class TesteSistema {
	
public static void main(String[] args) {
	Autentificavel gerente = new Gerente();
	
	Autentificavel administrador = new Administrador();
	
	gerente.setSenha(2222);
	
	administrador.setSenha(2222);
	
	SistemaInterno sistemaInterno = new SistemaInterno();
	
	sistemaInterno.autentica(gerente);
	
	sistemaInterno.autentica(administrador);
}

}
