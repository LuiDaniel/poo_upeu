package uml.codigo;

/**
 * Clase principal que demuestra la relación de REALIZACIÓN del diagrama:
 * Pajaro y Avion son distintas clases que "realizan" la interfaz Volador,
 * pudiendo tratarse de forma polimorfica a traves de esa interfaz.
 */
public class Principal {
    public static void main(String[] args) {
        Volador[] voladores = { new Pajaro(), new Avion() };

        for (Volador v : voladores) {
            v.volar();
        }
    }
}
