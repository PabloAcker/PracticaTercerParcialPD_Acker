package ej1;

import java.util.Random;

public class Arma extends Habilidad {
    private String[] armas = {"Espada", "Hacha", "Escopeta"};

    public Arma(IJuego juego) {
        super(juego);
    }
    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println("Al personaje se le da una nueva arma!");
        int armaRnd = new Random().nextInt(3);
        personaje.setArmas(armas[armaRnd]);
        double nuevoAtaque = personaje.getPuntosAtaque() + 30;
        personaje.setPuntosAtaque(nuevoAtaque);
        int nuevoNivel = personaje.getNivel() * 2;
        personaje.setNivel(nuevoNivel);
        personaje.showInfo();
    }
}
