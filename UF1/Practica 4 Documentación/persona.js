/**
 * Clase que representa a una persona.
 * @class
 * @author Xiaobin Zhou
 */
class Persona {
    /**
     * Constructor de la clase Persona.
     * @constructor
     * @param {string} nombre - El nombre de la persona.
     * @param {number} edad - La edad de la persona.
     */
    constructor(nombre, edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre de la persona.
     * @returns {string} El nombre de la persona.
     */
    getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre de la persona.
     * @param {string} nombre - El nombre a establecer.
     */
    setNombre(nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad de la persona.
     * @returns {number} La edad de la persona.
     */
    getEdad() {
        return this.edad;
    }

    /**
     * Establece la edad de la persona.
     * @param {number} edad - La edad a establecer.
     */
    setEdad(edad) {
        this.edad = edad;
    }

    /**
     * Saluda a la persona.
     * @returns {string} Un saludo que incluye el nombre de la persona.
     */
    saludar() {
        return `¡Hola! Mi nombre es ${this.nombre}`;
    }

    /**
     * Incrementa la edad de la persona en 1 y muestra un mensaje de cumpleaños.
     */
    birthday() {
        this.edad++;
        console.log(`¡Feliz cumpleaños! Ahora tengo ${this.edad} años.`);
    }

    /**
     * Revisa si la edad de la persona es válida.
     * @throws {Error} Si la edad es un número negativo.
     */
    revisarEdad() {
        if (this.edad < 0) {
            throw new Error("La edad no puede ser un número negativo.");
        } else {
            console.log("La edad es válida.");
        }
    }
}

module.exports = Persona;
