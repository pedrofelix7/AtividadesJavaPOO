package TaskTwo.POO.String;

public class Strings {
    public static void main(String[] args) {
        String Nome = "Tiberio";
        String Sobrenome = "Cavalcanti";
        System.out.println(Nome + " " + Sobrenome);
System.out.println("a) Número de caracteres" + " " + Nome.length());
System.out.println("b) Em maiúsculo:" + " " + Sobrenome.toUpperCase());
System.out.println("c) O número de vogais/" + " " + "fiquei com duvida nessa, talles!");
System.out.println("d) Começa com UNI?" + " " + Nome.startsWith("UNI"));
        System.out.println("e) Termina com RIO?" + " " + Nome.endsWith("RIO"));

    }
}
