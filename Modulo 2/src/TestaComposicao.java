
public class TestaComposicao {
	
public static void main(String[] args) {
	Conta contaDoVincius = new Conta(2413,44234);
	
	contaDoVincius.setTitular(new Cliente());
	
	contaDoVincius.getTitular().setNome("vinicius");
	
	System.out.println(contaDoVincius.getTitular().getNome());
}

}
