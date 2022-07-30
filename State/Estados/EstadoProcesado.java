package State.Estados;

import State.Estado;
import State.Evento;

public class EstadoProcesado implements Estado {
    public void hacerAccion(Evento evento){
        System.out.println("El programa está procesando la foto...");
        evento.cambiarEvento(this);
    }

    public String toString() {
        return "(Estado de Procesado)";
    }
}
