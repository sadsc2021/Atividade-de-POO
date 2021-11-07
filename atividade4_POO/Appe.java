package atividadePOO;

import java.util.Scanner;

public class Appe {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Você quer nos informar a Descrição de qual dessas opções?");
        System.out.println("[1] Computador, [2] Roteador ou [3] Impressora");
        System.out.println("Digite apenas o número desejado.");
        int numEscolha = ler.nextInt();

        switch (numEscolha) {
            case 1:
            System.out.println("Lembre-se de que não deve ser informar dados com espaços.");
            System.out.println("");
            System.out.println("//--COMPUTADOR--//");
            System.out.println("Digite a 'Marca'");
            String ma = ler.next();
            System.out.println("Digite o 'Modelo'");
            String mo = ler.next();
            System.out.println("Digite a 'Carga Elêtrica'");
            int eng = ler.nextInt();
            System.out.println("Digite o total de 'Armazenamento'");
            float arm = ler.nextFloat();
            System.out.println("Digite o tamanho da 'Tela'");
            int tel = ler.nextInt();
            System.out.println("Digite 'True ou False' para ver se a Tela está ligada");
            boolean lig = ler.nextBoolean();
            System.out.println("Digite 'True ou False' para ver se tem teclado ou não");
            boolean tec = ler.nextBoolean();
            System.out.println("Digite 'True ou False' para ver se tem mouse ou não");
            boolean mous = ler.nextBoolean();
    
            Computador cp1 = new Computador();
            cp1.setMarca(ma);
            cp1.setModelo(mo);
            cp1.setFonteEnergia(eng);
            cp1.setArmazena(arm);
            cp1.setTela(tel);
            cp1.setLigado(lig);; //ligar() ou desligar()
            cp1.setTeclado(tec);
            cp1.setMouse(mous);
    
            cp1.status();
                break;
            case 2:
            System.out.println("Lembre-se de que não deve ser informar dados com espaços.");
            System.out.println("//ROTEADOR//");
            System.out.println("Digite a 'Marca'");
            String marc = ler.next();
            System.out.println("Digite o 'Modelo'");
            String mod = ler.next();
            System.out.println("Digite a 'Corrente Elêtrica'");
            int ener = ler.nextInt();
            System.out.println("Digite 'True ou False' para ver se ele está ligado");
            boolean liga = ler.nextBoolean();
            System.out.println("Digite a Quantidade de 'Leds'");
            int leds = ler.nextInt();
            System.out.println("Digite a Quantidade de 'Antenas'");
            int ante = ler.nextInt();
            System.out.println("Digite a Velocidade da 'Internet'");
            float inter = ler.nextFloat();

            Roteador rt1 = new Roteador();
            rt1.setMarca(marc);
            rt1.setModelo(mod);
            rt1.setFonteEnergia(ener);
            rt1.setLigado(liga);;; //ligar() ou desligar()
            rt1.setQuantLeds(leds);
            rt1.setQuantAntenas(ante);
            rt1.setVelInternet(inter);

            rt1.status();
                break;
            case 3:
            System.out.println("Lembre-se de que não deve ser informar dados com espaços.");
            System.out.println("//IMPRESSORA//");
            System.out.println("Digite a 'Marca'");
            String marca = ler.next();
            System.out.println("Digite o 'Modelo'");
            String model = ler.next();
            System.out.println("Digite a 'Carga Elêtrica'");
            int energ = ler.nextInt();
            System.out.println("Digite 'True ou False' para ver se ela está ligada");
            boolean ligad = ler.nextBoolean();
            System.out.println("Digite 'True ou False' para ver se tem Scaner");
            boolean scan = ler.nextBoolean();
            System.out.println("Digite 'True ou False' para ver se tem Wifi");
            boolean wf = ler.nextBoolean();

            Impressora ip1 = new Impressora();
            ip1.setMarca(marca);
            ip1.setModelo(model);
            ip1.setFonteEnergia(energ);
            ip1.setLigado(ligad);; //ligar() ou desligar()
            ip1.setScaner(scan);
            ip1.setWifi(wf);

            ip1.status();
                break;
        
            default:
                break;
        }
    }
}
