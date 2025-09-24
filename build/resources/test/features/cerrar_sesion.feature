# language: es
Característica: Cerrar sesion
  Como usuario registrado
  Quiero cerrar sesion
  Para salir de la aplicacion de forma segura

  Antecedentes:
    Dado que el usuario ha iniciado sesion con usuario "dana@test.com" y contrasena "123456"

  Escenario: Usuario cierra sesion exitosamente
    Cuando el usuario cierra sesion
    Entonces deberia ver la pantalla login