package ej2;

public class PagoEfectivo implements IPago{
    @Override
    public void consultarFormaPago(Instalacion instalacion) {
        System.out.println("Precio de la instalación: " + instalacion.getPrecio() + "$");
        System.out.println("Se realizo el pago en efectivo, no cuenta con ningun descuento");
        System.out.println("=========================================");
    }
}
