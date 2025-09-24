# language: es
Característica: Busqueda de personaje por barra
  Como usuario de la app Marvel
  Quiero buscar un personaje por su nombre desde la barra
  Para ver el resultado en la lista

  Antecedentes:
    Dado que el usuario ha iniciado sesion con usuario "dana@test.com" y contrasena "123456"

  Escenario: Busqueda exitosa de un personaje
    Cuando el usuario busca el personaje "aqua"
    Entonces el usuario ve los personajes buscados

  Escenario: Personaje no existe
    Cuando el usuario busca el personaje "capitan"
    Entonces el usuario ve que el personaje no existe