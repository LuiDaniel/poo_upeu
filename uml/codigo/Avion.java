package uml.codigo;

/**
 * Avion realiza (implementa) la interfaz Volador.
 */
public class Avion implements Volador {
    @Override
    public void volar() {
        System.out.println("El avion vuela impulsado por sus motores.");
    }
}
