# Store API REST - Spring Boot

Este es un proyecto de ejemplo de una API REST para una tienda utilizando Spring Boot, JPA y PostgreSQL.

## Requisitos

- **Java 21**
- **PostgreSQL** (Base de datos: `store_db`)
- **Maven** (incluido mediante el wrapper `./mvnw`)

## Configuración de la Base de Datos

Asegúrate de tener PostgreSQL corriendo y crea la base de datos:
```sql
CREATE DATABASE store_db;
```
La configuración de conexión se encuentra en `src/main/resources/application.properties`.

## Cómo Ejecutar

Desde la raíz del proyecto, ejecuta:
```bash
./mvnw spring-boot:run
```

## Endpoints de la API

La API estará disponible en `http://localhost:8080/api/products`.

| Método | Endpoint | Descripción |
|---|---|---|
| GET | `/api/products` | Obtener todos los productos |
| GET | `/api/products/{id}` | Obtener un producto por ID |
| POST | `/api/products` | Crear un nuevo producto |
| PUT | `/api/products/{id}` | Actualizar un producto existente |
| DELETE | `/api/products/{id}` | Eliminar un producto |

### Ejemplo de JSON para POST/PUT:

```json
{
  "name": "Laptop Gaming",
  "description": "Powerful gaming laptop",
  "price": 1200.50,
  "stock": 10
}
```

## Tecnologías Utilizadas

- **Spring Boot 4.0.3**
- **Spring Data JPA**
- **PostgreSQL**
- **Lombok**
