package ornitorrinco;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    
    OrniVerde orniVerde = new OrniVerde (3, 10, "Zagardirianetto");
    OrniAzul orniBlue = new OrniAzul(5.0, 2, 8.0);
    OrniAzul orniBlui = new OrniAzul(4.0, 1, 6.0);
    
    System.out.println("Habilidades OrniVerde:");
    orniVerde.nadar();
    orniVerde.tocarguitarra();
    orniVerde.tocarOrgano();
    orniVerde.tocarGuitorgan();
    
    System.out.println("Habilidades OrniBlue:");
    orniBlue.nadar();
    orniBlue.tocarguitarra();
    orniBlue.tocarOrgano();
    
    System.out.println("Habilidades OrniBlui:");
    orniBlui.nadar();
    orniBlui.tocarguitarra();
    orniBlui.tocarOrgano();
    
    Castor[] hermanos = new Castor[3];
    try{
        hermanos[0] = orniBlue;
        hermanos[1] = orniVerde;
        hermanos[2] = orniBlui;
    } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Error: arreglo fuera de rango");
    } finally{
        System.out.println("Los ornitohermanos estan juntos al fin...");
         }
    
    List<OrniAzul> nadadores = new ArrayList<>();
    if (orniBlue instanceof OrniAzul) nadadores.add(orniBlue);
    if (orniBlui instanceof OrniAzul) nadadores.add(orniBlui);
    
    Collections.sort(nadadores, Comparator.comparingDouble(OrniAzul::getPropulsion));
    //nadadores.sort(Comparator.comparing(OrniAzul::getVelocidad));
    
    System.out.println("Nadadores ordenados por propulsion:");
    Iterator<OrniAzul> it = nadadores.iterator();
    while (it.hasNext()){
        OrniAzul o = it.next();
        System.out.println("OrniAzul con propulsion: " + o.getPropulsion());
         }
      }
}
