package AbstractFactory;
import AbstractFactory.Dona.Dona;
import AbstractFactory.Dona.donaFresa;
import AbstractFactory.Ponque.Ponque;
import AbstractFactory.Ponque.ponqueFresa;
import AbstractFactory.Galleta.Galleta;
import AbstractFactory.Galleta.galletaFresa;

public class factoryFresa implements FactoryPrincipal {

    public Dona rellenarDona() {
        return new donaFresa();
    }

    public Ponque rellenarPonque() {
        return new ponqueFresa();
    }

    public Galleta rellenarGalleta() {
        return new galletaFresa();
    }
}
