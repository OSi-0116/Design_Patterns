package State.Estados;

import State.Estado;
import State.Evento;

public class EstadoRenderizado implements Estado {
    public void hacerAccion(Evento evento) {
        System.out.println("El programa está renderizando la foto...");
        evento.cambiarEvento(this);
    }

    public String toString() {
        return "(Estado de Renderizado)";
    }
}
