package ej3;

import java.util.ArrayList;
import java.util.List;

public class Folder extends UnidadDisco {
    private List<UnidadDisco> folderList = new ArrayList<>();
    int palabrasEnTotal = 0;
    public Folder(String tipoArchivo) {
        super(tipoArchivo);
    }
    @Override
    public void contarPalabras() {
        System.out.println("Tipo de composite: " + getTipoArchivo());
        for(UnidadDisco unidadDisco : folderList) {
            unidadDisco.contarPalabras();
            palabrasEnTotal = palabrasEnTotal + unidadDisco.getNumPalabras();
        }
        if(this.getTipoArchivo().startsWith("Folder")){
            this.setNumPalabras(palabrasEnTotal);
            System.out.println("\tCantidad de palabras en el folder: " + palabrasEnTotal);
        } else if (this.getTipoArchivo().startsWith("UnidadDisco")){
            this.setNumPalabras(palabrasEnTotal);
            System.out.println("\n===================================================");
            System.out.println("Cantidad de palabras en la Unidad de Disco: " + palabrasEnTotal);
        }
    }
    @Override
    public void add(UnidadDisco unidadDisco) {
        folderList.add(unidadDisco);
    }
    @Override
    public void remove(UnidadDisco unidadDisco) {
        folderList.remove(unidadDisco);
    }
}
