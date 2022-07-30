package AbstractFactory;
import AbstractFactory.Dona.Dona;
import AbstractFactory.Ponque.Ponque;
import AbstractFactory.Galleta.Galleta;

public class Paquete {
    private Dona dona;
    private Ponque ponque;
    private Galleta galleta;

    public Paquete(FactoryPrincipal factory) {
        dona = factory.rellenarDona();
        ponque = factory.rellenarPonque();
        galleta = factory.rellenarGalleta();
    }

    public void rellenar() {
        dona.rellenarDona();
        ponque.rellenarPonque();
        galleta.rellenarGalleta();
    }
}
