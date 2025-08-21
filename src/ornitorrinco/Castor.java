package ornitorrinco;

public class Castor {
 protected int cola;
 protected int velocidad;

    public Castor(int cola, int velocidad) {
        this.cola = cola;
        this.velocidad = velocidad;
    }

    public int getCola() {
        return cola;
    }

    public void setCola(int cola) {
        this.cola = cola;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
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
