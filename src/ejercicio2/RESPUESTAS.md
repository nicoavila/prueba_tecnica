Cuál es el Stack de Android?

        El Stack representa las actividades previamente visualizadas, de forma que el usuario puede regresar a la actividad anterior pulsando la tecla “retorno”.

Qué es un archivo .APK?

        Es el formato de archivo utilizado para la distribución e instalación de aplicaciones Android, deriva del formato JAR de Java. Es básicamente un archivo comprimido en Zip con extension .APK

Qué es un Intent?

        Se utiliza Intent para invocar componentes o actividades, tales como Interfaces gráficas (UI), servicios, receptores de mensajes, código ejecutado en segundo plano, etc...

Cuál es el ciclo de vida de una aplicación Android?

        Una aplicación Android corre dentro de su propio proceso Linux. Este proceso se crea con la aplicación y continuará vivo hasta que ya no sea requerido y el sistema reclame su memoria para asignársela a otra aplicación. 
        La destrucción de un proceso no es controlada directamente por la aplicación, sino por el sistema, el que determina cuándo destruir el proceso. Lo hace basándose en el conocimiento que tiene de las partes de la aplicación que están corriendo (actividades y servicios), en la importancia de dichas partes para el usuario y en cuánta memoria disponible hay en un determinado momento.

Qué es ADB?

        "Android Debug Bridge" o puente para depuración en Android, es una herramienta de linea de comandos que permite comunicarse directamente con un sistema operativo android de algún dispositivo o emulador conectado al S.O. desde donde se ejecuta ADB.

Qué se define en un archivo manifest de una aplicación Android?

        Provee de toda la información esencial de la aplicación al sistema Android, esta información es necesaria antes que el sistema pueda ejecutar el código de la aplicación. Define lo siguiente:
        Nombre del paquete Java, este sirve como identificador unico de la aplicacion.

        Describe los componentes de la aplicación tales como, actividades, servicios, proveedores de contenido y receptores de difusión.

        Nombra las clases que implementan cada uno de los componentes y publica sus capacidades, como los mensajes "Intent" que pueden manejar. Estas declaraciones informan al sistema Android de los componentes y las condiciones en las que se pueden lanzar.

        Determina los procesos que alojan los componentes de la aplicación.

        Permisos que debe tener la aplicación para acceder a partes protegidas e interactuar con otras aplicaciones. También declara los permisos que otras aplicaciones deben tener para interactuar con los componentes de la aplicación.

        Enumera las clases de Instrumentación "Instrumentation" que proporcionan perfiles y otra información a medida que se ejecuta la aplicación durante la etapa de desarrollo.

        Declara el nivel mínimo de la API de Android que requiere la aplicación.

        Enumera las bibliotecas a las que se debe vincular la aplicación.

Qué es una notificación Toast?

        Es un mensaje sobrepuesto (popup) que provee de retroalimentacion simple sobre una operación. Aparece por un tiempo determinado sobre la actividad actual que permanece invisible o inactiva mientras el mensaje Toast es desplegado. No requiere ninguna acción del usuario.
