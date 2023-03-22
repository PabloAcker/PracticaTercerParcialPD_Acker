package ej2;

public class InstalacionAgua implements Instalacion {
    private int precio;
    private String tiempoEstimado;
    private int cantidadTrabajadores;

    public InstalacionAgua(int precio, String tiempoEstimado, int cantidadTrabajadores) {
        this.precio = precio;
        this.tiempoEstimado = tiempoEstimado;
        this.cantidadTrabajadores = cantidadTrabajadores;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(String tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public int getCantidadTrabajadores() {
        return cantidadTrabajadores;
    }

    public void setCantidadTrabajadores(int cantidadTrabajadores) {
        this.cantidadTrabajadores = cantidadTrabajadores;
    }

    @Override
    public void realizarInstalacion() {
        System.out.println("La instalacion de agua se realizo correctamente");
    }
}
