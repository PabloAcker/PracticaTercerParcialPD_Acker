package ej1;

public class Warcraft implements IJuego{
    @Override
    public void crearPersonaje(Personaje personaje) {
        System.out.println("Creando un nuevo personaje...");
        personaje.setPorcentajeArmadura(1);
        personaje.setArmas("Aun no tiene un arma");
        personaje.setNivel(1);
        personaje.setPuntosAtaque(1);
        personaje.setPuntosRegeneracionVida(1);
        personaje.setPuntosDefensa(1);
        personaje.showInfo();
    }
    @Override
    public void agregarHabilidad(Personaje personaje) {}
}
