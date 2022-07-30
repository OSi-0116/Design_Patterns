package AbstractFactory;
import AbstractFactory.Dona.Dona;
import AbstractFactory.Dona.donaChoco;
import AbstractFactory.Ponque.Ponque;
import AbstractFactory.Ponque.ponqueChoco;
import AbstractFactory.Galleta.Galleta;
import AbstractFactory.Galleta.galletaChoco;

public class factoryChoco implements FactoryPrincipal {

    public Dona rellenarDona() {
        return new donaChoco();
    }

    public Ponque rellenarPonque() {
        return new ponqueChoco();
    }

    public Galleta rellenarGalleta() {
        return new galletaChoco();
    }
}
