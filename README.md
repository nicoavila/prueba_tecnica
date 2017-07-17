# Prueba Técnica

La presente prueba técnica pretende evaluar sus habilidades y competencias para el cargo de **Desarrollador Senior** del **Centro de Informática Biomédica** [https://www.getonbrd.cl/empleos/programacion/desarrollador-ci3](link).
El test consta de 3 problemas los cuales debe resolver en un periodo máximo de 48hrs. desde que ha sido presentado este repositorio vía email.

## Cómo responder la prueba técnica?

Para responder la prueba técnica debe realizar un **fork** de este proyecto en su cuenta personal de **Github** siguiendo las siguientes convenciones:

1. Crear una carpeta **src** que contenga las siguientes subcarpetas: **js**, **php** y **swift**
2. Crear los tres ejercicios, con su correspondiente solución en cada una de las subcarpetas según corresponda
3. Realizar un commit y push hacia **su repositorio** con la solución para cada uno de los puntos

### Prueba 1: Javascript
Defina una función llamada `pipeme()` en el objeto `String`. Esta función no debe aceptar argumentos. Al llamar a esta función debe:
1. Transformar cada caracter del string en mayúsculas
2. Insertar entre cada caracter un pipe `|`. Así el resultado sería por ejemplo `"biomedica" -> "B|I|O|M|E|D|I|C|A"`.
3. Crear esta función en un archivo JS que pueda ser ejecutado mediante la consola de **NodeJS**. No debe utilizar dependencias externas para realizar esta tarea.

### Prueba 2: PHP
Utilizando el administrador de dependencias [https://getcomposer.org/](Composer) instale y utilice Gruzzle v6.x para obtener todos los álbumes de `Daft Punk` desde la API de Spotify [https://developer.spotify.com/web-api/endpoint-reference/](link) e imprimir su `nombre` y `fecha de lanzamiento` mediante `echo` separando los datos mediante `;`: `ej: Homework;1997`

1. Cree una clase que encapsule toda la lógica para realizar la llamada a la API
2. Presente cada uno de los álbumes cono una nueva línea.

### Prueba 3: Swift
Calcule la distancia entre los puntos (3,0) y (-7,4) en un plano cartesiano utilizando un archivo de **Swift Playgrounds**:
1. Implemente la fórmula para el cálculo de distancia entre dos puntos en un plano de coordenadas cartesiano: `d = sqrt((x2-x1)^2 + (y2-y1)^2))`
2. El resultado debe imprimirlo en consola utilizando **Swift Playgrounds**