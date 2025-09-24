# language: es
Característica: Navegación entre pantallas
  Como usuario de la app Marvel
  Quiero moverme entre las diferentes pantallas
  Para explorar las secciones disponibles

  Antecedentes:
    Dado que el usuario inicia sesion en la app

  Escenario: Navegar por el menú/tab
    Cuando navego hacia la sección "Personajes"
    Y luego navego hacia la sección "Comics"
    Entonces la vista debe mostrar la sección "Comics"
