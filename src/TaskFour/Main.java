package TaskFour;

public class Main {
    public static void main(String[] args) {
Carro meuCarro = new Carro("Vermelho", "Civic G10", "Honda");
System.out.println("Cor atual do meu carro: " + meuCarro.getCor());

meuCarro.setCor("Azul");

System.out.println("Nova cor do meu carro: " + meuCarro.getCor());
System.out.println("O moedelo do meu carro é: " + meuCarro.getModelo());
System.out.println("A marca do meu carro é: " + meuCarro.getMarca());

Carro meuCarro2 = new Carro("KIJ-0990", "Gasolina e Alcool");

System.out.println("Meu carro tem a placa: " + meuCarro2.getminhaPlaca());
System.out.println("Meu carro funciona a: " + meuCarro2.getTipoCombustivel());

Carro meuCarro3 = new Carro(2020, false, 130000);
System.out.println("O ano do meu carro é: " + meuCarro3.getAno());
System.out.println("O meu carro é automático? " + meuCarro3.isAutomatico());
System.out.println("O meu carrro vale isso:" + meuCarro3.getPreco());
    }
}
