package ej2;
public class Main {
    public static void main(String[] args) {
        IEmpresa empresa = new Empresa("EPSAS", new InstalacionAgua(30, "35 dias", 5),new PagoEfectivo());
        empresa.realizarInstalacion();
        empresa.consultarFormaPago();


        empresa.setInstalacion(new InstalacionElectrica(70, "10 dias", 2));
        empresa.setPago(new PagoTransferencia());
        empresa.realizarInstalacion();
        empresa.consultarFormaPago();


        empresa.setInstalacion(new InstalacionAlcantarillado(50, "80 dias", 20));
        empresa.setPago(new PagoApp());
        empresa.realizarInstalacion();
        empresa.consultarFormaPago();


        empresa.setInstalacion(new InstalacionAgua(70, "29 dias", 4));
        empresa.setPago(new PagoEfectivo());
        empresa.realizarInstalacion();
        empresa.consultarFormaPago();
    }
}
