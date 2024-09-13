package TaskFour2;

public class Main {
    public static void main(String[] args) {
Pessoa minhaPessoa = new Pessoa("Pedro", "Cavalcanti", 19, "090.114.543-98", "89.055.434", "pedrolindo123@gmail.com", "(87) 99913-0990", "Av. Coronel Antônio Japiassú, 22", "Recife", "Pernambuco", "56500-000");
System.out.println("O nome do cliente é: " + minhaPessoa.getNome());
System.out.println("O sobrenome do cliente é: " + minhaPessoa.getSobrenome());
System.out.println("O nome completo do cliente é: " + minhaPessoa.getNome() + " " + minhaPessoa.getSobrenome());
System.out.println("O CPF do cliente é: " + minhaPessoa.getCpf());
System.out.println("O RG do cliente é: " + minhaPessoa.getRG());
System.out.println("O email do cliente é: " + minhaPessoa.getEmail());
System.out.println("O telefone do cliente é: " + minhaPessoa.getTelefone());
System.out.println("O endereço do cliente é: " + minhaPessoa.getEndereco());
System.out.println("A cidade onde o cliente mora é: " + minhaPessoa.getCidade());
System.out.println("O estado onde o cliente more é: " + minhaPessoa.getEstado());
System.out.println("O cep do cliente é: " + minhaPessoa.getCep());

Pessoa minhaPessoa2 = new Pessoa("Felipe", "Alves", 25,"994.887.668-00", "10.987.412", "felipegostosinho321@gmail.com", "(81) 99130-0790", "Av José Bonifácio", "Pesqueira", "Pernambuco", "565000-001");
        System.out.println("O nome do cliente2 é: " + minhaPessoa2.getNome());
        System.out.println("O sobrenome do cliente2 é: " + minhaPessoa2.getSobrenome());
        System.out.println("O nome completo do cliente2 é: " + minhaPessoa2.getNome() + " " + minhaPessoa.getSobrenome());
        System.out.println("O CPF do cliente2 é: " + minhaPessoa2.getCpf());
        System.out.println("O RG do cliente2 é: " + minhaPessoa2.getRG());
        System.out.println("O email do cliente2 é: " + minhaPessoa2.getEmail());
        System.out.println("O telefone do cliente2 é: " + minhaPessoa2.getTelefone());
        System.out.println("O endereço do cliente2 é: " + minhaPessoa2.getEndereco());
        System.out.println("A cidade onde o cliente2 mora é: " + minhaPessoa2.getCidade());
        System.out.println("O estado onde o cliente2 more é: " + minhaPessoa2.getEstado());
        System.out.println("O cep do cliente2 é: " + minhaPessoa2.getCep());
    }
}
