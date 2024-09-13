package TaskFour2;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;
    private String RG;
    private String email;
    private String telefone;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;

    Pessoa(String nome1, String sobrenome1,int idade1, String cpf1, String RG1, String email1, String telefone1, String endereco1, String cidade1, String estado1, String cep1) {
        this.nome = nome1;
        this.sobrenome = sobrenome1;
        this.idade = idade1;
        this.cpf = cpf1;
        this.RG = RG1;
        this.email = email1;
        this.telefone = telefone1;
        this.endereco = endereco1;
        this.cidade = cidade1;
        this.estado = estado1;
        this.cep = cep1;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome1){
        this.nome = nome1;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public void setSobrenome(String sobrenome1){
        this.sobrenome = sobrenome1;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade1){
        this.idade = idade1;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf1){
        this.cpf = cpf1;
    }
    public String getRG(){
        return this.RG;
    }
    public void setRG(String RG1){
        this.RG = RG1;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email1){
        this.email = email1;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String telefone1){
        this.telefone = telefone1;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco1){
        this.endereco = endereco1;
    }
    public String getCidade(){
        return this.cidade;
    }
    public void setCidade(String cidade1){
        this.cidade = cidade1;
    }
    public String getEstado(){
        return this.estado;
    }
    public void setEstado(String estado1){
        this.estado = estado1;
    }
    public String getCep(){
        return this.cep;
    }
    public void setCep(String cep1){
        this.cep = cep1;
    }
}
