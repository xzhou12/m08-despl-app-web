/**
 * Clase principal que contiene el método main para probar las clases Persona y Estudiante.
 * @class
 * @author Xiaobin Zhou
 */
const Persona = require('./Persona');
const Estudiante = require('./estudiante');

/**
 * Función principal que crea instancias de Persona y Estudiante, y llama a métodos en ellas.
 */
function main() {
    const persona = new Persona("Juan", 25);
    console.log(persona.saludar());
    persona.birthday();

    try {
        persona.revisarEdad();
    } catch (error) {
        console.log(error.message);
    }

    const estudiante = new Estudiante("Maria", 20, "UDL");
    console.log(estudiante.saludar());
    estudiante.estudiar();
    estudiante.realizarExamen();
}

// Llamada al método main para iniciar la aplicación.
main();
