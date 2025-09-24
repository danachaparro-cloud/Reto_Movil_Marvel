# language: es
Característica: Login en la aplicación
  Como usuario de la app Marvel
  Quiero iniciar sesión con credenciales válidas
  Para acceder a la pantalla principal

  Escenario: Login exitoso con usuario valido
    Dado que el usuario esta en la pantalla de login
    Cuando ingresa sus credenciales "usuario" y "password"
    Entonces deberia ver la pantalla principal
