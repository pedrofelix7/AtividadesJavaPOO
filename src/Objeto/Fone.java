package Objeto;

public class Fone {

    int volume;
    public void escutar() {
    }
    public void falar() {
    }
    public int aumentar(int NewVolume) {
        volume = NewVolume;
        return volume;
    }
    public int diminuir(int NewVolume) {
        volume = NewVolume;
        return volume;
    }
    public int mutar(){
        return volume = 0;
    }
}
