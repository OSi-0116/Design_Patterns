package State.Estados;

import State.Estado;
import State.Evento;

public class EstadoProducto implements Estado {
    public void hacerAccion(Evento evento) {
        System.out.println("El programa muestra la foto final");
        evento.cambiarEvento(this);
    }

    public String toString() {
        return "(Producto Final en Pantalla)";
    }
}
