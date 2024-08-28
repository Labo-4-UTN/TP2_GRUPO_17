# TP2_GRUPO_17
## Ejercicio 1: Herencia y Encapsulamiento

### Descripción
En este ejercicio se trabajará con la clase `Empleado` creada previamente. Se debe crear una clase `Profesor` que herede de `Empleado` y aplicar el concepto de encapsulamiento en sus atributos.

### Tablero Jira
[Enlace](https://guillermo-navarro.atlassian.net/jira/core/projects/L4/board)

### Tareas
1. Crear un paquete llamado `ejercicio1`.
2. Dentro de `ejercicio1`, crear una clase `Profesor` que herede de `Empleado` con los siguientes atributos:
   - `String cargo`
   - `int antiguedadDocente`
3. Encapsular los atributos de la clase `Profesor`.
4. Crear los constructores necesarios para `Profesor`.
5. Sobrescribir el método `toString()` para devolver la siguiente información:
   - `id`, `nombre`, `edad`, `cargo`, `antiguedadDocente`
6. Crear una clase `mainEjercicio1_a` que:
   - Cree 5 objetos `Profesor` y los guarde en un `ArrayList`.
   - Muestre la información de los profesores utilizando un `Iterator`.
7. Crear una clase `mainEjercicio1_b` que:
   - Cree 5 objetos `Profesor` y los guarde en un `TreeSet`.
   - Muestre la información de los profesores utilizando un `Iterator`.
8. Crear dos objetos `Profesor` con la misma información y compararlos. Si son iguales, mostrar el mensaje “Es el mismo profesor”.

### Archivos
- `ejercicio1/src/model/Profesor.java`
- `ejercicio1/src/mainEjercicio1_a.java`
- `ejercicio1/src/mainEjercicio1_b.java`

## Ejercicio 2: Gestión de Productos Agroalimentarios

### Descripción
Este ejercicio plantea la creación de un programa para gestionar una empresa agroalimentaria que trabaja con diferentes tipos de productos: frescos, refrigerados y congelados. Todos los productos comparten información común y tienen datos específicos según el tipo.

### Tareas
1. Crear un paquete llamado `ejercicio2`.
2. Implementar la clase `Producto` y las subclases `ProductoFresco`, `ProductoRefrigerado`, y `ProductoCongelado` aplicando una relación de herencia.
3. Encapsular los atributos de cada clase.
4. Crear un constructor y un método que muestre la información de cada clase.
5. Crear una clase `mainEjercicio2` que:
   - Cree un objeto de cada tipo de producto y muestre sus datos.

### Archivos
- `ejercicio2/src/model/Producto.java`
- `ejercicio2/src/model/ProductoFresco.java`
- `ejercicio2/src/model/ProductoRefrigerado.java`
- `ejercicio2/src/model/ProductoCongelado.java`
- `ejercicio2/src/mainEjercicio2.java`

## Ejercicio 3: Representación de Instalaciones Deportivas y Edificios

### Descripción
Este ejercicio se enfoca en la representación de una instalación deportiva y un edificio en un programa Java, con la necesidad de manejar sus atributos específicos.

### Tareas
1. Crear un paquete llamado `ejercicio3`.
2. Implementar las clases necesarias:
   - Clase `InstalacionDeportiva` con el método `int getTipoDeInstalacion()`.
   - Clase `Edificio` con el método `double getSuperficieEdificio()`.
   - Clase `Polideportivo` que implemente ambas interfaces, y que incluya la superficie y el nombre del polideportivo.
   - Clase `EdificioDeOficinas` que extienda `Edificio` y que incluya el número de oficinas.
3. Crear una clase `mainEjercicio3` que:
   - Cree un `ArrayList` que contenga tres `Polideportivos` y dos `EdificiosDeOficinas`.
   - Recorra la colección utilizando un `Iterator` y muestre los atributos de cada elemento.

### Archivos
- `ejercicio3/src/model/InstalacionDeportiva.java`
- `ejercicio3/src/model/Edificio.java`
- `ejercicio3/src/model/Polideportivo.java`
- `ejercicio3/src/model/EdificioDeOficinas.java`
- `ejercicio3/src/mainEjercicio3.java`

### repositorio
[https://github.com/Labo-4-UTN/TP2_GRUPO_17](https://github.com/Labo-4-UTN/TP2_GRUPO_17)
---
