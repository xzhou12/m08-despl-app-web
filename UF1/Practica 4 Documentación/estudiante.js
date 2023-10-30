/**
 * Clase que representa a un estudiante, que es una persona y tiene una universidad asociada.
 * @class
 * @author Xiaobin Zhou
 */
const Persona = require('./Persona');

class Estudiante extends Persona {
    /**
     * Constructor de la clase Estudiante.
     * @constructor
     * @param {string} nombre - El nombre del estudiante.
     * @param {number} edad - La edad del estudiante.
     * @param {string} universidad - La universidad a la que asiste el estudiante.
     */
    constructor(nombre, edad, universidad) {
        super(nombre, edad);
        this.universidad = universidad;
    }

    /**
     * Permite al estudiante indicar que está estudiando.
     */
    estudiar() {
        console.log(`Estoy estudiando en la universidad ${this.universidad}`);
    }

    /**
     * Permite al estudiante indicar que está realizando un examen.
     */
    realizarExamen() {
        console.log(`Estoy realizando un examen en la universidad ${this.universidad}`);
    }
}

module.exports = Estudiante;
