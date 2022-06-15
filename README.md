# Mercado-Libre-Mutante
Ejercicio

_Magneto quiere reclutar la mayor cantidad de mutantes para poder luchar
contra los X-Men.
Te ha contratado a ti para que desarrolles un proyecto que detecte si un
humano es mutante basándose en su secuencia de ADN._

## Comenzando 🚀

_El proyecto esta basado en lenguaje JAVA 1.8, desplegando un servico REST._

### Pre-requisitos 📋
- _Para Ejecutar el Programa de manera Local, se necesita tener Java 1.8.0_111 o posterior, además de no tener ocupado el puerto 8080_

### Deployment 🔧
_El proyecto **Mutante** se puede ejecutar de Manera Local, de la siguiente manera :_

_- Ejecutar el .jar Resultante de la compilación el código_

```
java -jar mutante-1.0-SNAPSHOT.jar
```
_la base de datos esta montada en un servicio de AWS-RDS_

![Image text](https://github.com/saedsap/Mercado-Libre-Mutante/blob/main/mutanteSpring.PNG)

_La imagen muestra la ejecución satisfacoria de la aplicacón en el puerto 8080_

## Instruciones de ejeción del API-REST ⚙️

_La aplicación se puede ejecutar de manera local o bien esta publicada en AWS Elastic Beanstalk, los endpoint son los siquientes:_

- Local 
```
http://localhost:8080/mercado-libre/
```
- Publicada en AWS Elastic Beanstalk
```
http://mercadolibremutantes-env.eba-s3jmw4nw.us-east-1.elasticbeanstalk.com/mercado-libre/
```
_La aplicacion expone tres servicios:_

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

Servicio de prueba con un saludo a Margneto
```
/saludo
```

### Pruebas de Ejecucion 🔩
#### **mutant**
- _Ejecución de una cadena mutante, con un HTTP 200-OK, con la siguinete cadena:_

```
{
"dna":["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]
}
```
```
Status: 200 OK
```

- _Ejecución de una cadena no-mutante, con un HTTP 403-Forbidden, con la siguinete cadena:_

```
{
"dna":["ATGCGA","CAGTGC","TTGTGT","AGAAGG","TCACTG","TCACTG"]
}
```
```
Status: 403 Forbidden
```
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
#### **saludo**
- _Ejecución del servicio para probar que nuestra apicacion esta arriba_

```
Un Saludo Para Magneto!!!
```
## Consideraciones
La API considera las siguientes validaciones en la secuencia de ADN enviada, si alguna no se cumple regresara **403 Forbidden** (Sin guardar el registro en BD):
- Las secuencias deben tener la misma longitud
- Las secuencias solo deben de tener (A,T,C,G)

Las secuencias en minisculas la aplicación realizara el UpperCase automaticamente.

## Construido con 🛠️

* [SpringBoot](https://spring.io/projects/spring-boot) - El framework web usado
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [MYSQL](https://rometools.github.io/rome/](https://dev.mysql.com/) - Motor de Base de Datos
* [AWS](https://maven.apache.org/](https://aws.amazon.com/es/getting-started/) - Administración integral de aplicaciones web.
* [jacoco] - JaCoCo Java Code Coverage Library

## Coverage 🖇️

_Code coverage > 80%, utilizando la liberia de Java JACOCO:_


## Autores ✒️

* **Saúl Eduardo Santillán Pérez** - *Ejercicio Mercado-libre-mutantes* - [saedsap](https://github.com/saedsap)



