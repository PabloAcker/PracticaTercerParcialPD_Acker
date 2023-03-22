package ej1;

public class Curacion extends Habilidad {
    public Curacion(IJuego juego) {
        super(juego);
    }
    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println("Agregando posiciones de curacion al personaje!");
        double nuevaVida = personaje.getPuntosRegeneracionVida() + 80;
        personaje.setPuntosDefensa(nuevaVida);
        personaje.showInfo();
    }
}
