package ej2;

public class PagoApp implements IPago{
    @Override
    public void consultarFormaPago(Instalacion instalacion) {
        System.out.println("Precio de la instalación: " + instalacion.getPrecio() + "$");
        System.out.println("Se le decuenta el 10%, gracias por usar nuestra app!");
        instalacion.setPrecio(instalacion.getPrecio() - instalacion.getPrecio()*10/100);
        System.out.println("Precio actualizado: " + instalacion.getPrecio() + "$");
        System.out.println("=========================================");
    }
}
