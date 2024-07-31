# MitoCode - Proyecto Final de Pruebas en Java

## Descripción General

Este repositorio contiene los 3 proyectos con los diferentes tipos de pruebas implementadas como parte del trabajo final del curso de Java Testing, siguiendo las prácticas aprendidas en clase. Los tipos de pruebas incluyen pruebas unitarias, de integración y end-to-end (E2E).

- **Informe generado:** 31-07-2024
- **Docente:** Dany Cenas Vásquez
- **Curso:** Java Testing
- **Alumno:** Rodrigo Ramírez Rodríguez

## Tipos de Pruebas Implementadas

### 1. Pruebas Unitarias
- **Repositorio:** [Test-spring-petclinic-rest](https://github.com/ramirezrr/Test-Proyecto-Java-Testing/blob/20bcd88ac38a2771be3373c69274d36b83e4a8fa/Test-spring-petclinic-rest/readme.md)
- **Objetivo**: Se implementó 18 pruebas unitarias para la aplicación PetClinic.
- **Revisar el README.md que detalla los test U. realizados:** [Link Readme](https://github.com/ramirezrr/Test-Proyecto-Java-Testing/blob/20bcd88ac38a2771be3373c69274d36b83e4a8fa/Test-spring-petclinic-rest/readme.md)
- **Herramientas**: JUnit + Mockito.
- **Pruebas Realizadas sobre las clases controller de**:
  - `PetRestController`: Métodos para gestionar mascotas.
  - `SpecialtyRestController`: Métodos para gestionar especialidades.

### 2. Pruebas de Integración
- **Repositorio:** [Test-pruebas-integracion-petstore3](https://github.com/ramirezrr/Test-Proyecto-Java-Testing/blob/20bcd88ac38a2771be3373c69274d36b83e4a8fa/Test-pruebas-integracion-petstore3/readme.md)
- **Objetivo**: Se desarrolló 6 pruebas de integración para el backend de Swagger Petstore.
- **Revisar el README.md que detalla las pruebas I. realizados:** [Link Readme](https://github.com/ramirezrr/Test-Proyecto-Java-Testing/blob/20bcd88ac38a2771be3373c69274d36b83e4a8fa/Test-pruebas-integracion-petstore3/readme.md)
- **URL de la API**: [Swagger Petstore API](https://petstore3.swagger.io)
- **Herramientas**: Serenity BDD + RestAssured.
- **Escenarios de Prueba**:
  - Agregar, actualizar, listar y eliminar mascotas.
  - Verificar respuestas del servidor para diferentes operaciones.

### 3. Pruebas End-to-End (E2E)
- **Repositorio:** [Test-e2e-tests-petclinic](https://github.com/ramirezrr/Test-Proyecto-Java-Testing/blob/20bcd88ac38a2771be3373c69274d36b83e4a8fa/Test-e2e-tests-petclinic/README.md)
- **Objetivo**: Se implementó 2 pruebas E2E para la aplicación Spring PetClinic.
- **Revisar el README.md que detalla los test E2E realizados:** [Link Readme](https://github.com/ramirezrr/Test-Proyecto-Java-Testing/blob/20bcd88ac38a2771be3373c69274d36b83e4a8fa/Test-e2e-tests-petclinic/README.md)
- **URL de la Aplicación**: [Spring PetClinic](https://spring-framework-petclinic-qctjpkmzuq-od.a.run.app/)
- **Herramientas**: Serenity BDD + Selenium.
- **Escenarios de Prueba**:
  - Listar todos los veterinarios
  - Verificar la visualización en formato JSON de los datos de veterinarios.
- **Revisar el README.md que detalla los test realizados:**

## Tecnologías Utilizadas

- **Java 17**: Lenguaje de programación.
- **Maven 3.9.6**: Gestión de construcción y dependencias.
- **JUnit**: Para pruebas unitarias.
- **Mockito**: Para simulaciones en pruebas unitarias.
- **Cucumber**: Para desarrollo basado en comportamiento (BDD).
- **Serenity BDD**: Para gestión e informes de resultados de pruebas.
- **RestAssured**: Para pruebas de integración con APIs.
- **Selenium**: Para pruebas end-to-end (E2E) en aplicaciones web.
