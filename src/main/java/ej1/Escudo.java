package ej1;

public class Escudo extends Habilidad {
    public Escudo(IJuego juego) {
        super(juego);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println("Al personaje se le da un nuevo escudo!");
        double nuevaDefensa = personaje.getPuntosDefensa() + 35;
        personaje.setPuntosDefensa(nuevaDefensa);
        double nuevaArmadura = personaje.getPorcentajeArmadura()+ 10;
        personaje.setPorcentajeArmadura(nuevaArmadura);
        personaje.showInfo();
    }
}
