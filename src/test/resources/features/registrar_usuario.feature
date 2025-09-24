# language: es
Característica: Registro de usuario
  Como nuevo usuario
  Quiero registrarme en la app Marvel
  Para poder iniciar sesión y usar la aplicación

  Escenario: Registro exitoso de un nuevo usuario
    Dado que el usuario abre la aplicacion y selecciona registrarse
    Cuando completa el formulario de registro con datos validos
    Entonces deberia ver el mensaje de confirmacion de registro
