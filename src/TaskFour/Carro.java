package TaskFour;

public class Carro {

private String cor;
private String placa;
private String modelo;
private String marca;
private int ano;
private double preco;
private boolean automatico;
private String tipoCombustivel;

public Carro(String minhaCor, String meuModelo, String minhaMarca){
    this.cor = minhaCor;
    this.modelo = meuModelo;
    this.marca = minhaMarca;
}
   public String getCor(){
        return this.cor;
    }

    public void setCor(String novaCor){
        this.cor = novaCor;
    }
    public String getModelo(){
    return this.modelo;
    }
    public void setModelo(String meuModelo){
    this.modelo = meuModelo;
    }
    public String getMarca(){
    return this.marca;
    }
    public void setMarca(String minhaMarca){
    this.marca = minhaMarca;
    }

public Carro(String minhaPlaca, String meuTipoCombustivel){
    this.placa = minhaPlaca;
    this.tipoCombustivel = meuTipoCombustivel;
}

public String getminhaPlaca(){
    return this.placa;
}
public void setPlaca(String minhaPlaca){
    this.placa = minhaPlaca;

}
    public String getTipoCombustivel(){
    return this.tipoCombustivel;
    }
    public void setTipoCombustivel(String meuTipoCombustivel){
    this.tipoCombustivel = meuTipoCombustivel;

    }
public Carro(int meuAno, boolean isAutomatico, double meuPreco){
    this.ano = meuAno;
    this.automatico = isAutomatico;
    this.preco = meuPreco;
}
public int getAno(){
    return this.ano;
}
public void setAno(int meuAno){
    this.ano = meuAno;
}
public boolean isAutomatico(){
   return this.automatico;
}
public void setisAutomatico(boolean automatico){
    this.automatico = automatico;
}
public double getPreco(){
    return this.preco;
}
public void setPreco(double meuPreco){
    this.preco = meuPreco;
}
}
