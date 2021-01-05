package br.com.bytebank.banco.modelo;

/**
* 
* @author Vinicius Matos
* @version 0.1
* 
*/
public abstract class Conta{
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	/**
	* Construtor para inicializar o objeto Conta a partir da agencia e numero
	* @param agencia
	* @param numero
	*/
	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("Estou criando uma conta!");
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public abstract void deposita(double valor);
	
	/**
	* Valor precisa ser menor ou igual ao saldo
	* @param valor 
	* @throws SaldoInsuficienteException
	*/
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: "+this.saldo+" Valor: "+valor);
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta conta) throws SaldoInsuficienteException {
			this.saca(valor);
			conta.deposita(valor);
	}
	
	@Override
	public String toString() {
		return "Numero "+this.numero+", Agencia "+this.agencia;
	}
	
	@Override
	public boolean equals(Object ref){

	    Conta outra = (Conta) ref;

	    if(this.agencia != outra.agencia){
	        return false;
	    }

	    if(this.numero != outra.numero){
	        return false;
	    }

	    return true;
	}
	
}