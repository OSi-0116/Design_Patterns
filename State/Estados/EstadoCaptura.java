package State.Estados;

import State.Estado;
import State.Evento;

public class EstadoCaptura implements Estado {
    public void hacerAccion(Evento evento) {
        System.out.println("El programa está capturando la foto...");
        evento.cambiarEvento(this);
    }

    public String toString() {
        return "(Estado de Captura)";
    }
}
