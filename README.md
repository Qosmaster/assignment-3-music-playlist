# Music Playlist Manager

## Project Overview
This project is a console-based Java application that simulates a simple music playlist manager.
It demonstrates object-oriented programming principles and database interaction using JDBC.

The application allows creating media items (songs and podcasts) and playlists, and stores data in a PostgreSQL database.

---

## OOP Design
### Abstract Class and Inheritance
- `MediaBase` is an abstract class that defines common fields and methods.
- `Song` and `Podcast` extend `MediaBase` and override its abstract methods.

### Polymorphism
- Media objects are handled using `MediaBase` references.
- The `play()` method behaves differently depending on the actual object type.

### Composition
- `Playlist` contains a list of `MediaBase` objects.

---

## Interfaces
- Abstract methods in `MediaBase` enforce common behavior for media types.

---

## Database Description
- Database: PostgreSQL
- GUI Tool: pgAdmin
- Tables:
    - `media`
    - `playlist`
    - `playlist_media`
- The schema includes primary keys, foreign keys, and unique constraints.

### Sample SQL Inserts
```sql
INSERT INTO media (title, duration, type)
VALUES ('Song One', 200, 'SONG');

INSERT INTO playlist (name)
VALUES ('My Playlist');

INSERT INTO playlist_media (playlist_id, media_id)
VALUES (1, 1);
```

### Application Structure

Controller layer handles user interaction

Layer applies validation and business logic

Repository layer handles database operations using JDBC

Utility class manages database connection

### How to Run

Create the database using schema.sql in pgAdmin

Configure database credentials in DatabaseConnection.java

Run Main.java

### Demonstration

### The Main class demonstrates:

Creating media objects

Saving data to the database

Using polymorphism

Creating playlists

Fetching data from the database

### Reflection

This project helped me understand how object-oriented principles work together with JDBC and layered architecture.
I learned how to use abstract classes, repositories, services, and custom exceptions in a real application.