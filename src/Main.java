//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double resultado = calc.somar(10, 20);
        System.out.println(resultado);
        double resultado2 = calc.subtrair(20, 10);
        System.out.println(resultado2);
        double resultado3 = calc.multiplicar(10, 20);
        System.out.println(resultado3);
        double resultado4 = calc.dividir(40, 20);
        System.out.println(resultado4);

    }
}