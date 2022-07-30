package AbstractFactory.Galleta;

public class galletaVainilla implements Galleta {
    @Override
    public void rellenarGalleta() {
        System.out.println("Se fabricó una galleta rellena de vainilla.");
    }
}
