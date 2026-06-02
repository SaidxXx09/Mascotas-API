# Mascotas API

Ejercicio práctico de una API REST sencilla desarrollada con Spring Boot. Permite gestionar un listado de mascotas en memoria, sin base de datos.

---

## ¿Qué hace?

- Listar todas las mascotas registradas.
- Buscar una mascota por su ID.
- Filtrar mascotas menores a una edad determinada.
- Agregar una nueva mascota.

---

## Tecnologías

| Herramienta | Uso |
|---|---|
| Java 21 | Lenguaje principal |
| Spring Boot 4 | Framework para la API REST |
| Lombok | Reducción de código repetitivo |
| Gradle | Gestión de dependencias |

> Los datos se guardan en memoria (no hay base de datos). Al reiniciar la app, vuelven a los valores iniciales.

---

## Cómo ejecutar

```bash
cd ejercicio2
./gradlew bootRun        # Linux / macOS
gradlew.bat bootRun      # Windows
```

La API queda disponible en `http://localhost:8080`

---

## Endpoints disponibles

| Método | Ruta | Descripción |
|---|---|---|
| GET | `/mascotas` | Obtiene todas las mascotas |
| GET | `/mascotas/{id}` | Busca una mascota por ID |
| GET | `/mascotas/menores?edad=5` | Mascotas menores a X años |
| POST | `/mascotas` | Agrega una nueva mascota |

**Ejemplo de body para POST:**
```json
{
  "id": 3,
  "nombre": "Luna",
  "especie": "Gato",
  "fechaNacimient": 2020,
  "propietario": "Ana"
}
```

---

## Autor

| Nombre |
|---|
| Said Quinto |
