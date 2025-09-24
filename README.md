# Reto Automatización Móvil – Marvel App

Automatización de pruebas móviles usando **Appium + Serenity BDD + Screenplay Pattern** sobre la aplicación **Marvel Animation App**.

---

## 📦 Requisitos previos

1. **Java 11** o superior instalado
   ```bash
   java -version
2. Gradle Wrapper incluido en el proyecto (./gradlew).

3. Android SDK instalado y configurado (ANDROID_HOME en variables de entorno).

4. Dispositivo físico o emulador Android con depuración USB habilitada.

   En este reto se usa un Redmi Note 11S con Android 13.

5. Appium Server instalado globalmente:

npm install -g appium
appium --version

⚙️ Configuración del dispositivo físico

1. En tu celular activa Opciones de desarrollador:

   Ajustes → Acerca del teléfono → toca varias veces Versión de MIUI.

   Luego activa Depuración USB.

2. Conecta el celular al PC y valida conexión:

adb devices

Debe aparecer como device.

3. Instala la APK de la app:

   adb install -r marvel-app-new.apk

🔧 Configuración del proyecto

Archivo: serenity.properties

webdriver.driver=appium
appium.hub=http://127.0.0.1:4723/wd/hub

# Configuración del dispositivo
appium.platformName=Android
appium.platformVersion=13
appium.deviceName=RedmiNote11S
appium.automationName=UiAutomator2

# App bajo prueba
appium.appPackage=com.example.marvel_animation_app
appium.appActivity=.MainActivity

🚀 Ejecución de pruebas

1. Inicia Appium Server:

   appium --base-path /wd/hub

2. Ejecuta las pruebas con Gradle:

   ./gradlew clean test

3. Revisa el reporte Serenity:

   build/reports/serenity/index.html

📑 Escenarios automatizados

1. Login exitoso con usuario válido ✅

   Se ingresan credenciales.

   Se valida acceso a pantalla principal.

2. Búsqueda de personaje 🔍

   Se ingresa texto en barra de búsqueda.

   Se valida resultado visible.

3. Agregar ítem a lista ➕

   Se hace scroll hasta un personaje.

   Se agrega a la lista.

   Se valida en la lista.

4. Eliminar ítem de lista ❌

   Swipe sobre un ítem agregado.

   Validar que desaparece.

5. Navegación entre pantallas 📲

   Se navega con menú/tab.

   Se valida cambio de vista.

🧠 Justificación de escenarios seleccionados

   Login: flujo base indispensable.

   Búsqueda: interacción con inputs y validación de resultados.

   Agregar ítem: acciones de scroll y tap, cubre un caso funcional clave.

   Eliminar ítem: prueba de interacción avanzada con swipe.

   Navegación: asegura que la aplicación permite moverse entre vistas principales.

Estos escenarios garantizan cobertura funcional representativa y variedad de acciones móviles (clicks, scroll, swipe, inputs, validaciones).

Evidencia

   Reportes HTML generados automáticamente en:

   build/reports/serenity/index.html