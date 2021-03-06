﻿
### Escuela Colombiana de Ingeniería

## Paola A. Cuellar - Laura A. Bernal  

### MVC Primefaces Introduction

### Introducción a proyectos Web

## Parte I. - Jugando a ser un cliente HTTP

3. Revise el resultado obtenido. ¿Qué código de error sale?
Sale el código de error 301, porque lo que se está solicitando se movió de forma permanente a otro espacio.
¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?
1XXX Información
2XXX Éxito
3XXX Redireccionamiento
4XXX Error del Cliente
5XXX Error del Servidor


5. ¿Cuál es la diferencia entre los verbos GET y POST? ¿Qué otros tipos de peticiones existen?


![](img/getYpost.PNG)
[tomado de get y post HTML](https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=527:get-y-post-html-method-formas-de-envio-de-datos-en-formulario-diferencias-y-ventajas-ejemplos-cu00721b&catid=69&Itemid=192)

6. ¿Cuáles son las diferencias con los diferentes parámetros?

~ *curl -V* Al usar el parámetro -v en el comando cURL, se habilita el modo detallado e imprimirá los detalles de el sitio de una forma completa  
~ *curl _I* Los encabezados HTTP permiten que el servidor web remoto realice el proceso de envió de información adicional sobre sí junto con la solicitud real, esto es usado para ofrecer al cliente detalles sobre cómo se está administrando la solicitud actual.

## Parte II.

4. Compile y ejecute la aplicación en el servidor embebido Tomcat, a través de Maven con:  
>mvn package  
>mvn tomcat7:run

![](img/helloworld.jpeg)

## Parte III.

18. Cree un formulario que tenga un campo para ingresar un número y un botón.

![](img/imagenHTML.jpeg)

20. Cambie el formulario para que ahora en lugar de POST, use el método GET.  
    ¿Qué diferencia observa?  
    Observamos que la diferencia entre el método POST y el método GET es que cuando hacemos la prueba con el método POST nos muestra detalles en la URL que en GET no son visibles.  

21. ¿Qué se está viendo? 
    Vemos el texto de hello world, junto con el campo donde se ingresa el número y el botón de "enviar".  

![](img/SeVe.jpeg)

# Diagrama de Clases del proyecto 

![](img/diagramaClases.PNG)

## Parte IV. - Frameworks Web MVC – Java Server Faces / Prime Faces

9. Si no hay errores, la aplicación debería quedar accesible en la URL: [http://localhost:8080/faces/guess.xhtml](http://localhost:8080/faces/guess.xhtml)

![](img/PantallaPrincipal.PNG)

10. b.  ¿Qué valor tiene cada uno?  

Un valor diferente

![](img/Pruebas.PNG)

c. use la anotación @SessionScoped en lugar de @ApplicationScoped. ¿Cuál es la diferencia entre los backing-beans de sesión y los de aplicación?  

en los de aplicación son individuales los datos del número a adivinar y los números que ha intentado, en el de sesión comparten el número a adivinar y muestran el número de intento de la otra persona.

![](img/SessionTest.PNG)

## CODAY
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/808778ab71044192946b471d27e6c39f)](https://www.codacy.com/manual/lale1507/CVDS-Lab05?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=lale1507/CVDS-Lab05&amp;utm_campaign=Badge_Grade)

## CIRCLECI
[![CircleCI](https://circleci.com/gh/lale1507/CVDS-Lab05.svg)](https://app.circleci.com/github/lale1507/CVDS-Lab05/pipelines)
