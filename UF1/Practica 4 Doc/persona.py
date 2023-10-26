class Persona:
    """
    Esta es una clase principal que representa una persona.
    """

    def __init__(self, nombre, edad):
        """
        Constructor de la clase Persona.

        :param nombre: El nombre de la persona.
        :param edad: La edad de la persona.
        """
        self.nombre = nombre
        self.edad = edad

    def get_nombre(self):
        """
        Obtiene el nombre de la persona.

        :return: El nombre de la persona.
        """
        return self.nombre

    def set_nombre(self, nombre):
        """
        Establece el nombre de la persona.

        :param nombre: El nombre a establecer.
        """
        self.nombre = nombre

    def get_edad(self):
        """
        Obtiene la edad de la persona.

        :return: La edad de la persona.
        """
        return self.edad

    def set_edad(self, edad):
        """
        Establece la edad de la persona.

        :param edad: La edad a establecer.
        """
        self.edad = edad

    def saludar(self):
        """
        Saluda a la persona.

        :return: Un saludo que incluye el nombre de la persona.
        """
        return f"¡Hola! Mi nombre es {self.nombre}"

    def birthday(self):
        """
        Incrementa la edad de la persona en 1 y muestra un mensaje de cumpleaños.
        """
        self.edad += 1
        print(f"Feliz cumpleaños, ahora tengo {self.edad} años.")

    def revisar_edad(self):
        """
        Revisa si la edad de la persona es válida.
        """
        if self.edad < 0:
            raise Exception("La edad no puede ser un número negativo.")
        else:
            print("La edad es válida.")