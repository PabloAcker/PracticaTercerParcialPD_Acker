package ej4;
public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(6714193, "Emanuel", "12345");
        Usuario usuario2 = new Usuario(7672149, "Laguna", "soyElLagu123");
        Usuario usuario3 = new Usuario(7416491, "Charlie", "scontrasenia");
        Usuario usuario4 = new Usuario(6591412, "Alex", "123456789");
        Usuario usuario5 = new Usuario(9164912, "Dylan", "unodostrescuatro");
        Usuario usuario6 = new Usuario(8641002, "", "unaContraComun");

        ServidorProxy servidorProxy = new ServidorProxy();

        servidorProxy.autenticacionUsuario(usuario1);
        servidorProxy.autenticacionUsuario(usuario2);
        servidorProxy.autenticacionUsuario(usuario3);
        servidorProxy.autenticacionUsuario(usuario4);
        servidorProxy.autenticacionUsuario(usuario5);
        servidorProxy.autenticacionUsuario(usuario6);
    }
}
