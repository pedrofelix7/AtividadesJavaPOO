package Objeto;

public class Main {
    public static void main(String[] args) {
        Fone fone = new Fone();
        int NovoVolume = fone.aumentar(60);
        System.out.println(NovoVolume);
        int NovoVolume2 = fone.diminuir(50);
        System.out.println(NovoVolume2);
        int NovoVolume3 = fone.mutar();
        System.out.println(NovoVolume3);
        fone.escutar();
        System.out.println("Esse fone tem um áudio bom!");
        fone.falar();
        System.out.println("Esse fone tem um microfone bom!");
    }

}
