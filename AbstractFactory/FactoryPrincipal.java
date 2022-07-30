package AbstractFactory;
import AbstractFactory.Dona.Dona;
import AbstractFactory.Ponque.Ponque;
import AbstractFactory.Galleta.Galleta;

public interface FactoryPrincipal {
    Dona rellenarDona();
    Ponque rellenarPonque();
    Galleta rellenarGalleta();
}
