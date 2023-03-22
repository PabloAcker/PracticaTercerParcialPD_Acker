package ej3;

public class Archivo extends UnidadDisco{
    public Archivo(String tipoArchivo) {
        super(tipoArchivo);
    }
    @Override
    public void contarPalabras() {
        System.out.println("\tCantidad de palabras en el " + getTipoArchivo() + ":\n \t>>> " + getNumPalabras());
    }
    @Override
    public void add(UnidadDisco unidadDisco) {}
    @Override
    public void remove(UnidadDisco unidadDisco) {}
}
