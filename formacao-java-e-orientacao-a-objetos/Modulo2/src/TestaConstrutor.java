
public class TestaConstrutor {
	public static void main(String[] args) {
		Conta conta = new Conta(1234, 23241);
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());
		
		System.out.println("total de contas criadas: "+conta.getTotal());
		
		Conta conta1 = new Conta(2342, 65765);
		Conta conta2 = new Conta(87665, 4655);
		
		System.out.println("total de contas criadas: "+conta.getTotal());
			
		
	}

}
