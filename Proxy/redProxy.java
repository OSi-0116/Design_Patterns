package Proxy;

public class redProxy implements Red {
    private static Red red;

    @Override
    public void cambio() {
        if (red == null) {
            red = new redImplementacion();
        }
        red.cambio();
    }
}
