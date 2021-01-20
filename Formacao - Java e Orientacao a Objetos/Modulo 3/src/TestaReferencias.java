
public class TestaReferencias {
	
	public static void main(String[] args) {
		Funcionario editor = new EditorVideo();
		editor.setNome("Gaveta");
		editor.setSalario(1000);
		
		Funcionario gerente = new Gerente();
		gerente.setNome("Paulo");
		gerente.setSalario(5000);
		
		Funcionario designer = new Designer();
		designer.setNome("Augusto");
		designer.setSalario(2000);
		
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		
		controleBonificacao.resgitra(editor);
		controleBonificacao.resgitra(gerente);
		controleBonificacao.resgitra(designer);
		
		System.out.println(controleBonificacao.getSoma());
		
		
	}

}
