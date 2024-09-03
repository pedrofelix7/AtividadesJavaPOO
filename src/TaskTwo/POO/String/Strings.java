package TaskTwo.POO.String;

public class Strings {
    public static void main(String[] args) {
        String Nome = "Tiberio";
        String Sobrenome = "Cavalcanti";
        String vogais = "aeiouAEIOU";
        int contador = 0;


        for (int i = 0; i < Nome.length(); i++) {
            char c = Nome.charAt(i);
            if (vogais.indexOf(c) != -1) {
                contador++;
            }
        }


        System.out.println(Nome + " " + Sobrenome);
        System.out.println("a) Número de caracteres" + " " + Nome.length());
        System.out.println("b) Em maiúsculo:" + " " + Sobrenome.toUpperCase());
        System.out.println("c) O número de vogais" + " " + contador);

        if(Nome.startsWith("UNI")){
            System.out.println("d) Esse nome começa com UNI");
        } else if (!Nome.startsWith("UNI")) {
            System.out.println("d) Esse nome não começa com UNI");
        }
if(Nome.endsWith("RIO")){
    System.out.println("e) Esse nome termina com RIO");
} else if (!Nome.endsWith("RIO")) {
    System.out.println("e) Esse nome não termina com RIO");
}
    }
}
