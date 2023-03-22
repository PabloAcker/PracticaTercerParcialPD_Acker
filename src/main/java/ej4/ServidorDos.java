package ej4;

import java.util.ArrayList;
import java.util.List;
public class ServidorDos implements ICluster {
    private List<Usuario> usuarioList;
    public ServidorDos() {
        usuarioList = new ArrayList<>();
    }
    public void showAllUsers() {
        for(Usuario usuario : usuarioList) {
            usuario.showInfo();
        }
    }
    @Override
    public void autenticacionUsuario(Usuario usuario) {
        System.out.println("Añadiendo al nuevo usuario...\nNombre: " + usuario.getUserName() + "; Se lo añadió al Servidor 2");
        usuarioList.add(usuario);
        System.out.println("Mostrando la informacion de todos los usuarios en el Servidor 2: ");
        this.showAllUsers();
        System.out.println("===========================================");
    }
}
