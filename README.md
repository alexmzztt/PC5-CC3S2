# PC5-CC3S2

## Pregunta 4

### Metodo 1

Primero creamos una carpeta llamada "files" donde pondremos los archivos
default.conf , nginx.conf, html.tar.gz y el Dockerfile lo creamos fuera de la carpeta
 y ejecutamos el comando "docker build -t docker-example ."

![](assets/1.jpg)

Luego verificamos que la imagen se ha creado usando docker images

![](assets/2.jpg)

Ahora lanzamos un contenedor con la imagen que hemos creado y comprobamos que se esta ejecutando

![](assets/3.jpg)

Ahora abrimos localhost:8080 en el navegador

![](assets/4.jpg)

Ejecutamos los siguiente comandos

![](assets/5.jpg)

![](assets/6.jpg)

Detenemos y eliminamos los contenedores que lanzamos

![](assets/7.jpg)

### Metodo 2

Descargaremos la imagen con el siguiente comando "docker image pull alpine:lastest"

![](assets/8.jpg)

Luego ejecutamos el contenedor en primer plano usando "-it", y ejecutamos los siguientes comandos

![](assets/9.jpg)

Luego guardamos el contenedor

![](assets/10.jpg)

### Metodo 3

Descargamos 

![](assets/11.jpg)

Creamos el Dockerfile

![](assets/12.jpg)

Construimos la imagen

![](assets/13.jpg)

Comparamos el tamaño de la imagen

![](assets/14.jpg)

Ahora la probamos, pero primero detenemos y eliminamos el anterior contenedor alpine-test

![](assets/15.jpg)

Luego la probamos y verificamos usando el comando "cat /etc/*release"

![](assets/16.jpg)





















