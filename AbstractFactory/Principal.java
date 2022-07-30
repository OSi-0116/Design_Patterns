package AbstractFactory;

public class Principal {
    private static Paquete prepararPaquete() {
        Paquete pack = null;
        FactoryPrincipal factory;
        String sabor = "vainilla";
        if (sabor.contains("chocolate")) {
            factory = new factoryChoco();
            pack = new Paquete(factory);
        } else if (sabor.contains("fresa")){
            factory = new factoryFresa();
            pack = new Paquete(factory);
        } else if (sabor.contains("vainilla")) {
            factory = new factoryVainilla();
            pack = new Paquete(factory);
        }
        return pack;
    }

    public static void main(String[] args) {
        Paquete pack = prepararPaquete();
        pack.rellenar();
    }
}
