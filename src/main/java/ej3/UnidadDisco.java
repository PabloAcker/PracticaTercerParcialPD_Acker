package ej3;

public abstract class UnidadDisco {
    private int numPalabras;
    private String tipoArchivo;
    public UnidadDisco(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }
    public int getNumPalabras() {
        return numPalabras;
    }
    public UnidadDisco setNumPalabras(int numPalabras) {
        this.numPalabras = numPalabras;
        return this;
    }
    public String getTipoArchivo() {
        return tipoArchivo;
    }
    public UnidadDisco setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
        return this;
    }
    public abstract void contarPalabras();
    public abstract void add(UnidadDisco unidadDisco);
    public abstract void remove(UnidadDisco unidadDisco);
}
