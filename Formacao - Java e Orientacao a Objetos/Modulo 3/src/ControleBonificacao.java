
public class ControleBonificacao {
	
	private double soma;
	
	public double getSoma(){
		return this.soma;
	}
	
	public void resgitra(Funcionario funcionario) {
		double boni = funcionario.getBonificacao();
		this.soma = this.soma + boni;
	}

}
