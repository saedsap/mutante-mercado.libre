# Mercado-Libre-Mutante
Ejercicio

_Magneto quiere reclutar la mayor cantidad de mutantes para poder luchar
contra los X-Men.
Te ha contratado a ti para que desarrolles un proyecto que detecte si un
humano es mutante basándose en su secuencia de ADN._

## Comenzando 🚀

_El proyecto está basado en lenguaje JAVA 1.8, desplegando un servicio REST._

### Pre-requisitos 📋
- _Para Ejecutar el Programa de manera Local, se necesita tener Java 1.8.0_111 o posterior, además de no tener ocupado el puerto 8080_

### Deployment 🔧
_El proyecto **Mutante** se puede ejecutar de Manera Local, de la siguiente manera :_

_- Ejecutar el .jar Resultante de la compilación el código_

```
java -jar mutante-1.0-SNAPSHOT.jar
```
_la base de datos está montada en un servicio de AWS-RDS_

![Image text](https://github.com/saedsap/mutante-mercado.libre/blob/master/mutanteSpring.PNG)

_La imagen muestra la ejecución satisfactoria de la aplicación en el puerto 8080_

## Instrucciones de ejecución del API-REST ⚙️

_La aplicación se puede ejecutar de manera local o bien está publicada en AWS Elastic Beanstalk, los endpoint son los siguientes:_

- Local 
```
http://localhost:8080/mercado-libre/
```
- Publicada en AWS Elastic Beanstalk
```
http://mercadolibremutantes-env.eba-s3jmw4nw.us-east-1.elasticbeanstalk.com/mercado-libre/
```
_La aplicación expone tres servicios:_

- _POST_ **mutant**

Servicio en donde se pueda detectar si un humano es mutante enviando la secuencia de ADN
```
/mutant/
```
- _POST_ **stats**


Servicio con las estadísticas de las verificaciones de ADN
```
/stats
```
- _GET_ **saludo**

Servicio de prueba con un saludo a Magneto
```
/saludo
```

### Pruebas de Ejecución 🔩
#### **mutant**
- _Ejecución de una cadena mutante, con un HTTP 200-OK, con la siguiente cadena:_

```
{
"dna":["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]
}
```
```
Status: 200 OK
```
![Image text](https://github.com/saedsap/mutante-mercado.libre/blob/master/200ok.PNG)

- _Ejecución de una cadena no-mutante, con un HTTP 403-Forbidden, con la siguiente cadena:_

```
{
"dna":["ATGCGA","CAGTGC","TTGTGT","AGAAGG","TCACTG","TCACTG"]
}
```
```
Status: 403 Forbidden
```
![Image text](https://github.com/saedsap/mutante-mercado.libre/blob/master/403.PNG)

#### **stats**
- _Ejecución del servicio para obtener la estadística de las verificaciones de ADN, con un HTTP 200-OK, obteniendo el objeto en formato JSON:_

```
{
    "count_mutant_dna": 6633,
    "count_human_dna": 28,
    "ratio": 0.99579644
}
```
```
Status: 200 OK
```
![Image text](https://github.com/saedsap/mutante-mercado.libre/blob/master/stats.PNG)

#### **saludo**
- _Ejecución del servicio para probar que nuestra aplicación está arriba_

```
Un Saludo Para Magneto!!!
```
## Consideraciones
La API considera las siguientes validaciones en la secuencia de ADN enviada, si alguna no se cumple regresara **403 Forbidden** (Sin guardar el registro en BD):
- Las secuencias deben tener la misma longitud
- Las secuencias solo deben de tener (A,T,C,G)

Las secuencias en minúsculas la aplicación realizará el UpperCase automáticamente.

## Coverage 📊

_Code coverage > 80%, utilizando la librería de Java JACOCO:_

![Image text](https://github.com/saedsap/mutante-mercado.libre/blob/master/coverage.PNG)

## Construido con 🛠️

* [SpringBoot](https://spring.io/projects/spring-boot) - El framework web usado
* [Maven](https://maven.apache.org) - Manejador de dependencias
* [Mysql](https://dev.mysql.com) - Motor de Base de Datos
* [Aws](https://aws.amazon.com/es/getting-started) - Administración integral de aplicaciones web.
* [Postman](https://www.postman.com/) - Motor de pruebas 
* Jacoco - JaCoCo Java Code Coverage Library



## Autores ✒️

* **Saúl Eduardo Santillán Pérez** - *Ejercicio Mercado-libre-mutantes* - [saedsap](https://github.com/saedsap)
