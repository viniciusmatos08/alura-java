import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		
		Comparator<String> comparador = new ComparaStringPorTamanho();
		
		palavras.sort(comparador);
		
		palavras.forEach(consumidor);
	}

}


class ImprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
		
	}
}
	
	
class ComparaStringPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		}
		if (s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}	
	
}
	

