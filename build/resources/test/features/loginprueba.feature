# language: es
Característica: Login en la aplicación
  Como usuario de la app Marvel
  Quiero iniciar sesión con credenciales válidas
  Para acceder a la pantalla principal

  Escenario: Probar login
  Dado que el usuario ha iniciado sesion con usuario "dana@test.com" y contrasena "123456"
  Entonces deberia ver la pantalla principal
