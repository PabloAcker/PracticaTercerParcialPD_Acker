package ej2;

public class PagoTransferencia implements IPago{
    @Override
    public void consultarFormaPago(Instalacion instalacion) {
        System.out.println("Precio de la instalación: " + instalacion.getPrecio() + "$");
        System.out.println("Se le decuenta el 5%, gracias por usar Tigo Moeny!");
        instalacion.setPrecio(instalacion.getPrecio() - instalacion.getPrecio()*5/100);
        System.out.println("Precio actualizado: " + instalacion.getPrecio() + "$");
        System.out.println("=========================================");
    }
}
