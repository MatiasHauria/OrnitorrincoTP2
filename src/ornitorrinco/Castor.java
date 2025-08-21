package ornitorrinco;

public class Castor {
 protected int cola;
 protected double velocidad;

    public Castor(int cola, double velocidad) {
        this.cola = cola;
        this.velocidad = velocidad;
    }

    public int getCola() {
        return cola;
    }

    public void setCola(int cola) {
        this.cola = cola;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
 
    
   public void nadar(){
       System.out.println("nada a: "+velocidad+" km/h");   
       
   }
   
   public void tocarguitarra(){
     int random =(int)(Math.random()*6+1);
     System.out.println("toca cuerda: "+ random);
   }
   
   
   
}
