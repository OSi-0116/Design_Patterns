package State;
import State.Estados.EstadoCaptura;
import State.Estados.EstadoProcesado;
import State.Estados.EstadoRenderizado;
import State.Estados.EstadoProducto;

public class Principal {
    public static void main(String[] args) {
        Evento evento = new Evento();

        System.out.println("");

        EstadoCaptura estadoCaptura = new EstadoCaptura();
        estadoCaptura.hacerAccion(evento);

        System.out.println(evento.getEstado().toString());
        System.out.println("-----------------------------------------------------");

        EstadoProcesado estadoProcesado = new EstadoProcesado();
        estadoProcesado.hacerAccion(evento);

        System.out.println(evento.getEstado().toString());
        System.out.println("-----------------------------------------------------");

        EstadoRenderizado estadoRenderizado = new EstadoRenderizado();
        estadoRenderizado.hacerAccion(evento);

        System.out.println(evento.getEstado().toString());
        System.out.println("-----------------------------------------------------");

        EstadoProducto estadoProducto = new EstadoProducto();
        estadoProducto.hacerAccion(evento);

        System.out.println(evento.getEstado().toString());
        System.out.println("-----------------------------------------------------");
    }
}
