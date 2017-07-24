# Prueba Técnica

La presente prueba técnica pretende evaluar sus habilidades y competencias para el cargo de **Desarrollador Senior** del **Centro de Informática Biomédica** [link](https://www.getonbrd.cl/empleos/programacion/desarrollador-ci3/).  
El test consta de 3 problemas los cuales debe resolver en un periodo máximo de 48hrs. desde que ha sido presentado este repositorio vía email.

## Cómo responder la prueba técnica?

Para responder la prueba técnica debe realizar un **fork** de este proyecto en su cuenta personal de **Github** siguiendo las siguientes convenciones:

1. Crear una carpeta **src** que contenga las siguientes subcarpetas: **js** y **php**
2. Crear los tres ejercicios, con su correspondiente solución en cada una de las subcarpetas según corresponda
3. Realizar un commit y push hacia **su repositorio** con la solución para cada uno de los puntos

### Prueba 1: Javascript
Realice una llamada asíncrona al endpoint de **openFDA** para consultar efectos adversos sobre medicamentos [https://api.fda.gov/drug/event.json?limit=10](https://api.fda.gov/drug/event.json?limit=1). Debe traer la información de los últimos 15 registros. Revise los parámetros query de la URL anterior para obtener más registros.  
Con esa información, debe desplegar los resultados en una tabla basado en la siguiente información a extraer (en este caso, se utiliza notación [JsonPATH](http://jsonpath.com/) para mostrar los datos a obtener)

* `$.results[*].patient.drug[*].medicinalproduct`
* `$.results[*].patient.drug[*].drugindication`

1. **No debe utilizar jQuery para realizar la llamada**
2. Utilice `forEach` para procesar la información
3. Utilice **Promesas**
3. Despliegue toda la información en una tabla de dos columnas.
4. Utilice un archivo **index.html** y **script.js** para presentar la resolución del ejercicio

### Prueba 2: PHP
Dado el archivo CSV `datos.csv` debe llenar los datos marcados como `ND` con el promedio de cada columna a la cual pertenezca. Así por ejemplo

| A |
|---|
| 1 |
| 5 |
|ND |
| 3 |

`ND = (1 + 5 + 3) / 2`

1. Debe utilizar el **paradigma POO** para realizar este ejemplo. Esto incluye una **clase** con funciones y atributos que permitan procesar el archivo `.csv`, asi como una instancia de la clase. Puede utilizar más de un archivo si cree necesario.
2. Debe presentar el resultado de la operación en pantalla.
3. Debe guardar un archivo llamado `datos_procesados.csv` con los datos ND reemplazados