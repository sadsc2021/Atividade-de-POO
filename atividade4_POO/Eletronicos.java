package atividadePOO;

public class Eletronicos {
    //Atributos
    private String marca;
    private String modelo;
    private int fonteEnergia;

    //Métodos Especiais
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getFonteEnergia(){
        return this.fonteEnergia;
    }
    public void setFonteEnergia(int fonteEnergia){
        this.fonteEnergia = fonteEnergia;
    }
}
