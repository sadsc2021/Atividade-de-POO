package atividadePOO;

public class Computador extends Eletronicos implements InterfaceGeral {
    //Atributos
    public int tela;
    public boolean teclado;
    public boolean mouse;
    public boolean ligado;

    public Computador(){ //Método padrão
        this.ligado = false;
        this.setTela(15);
        this.armazenamento = 10;
    }

    //Métodos
    public float armazenamento;

    //Métodos Especiais
    public int getTela(){
        return this.tela;
    }
    public void setTela(int tela){
        this.tela = tela;
    }
    public boolean getTeclado(){
        return this.teclado;
    }
    public void setTeclado(boolean teclado){
            this.teclado = teclado;
    }
    public boolean getMouse(){
        return this.mouse;
    }
    public void setMouse(boolean mouse){
            this.mouse = mouse;
    }
    public boolean getLigado(){
        return this.ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public float getArmazena(){
        return this.armazenamento;
    }
    public void setArmazena(float armazena){
        this.armazenamento = armazena;
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
        System.out.println("======= DESCRIÇÃO DO COMPUTADOR =======");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Carga Elêtrica: " + this.getFonteEnergia() + " volts");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Tem Teclado? " + this.getTeclado());
        System.out.println("Tem Mouse? " + this.getMouse());
        System.out.println("Dimenções da tela: " + this.getTela() + " polegadas");
        System.out.println("Armazenamento em Disco: " + this.getArmazena() + " Gb");
        System.out.println("");
    }
}
