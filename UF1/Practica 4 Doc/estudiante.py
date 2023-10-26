from persona import Persona


class Estudiante(Persona):
    """
    Esta clase representa a un estudiante, que es una persona y tiene una universidad asociada.
    """

    def __init__(self, nombre, edad, universidad):
        """
        Constructor de la clase Estudiante.

        :param nombre: El nombre del estudiante.
        :param edad: La edad del estudiante.
        :param universidad: La universidad a la que asiste el estudiante.
        """
        super().__init__(nombre, edad)
        self.universidad = universidad

    def estudiar(self):
        """
        Permite al estudiante indicar que está estudiando.
        """
        print(f"Estoy estudiando en la universidad {self.universidad}")

    def realizar_examen(self):
        """
        Permite al estudiante indicar que está realizando un examen.
        """
        print(f"Estoy realizando un examen en la universidad {self.universidad}")