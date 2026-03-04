# Store API REST - Spring Boot

# Cómo Ejecutar

Desde la raíz del proyecto, ejecuta:

```bash
./mvnw spring-boot:run
```

## Endpoints de la API

La API estará disponible en `http://localhost:8080/api/products`.

| Método | Endpoint               | Descripción                     |
| ------- | ---------------------- | -------------------------------- |
| GET     | `/api/products`      | Obtener todos los productos      |
| GET     | `/api/products/{id}` | Obtener un producto por ID       |
| POST    | `/api/products`      | Crear un nuevo producto          |
| PUT     | `/api/products/{id}` | Actualizar un producto existente |
| DELETE  | `/api/products/{id}` | Eliminar un producto             |

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
