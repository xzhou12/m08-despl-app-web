
/**
 * Esta es la clase principal que contiene el m�todo main para probar las clases Persona y Estudiante.
 * @author Xiaobin Zhou
 */
public class Main {

	/**
     * Punto de entrada para la aplicaci�n. Crea instancias de Persona y Estudiante, y llama a m�todos en ellas.
     * 
     * @param args Los argumentos de la l�nea de comandos.
     */
	public static void main(String[] args) {
		Persona persona = new Persona("Juan", 25);
        System.out.println(persona.saludar());
        persona.birthday();

        try {
            persona.revisarEdad();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Estudiante estudiante = new Estudiante("Maria", 20, "UDL");
        System.out.println(estudiante.saludar());
        estudiante.estudiar();
        estudiante.realizarExamen();

	}

}
