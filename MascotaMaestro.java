/**
 * creado el  10/30/21.
 */
public class MascotaMaestro {

    public static void main(String[] args) {

        String mascotaReaccion;

        Mascota miMascota = new Mascota();

        miMascota.comer();

        mascotaReaccion = miMascota.hablar("Tweet!! Tweet!!");

        System.out.println(mascotaReaccion);

        miMascota.dormir();
    }
}
