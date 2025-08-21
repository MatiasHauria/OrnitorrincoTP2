package ornitorrinco;

import java.util.Scanner;

public class OrniVerde extends Castor implements Pata {

    private String nombre;

    public OrniVerde(int cola, double velocidad, String nombre) {
        super(cola, velocidad);
        this.nombre = "Blue";
    }

    @Override
    public void tocarOrgano() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do-Re-Mi, presione Enter para continuar.");
        sc.nextLine();
        System.out.println("Fa-Sol-La-Si");
    }
    
    public void tocarGuitorgan() {
        super.tocarguitarra();
        this.tocarOrgano();
        System.out.println("Cuac cuaac...!");
    }

}
