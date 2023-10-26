from persona import Persona
from estudiante import Estudiante


if __name__ == "__main__":
    persona = Persona("Mauri", 25)
    print(persona.saludar())
    persona.birthday()

    try:
        persona.revisar_edad()
    except Exception as e:
        print(e)

    estudiante = Estudiante("Nuria", 20, "UDL")
    print(estudiante.saludar())
    estudiante.estudiar()
    estudiante.realizar_examen()