package ornitorrinco;

import java.util.Scanner;

public class OrniAzul extends Castor implements Pata{
    private double propulsion;
    
    public OrniAzul(double propulsion, int cola, int velocidad){
    super(cola, velocidad);
    this.propulsion = propulsion;
    }

    public double getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(double propulsion) {
        this.propulsion = propulsion;
    }
    
    
    @Override
    public void nadar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese propulsion: de 5 a 10km/s");
        propulsion = scan.nextInt();
        int velocidadfinal = super.velocidad;
        velocidadfinal += propulsion;
        System.out.println("El ornitorrinco azul nada a: " + velocidadfinal +" km/s con su propulsion");
    }

    @Override
    public void tocarOrgano() {
        System.out.println("Do-Re-Mi");
        Scanner enter = new Scanner(System.in);
        System.out.println("Presione ENTER para seguir tocando las siguientes notas");
        enter.hasNext();
        System.out.println("Fa-Sol-La-Si");
    }
    
    
}
