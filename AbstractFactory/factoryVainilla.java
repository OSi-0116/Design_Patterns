package AbstractFactory;
import AbstractFactory.Dona.Dona;
import AbstractFactory.Dona.donaVainilla;
import AbstractFactory.Ponque.Ponque;
import AbstractFactory.Ponque.ponqueVainilla;
import AbstractFactory.Galleta.Galleta;
import AbstractFactory.Galleta.galletaVainilla;

public class factoryVainilla implements FactoryPrincipal {

    public Dona rellenarDona() {
        return new donaVainilla();
    }

    public Ponque rellenarPonque() {
        return new ponqueVainilla();
    }

    public Galleta rellenarGalleta() {
        return new galletaVainilla();
    }
}
