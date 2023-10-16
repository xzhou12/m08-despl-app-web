
/**
 * Esta clase representa a un estudiante, que es una persona y tiene una universidad asociada.
 * @author Xiaobin Zhou
 */
public class Estudiante extends Persona {
    private String universidad;

    /**
     * Constructor de la clase Estudiante.
     * 
     * @param nombre El nombre del estudiante.
     * @param edad La edad del estudiante.
     * @param universidad La universidad a la que asiste el estudiante.
     */
    public Estudiante(String nombre, int edad, String universidad) {
        super(nombre, edad);
        this.universidad = universidad;
    }

    /**
     * Permite al estudiante indicar que está estudiando.
     */
    public void estudiar() {
        System.out.println("Estoy estudiando en la universidad " + universidad);
    }

    /**
     * Permite al estudiante indicar que está realizando un examen.
     */
    public void realizarExamen() {
        System.out.println("Estoy realizando un examen en la universidad " + universidad);
    }
}