package Proxy;

public class redImplementacion implements Red {

    public redImplementacion() {
        configuracion();
    }

    @Override
    public void cambio() {
        System.out.println("Cambio realizado satisfactoriamente.");
    }

    private void configuracion() {
        System.out.println("Configurando dispositivo...");
    }
}
