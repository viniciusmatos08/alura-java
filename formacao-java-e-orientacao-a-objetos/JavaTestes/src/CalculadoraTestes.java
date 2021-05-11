public class CalculadoraTestes {

    /*
    Criando um teste automatizado bem basico, utilizando apenas uma classe com um metodo main
    e testando o objeto em varios cenarios, analisando as saidas no console para validar o
    funcionamento do metodo.
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int soma = calc.somar(3,7);
        System.out.println(soma);

        soma = calc.somar(3,0);
        System.out.println(soma);

        soma = calc.somar(0,0);
        System.out.println(soma);

        soma = calc.somar(3,-1);
        System.out.println(soma);

    }

}
