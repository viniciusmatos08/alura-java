package br.com.bytebank.banco.modelo;

public abstract class Conta{
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	
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
	
}