
/**
 * Esta es una clase principal que representa una persona.
 * @author Xiaobin Zhou
 */
public class Persona {
	private String nombre;
    private int edad;

    /**
     * Constructor de la clase Persona.
     * 
     * @param nombre El nombre de la persona.
     * @param edad La edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre de la persona.
     * 
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establece el nombre de la persona.
     * 
     * @param nombre El nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad de la persona.
     * 
     * @return La edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     * 
     * @param edad La edad a establecer.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Saluda a la persona.
     * 
     * @return Un saludo que incluye el nombre de la persona.
     */
    public String saludar() {
        return "¡Hola! Mi nombre es " + nombre;
    }
    
    /**
     * Incrementa la edad de la persona en 1 y muestra un mensaje de cumpleaños.
     */
    public void birthday() {
        this.edad++;
        System.out.println("Feliz cumpleaños, ahora tengo " + this.edad + " años.");
    }

    /**
     * Revisa si la edad de la persona es válida.
     * 
     * @throws Exception Si la edad es un número negativo.
     */
    public void revisarEdad() throws Exception {
        if (edad < 0) {
            throw new Exception("La edad no puede ser un número negativo.");
        } else {
            System.out.println("La edad es válida.");
        }
    }
}
