package ej3;
public class Main {
    public static void main(String[] args) {
        Folder folder1 = new Folder("Folder");
        folder1.add(new Archivo("Archivo").setNumPalabras(200));
        folder1.add(new Archivo("Archivo").setNumPalabras(100));
        folder1.add(new Archivo("Archivo").setNumPalabras(150));

        Folder folder2 = new Folder("Folder");
        folder2.add(new Archivo("Archivo").setNumPalabras(500));
        folder2.add(new Archivo("Archivo").setNumPalabras(300));
        folder2.add(new Archivo("Archivo").setNumPalabras(315));

        Folder unidad1 = new Folder("UnidadDisco");
        unidad1.add(folder1);
        unidad1.add(folder2);

        unidad1.contarPalabras();
    }
}
