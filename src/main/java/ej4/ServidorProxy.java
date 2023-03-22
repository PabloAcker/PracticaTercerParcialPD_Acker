package ej4;
public class ServidorProxy implements ICluster {
    private ServidorUno servidorUno;
    private ServidorDos servidorDos;
    public ServidorProxy() {
        this.servidorUno = new ServidorUno();
        this.servidorDos = new ServidorDos();
    }
    @Override
    public void autenticacionUsuario(Usuario usuario) {
        System.out.println("Autenticando al nuevo usuario...");
        if(!usuario.getUserName().isEmpty()) {
            if(usuario.getPwd().length() > 5 && !usuario.getPwd().isEmpty()) {
                if(usuario.getCi() % 2 != 0) {
                    servidorUno.autenticacionUsuario(usuario);
                } else {
                    servidorDos.autenticacionUsuario(usuario);
                }
            } else {
                System.out.println("Contraseña demasiado corta!");
                System.out.println("===========================================");
            }
        } else {
            System.out.println("Nombre de usuario inválido!");
            System.out.println("===========================================");
        }
    }
}
