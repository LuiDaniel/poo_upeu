package uml.codigo;

/**
 * Pajaro realiza (implementa) la interfaz Volador.
 */
public class Pajaro implements Volador {
    @Override
    public void volar() {
        System.out.println("El pajaro vuela batiendo sus alas.");
    }
}
