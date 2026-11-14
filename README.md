# Mesón del Desierto

Proyecto colaborativo desarrollado con Spring Boot y Angular para gestionar productos, categorías, pedidos, autenticación y la experiencia visual del restaurante El Mesón del Desierto.

## Sitio publicado

[Abrir el frontend en GitHub Pages](https://anthony-1764.github.io/ProyectoAvance/)

GitHub Pages publica automáticamente el frontend después de cada actualización de `main`. La versión pública permite revisar la interfaz. Las funciones conectadas a productos, autenticación, pedidos y administración necesitan que el backend Spring Boot esté desplegado; actualmente el servicio del proyecto se ejecuta localmente en el puerto `2424`.

## Cambios del avance 02

- Página principal renovada con fotografías del local y diseño adaptable.
- Presentación mejorada del catálogo de productos y sus controles del carrito.
- Pantalla de inicio de sesión actualizada sin cambiar su lógica.
- Trabajo distribuido en ramas para autenticación, productos, pedidos e interfaz.
- Integración de cambios mediante Pull Requests hacia `main`.
- Publicación automática del frontend con GitHub Actions y GitHub Pages.

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
