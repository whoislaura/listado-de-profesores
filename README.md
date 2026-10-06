# Listado de profesores

Ejercicio académico de la asignatura **Estructura de Datos**, correspondiente a la carrera de **Ingeniería Informática**.

## Descripción

El proyecto implementa una lista simplemente enlazada para gestionar los datos de profesores de un departamento de informática. De cada profesor se conoce:

- Nombre.
- Edad.
- Categoría docente: Instructor, Asistente, Auxiliar o Titular.

El objetivo es aplicar los conceptos de nodos, referencias y recorrido de una lista simplemente enlazada.

## Funcionalidades

La solución contempla las siguientes operaciones específicas:

- `proxCambio()`: obtiene los nombres de los instructores mayores de 26 años, considerados próximos a cambiar a la categoría de asistentes.
- `mostrarLista()`: obtiene la información de los profesores ordenada de mayor a menor por edad.
- `cantProfesores()`: obtiene la cantidad de profesores agrupada por categoría docente.

También se incluyen operaciones generales de la lista enlazada, como agregar, insertar, eliminar, consultar, concatenar, limpiar y comprobar si está vacía.

## Estructura del proyecto

```text
src/
├── Main.java       # Punto de entrada y casos de prueba manuales
├── Node.java       # Nodo genérico de la lista
├── IList.java      # Interfaz de operaciones básicas de la lista
└── LinkedList.java # Implementación de la lista simplemente enlazada
```

Las clases relacionadas con profesores y las operaciones específicas del enunciado se incorporarán en la implementación del sistema.

## Pruebas

Los casos de prueba se ejecutan manualmente desde `Main.java`, utilizando la salida de consola y sin emplear JUnit.

Se deben comprobar, como mínimo, los siguientes escenarios:

- Lista vacía.
- Profesores de todas las categorías.
- Instructores con edades mayores y menores de 26 años.
- Ordenamiento descendente por edad.
- Profesores con la misma edad.
- Conteo de profesores por categoría.

## Requisitos

- Java JDK.
- IntelliJ IDEA o cualquier IDE compatible con proyectos Java.

## Ejecución

1. Abrir el proyecto en el IDE.
2. Configurar un JDK válido.
3. Ejecutar la clase `Main`.

## Contexto académico

Este repositorio corresponde a un ejercicio práctico de estructuras de datos y tiene fines educativos.
