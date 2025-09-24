# language: es
Característica: Busqueda de personaje
  Como usuario de la app Marvel
  Quiero buscar un personaje por su nombre
  Para ver el resultado en la lista

  Antecedentes:
    Dado que el usuario ha iniciado sesion con usuario "dana@test.com" y contrasena "123456"

  Escenario: Busqueda exitosa de un personaje
    Cuando busca el personaje
    Entonces deberia ver el personaje buscado
