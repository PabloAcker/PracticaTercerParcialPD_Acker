package ej1;

public class Main {
    public static void main(String[] args) {
        Personaje personaje = new Personaje("RompeHuesos");

        IJuego warcraft = new Warcraft();
        warcraft.crearPersonaje(personaje);
        System.out.println("=======================================");

        warcraft = new Escudo(warcraft);
        warcraft.agregarHabilidad(personaje);
        System.out.println("=======================================");

        warcraft = new Arma(warcraft);
        warcraft.agregarHabilidad(personaje);
        System.out.println("=======================================");

        warcraft = new Arma(warcraft);
        warcraft.agregarHabilidad(personaje);
        System.out.println("=======================================");

        warcraft = new Arma(warcraft);
        warcraft.agregarHabilidad(personaje);
        System.out.println("=======================================");

        warcraft = new Curacion(warcraft);
        warcraft.agregarHabilidad(personaje);
        System.out.println("=======================================");

    }
}
