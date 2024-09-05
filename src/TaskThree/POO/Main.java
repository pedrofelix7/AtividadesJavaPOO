package TaskThree.POO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Contador WHILE 0 a 50
        int contador = 0;
        while (contador <= 50) {
            System.out.println(contador);
            contador++;
        }
        //Contador FOR 0 50
        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
        }
        //Contador FOR Números pares
        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
            i++;
        }
        //Contador While Números impares
        int contador2 = 1;
        while (contador2 < 50) {
            if (contador2 % 2 != 0) {
                System.out.println(contador2);
            }
            contador2++;
        }
        //Imprimir numeros maiores que 3
        int[] num = new int[10];
        num[0] = 100;
        num[1] = 22;
        num[2] = 3;
        num[3] = 44;
        num[4] = 55;
        num[5] = 66;
        num[6] = 77;
        num[7] = 87;
        num[8] = 0;
        num[9] = 1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 3) {
                System.out.println(num[i]);
            }
        }
//Array list
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Talles");
        nomes.add("Neymar");
        nomes.add("Pedro");
        nomes.add("Cristiano");
        nomes.add("Messi");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("O nome da pessoa é" + " " + nomes.get(i));
        }
        System.out.println("Removendo o Neymar");
        nomes.remove("Neymar");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("O nome da pessoa é" + " " + nomes.get(i));
        }
        System.out.println("Removendo o Pedro");
        nomes.remove("Pedro");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("O nome da pessoa é" + " " + nomes.get(i));
        }
        System.out.println("Checando se o primeiro nome é Talles");
        if (nomes.get(0).equals("Talles")) {
            System.out.println("O nome é igual a Talles");
        } else {
            System.out.println("O nome não é igual a Talles");
        }
    }
}
