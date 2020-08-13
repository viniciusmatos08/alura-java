
public class TestaComposicao {
	
public static void main(String[] args) {
	Conta contaDoVincius = new Conta();
	
	contaDoVincius.titular = new Cliente();
	
	contaDoVincius.titular.nome = "vinicius";
	
	System.out.println(contaDoVincius.titular.nome);
}

}
