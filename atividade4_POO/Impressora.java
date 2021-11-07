package atividadePOO;

public class Impressora extends Eletronicos implements InterfaceGeral {
    //Atributos
    private boolean scaner;
    private boolean wifi;
    private boolean ligado;

    public Impressora(){
        this.scaner = true;
        this.ligado = false;
        this.wifi = false;
    }

    //Métodos
    public boolean impressaoSilenciosa;

    //Métodos Especiais
    public boolean getScaner(){
        return this.scaner;
    }
    public void setScaner(Boolean scaner){
        this.scaner = scaner;
    }
    public boolean getWifi(){
        return this.wifi;
    }
    public void setWifi(boolean wifi){
        this.wifi = wifi;
    }
    public boolean getLigado(){
        return this.ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    @Override
    public void ligar() {
        this.ligado = true;
    }

    @Override
    public void desligar() {
        this.ligado = false;
    }

    public void status(){
        System.out.println("");
        System.out.println("======= DESCRIÇÃO DA IMPRESSORA =======");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Carga Elêtrica: " + this.getFonteEnergia() + " volts");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Tem Scaner? " + this.getScaner());
        System.out.println("Está conectado no Wifi? " + this.getWifi());
        System.out.println("");
     }
}
