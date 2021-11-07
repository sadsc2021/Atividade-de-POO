package atividadePOO;

public class Roteador extends Eletronicos implements InterfaceGeral {
    //Atributos
    private int leds;
    private int antenas;
    private boolean ligado;

    public Roteador(){
        this.ligado = false;
        this.leds = 6;
        this.antenas = 4;
    }

    //Métodos
    public float velInternet;

    //Métodos Especiais
    public int getLeds(){
        return this.leds;
    }
    public void setLeds(int leds){
        this.leds = leds;
    }
    public int getAntenas(){
        return antenas;
    }
    public void setAntenas(int antenas){
        this.antenas = antenas;
    }
    public float getVelInternet(){
        return this.velInternet;
    }
    public void setVelInternet(float velInternet){
        this.velInternet = velInternet;
    }
    public int getQuantLeds(){
        return this.leds;
    }
    public void setQuantLeds(int leds){
        this.leds = leds;
    }
    public int getQuantAntenas(){
        return this.antenas;
    }
    public void setQuantAntenas(int antenas){
        this.antenas = antenas;
    }
    public boolean getLigado(){
        return this.ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    @Override
    public void ligar(){
        this.setLigado(true);
    }
    @Override
    public void desligar(){
        this.setLigado(false);
    }

    public void status(){
        System.out.println("");
        System.out.println("======= DESCRIÇÃO DO ROTEADOR =======");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Carga Elêtrica: " + this.getFonteEnergia() + " volts");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Quantidades de Leds: " + this.getLeds());
        System.out.println("Quantidades de Antenas: " + this.getAntenas());
        System.out.println("Velocidade da Internet: " + this.getVelInternet() + " Mbps");
        System.out.println("");
    }
}
