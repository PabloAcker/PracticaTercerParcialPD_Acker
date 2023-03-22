package ej2;

public class PagoTigoMoney implements IPago{
    @Override
    public void consultarFormaPago(Instalacion instalacion) {
        System.out.println("Precio de la instalación: " + instalacion.getPrecio() + "$");
        System.out.println("Se le decuenta el 2%, gracias por usar Tigo Money!");
        instalacion.setPrecio(instalacion.getPrecio() - instalacion.getPrecio()*2/100);
        System.out.println("Precio actualizado: " + instalacion.getPrecio() + "$");
        System.out.println("=========================================");
    }
}
