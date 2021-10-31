/**
 * creado el  10/30/21.
 */
public class Pescado extends Mascota {

        int profundidadActual=0;
    
        public int nadar(int cuantoProfundo){
    
            profundidadActual=profundidadActual + cuantoProfundo;
            System.out.println("Nadando para " +
                    cuantoProfundo + " pies");
            System.out.println("Estoy en  " + cuantoProfundo +
                    " pies bajo el nivel del mar");
    
            return profundidadActual;
        }
    
    
       public void surface(){
         System.out.println("Yendo a " + profundidadActual + " pies!!!");
       }
    
    
    }
    