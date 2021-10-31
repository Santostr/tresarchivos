/**
 * creado el  10/30/21.
 */
public class Mascota {

    int edad;
    float peso;
    float altura;
    String color;

    public void dormir(){
        System.out.println(
                "Buenas noches, nos vemos mañana!");
    }

    public void comer(){
        System.out.println(
                "Tengo hambre, dame algunos snaks como nachos!");
    }

    public String hablar(String aWord){
        String respuestaMascota = "OK!! OK!! " +aWord;
        return respuestaMascota;
    }
}
