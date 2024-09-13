# Clases de Equivalencia y Pruebas Unitarias

Este repositorio contiene un programa de registro de votación de personas implementado en Java. El objetivo principal del proyecto es gestionar el registro de votantes y verificar su elegibilidad mediante el uso de clases de equivalencia y pruebas unitarias.

### Contenido del Repositorio

- **src/**: Contiene el código fuente del programa.
  - **Person.java**: Clase que representa a una persona con atributos como nombre, ID, sexo, etc.
  - **VotingSystem.java**: Clase que maneja el registro de votantes y verifica su elegibilidad.
- **test/**: Contiene las pruebas unitarias para el código fuente.
  - **PersonTest.java**: Pruebas unitarias para la clase `Person`.
  - **VotingSystemTest.java**: Pruebas unitarias para la clase `VotingSystem`.

### Clases de Equivalencia

Las clases de equivalencia se utilizaron para diseñar casos de prueba que cubren diferentes escenarios de entrada. En particular:

- **PersonTest.java**:
  - **Casos de prueba válidos**: Pruebas con IDs válidos y atributos de persona correctos.
  - **Casos de prueba inválidos**: Pruebas con IDs duplicados o inválidos.

- **VotingSystemTest.java**:
  - **Casos de prueba para registro exitoso**: Pruebas para verificar que los votantes se registran correctamente.
  - **Casos de prueba para errores de registro**: Pruebas para verificar que se manejen adecuadamente los errores, como la tentativa de registro de un votante ya registrado.

### Lenguaje utilizado

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
