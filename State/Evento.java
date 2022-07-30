package State;

public class Evento {
    private Estado estado;

    public Evento() {
        estado = null;
    }

    public void cambiarEvento(Estado estado){
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
