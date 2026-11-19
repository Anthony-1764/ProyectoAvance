# Mesón del Desierto

[![Calidad del frontend](https://github.com/Anthony-1764/ProyectoAvance/actions/workflows/ci.yml/badge.svg?branch=main)](https://github.com/Anthony-1764/ProyectoAvance/actions/workflows/ci.yml)

Proyecto colaborativo desarrollado con Spring Boot y Angular para gestionar productos, categorías, pedidos, autenticación y la experiencia visual del restaurante El Mesón del Desierto.

## Sitio publicado

[Abrir el frontend en GitHub Pages](https://anthony-1764.github.io/ProyectoAvance/)

GitHub Pages publica automáticamente el frontend cuando llegan a `main` cambios de Angular o del workflow de despliegue. La versión pública permite revisar la interfaz. Las funciones conectadas a productos, autenticación, pedidos y administración requieren un backend Spring Boot accesible. Actualmente el backend se ejecuta de forma local en el puerto `2424`.

## Cambios del avance 02

- Página principal renovada con fotografías del local y diseño adaptable.
- Presentación mejorada del catálogo de productos y sus controles del carrito.
- Pantalla de inicio de sesión actualizada sin cambiar su lógica.
- Trabajo distribuido en ramas para autenticación, productos, pedidos e interfaz.
- Integración de cambios mediante Pull Requests hacia `main`.
- Publicación automática del frontend con GitHub Actions y GitHub Pages.

## Cambios del avance 03

- Registramos cinco errores y mejoras en GitHub Issues y los repartimos entre cuatro integrantes. La plantilla de reporte solicita pasos de reproducción, resultados esperado y actual, evidencia y prioridad propuesta.
- El workflow **Calidad del frontend** instala las dependencias con `npm ci`, compila Angular para producción y ejecuta las pruebas del carrito. Se activa en cada `push` y en los pull requests hacia `main`.
- El PR #24 corrigió el issue #18. El carrito conserva los datos válidos y se recupera con un carrito vacío cuando los datos guardados contienen JSON inválido o un valor que no es un arreglo. Las tres pruebas del servicio pasaron antes de fusionar el PR.
- Integramos la prueba de arranque de Spring Boot en el PR #23 y corregimos los errores de compilación de Java detectados en el backend. El workflow **Calidad del frontend** verifica Angular.

[Issue #18](https://github.com/Anthony-1764/ProyectoAvance/issues/18) · [Pull request #24](https://github.com/Anthony-1764/ProyectoAvance/pull/24) · [Historial de Calidad del frontend](https://github.com/Anthony-1764/ProyectoAvance/actions/workflows/ci.yml) · [Releases del proyecto](https://github.com/Anthony-1764/ProyectoAvance/releases)

## Tecnologías

- Angular 18
- Spring Boot
- Git y GitHub
- GitHub Actions
- GitHub Pages

## Ejecución local del frontend

```bash
cd angular
npm install
npm start
```

Luego abre `http://localhost:4200/`.

## Flujo de colaboración

1. Crear una rama para la tarea.
2. Realizar los cambios y registrar un commit descriptivo.
3. Subir la rama al repositorio remoto.
4. Crear un Pull Request hacia `main`.
5. Solicitar la revisión y aprobación de otro integrante.
6. Combinar los cambios aprobados para iniciar la publicación automática.
