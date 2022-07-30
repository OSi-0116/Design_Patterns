package Proxy;

public class Principal {
    public static void main(String[] args) {
        Red red = new redProxy();
        System.out.println("Primer acceso - Configuración Inicial y Cambio de IP");
        System.out.println("-------------------");
        red.cambio();
        System.out.println("-------------------");
        System.out.println("Segundo acceso - Cambio de IP nuevamente");
        System.out.println("-------------------");
        red.cambio();
    }
}
