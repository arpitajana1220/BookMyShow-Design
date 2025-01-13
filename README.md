
# BookMyShow

BookMyShow is a Spring Boot application for booking movie tickets. This project demonstrates the use of Spring Boot, JPA, Lombok, and MySQL.

## UML Diagram
![uml_diagram.png](https://github.com/arpitajana1220/BookMyShow-Design/blob/master/src/main/BookMyShow%20Design.png)

## Features

- User registration and login
- Booking movie tickets
- Managing shows and seats
- Integration with MySQL database

## Prerequisites

- Java 11 or higher
- Maven
- MySQL

## Getting Started

### Clone the repository

```sh
git clone https://github.com/arpitajana1220/bookmyshow.git
cd bookmyshow
```

### Configure the database

Update the `src/main/resources/application.properties` file with your MySQL database credentials:

```ini
spring.datasource.url=jdbc:mysql://localhost:3306/bookmyshow
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### Build the project

```sh
mvn clean install
```

### Run the application

```sh
mvn spring-boot:run
```

## API Endpoints

### User Controller

- **Sign Up**: `POST /users/signup`
- **Login**: `POST /users/login`

### Booking Controller

- **Book Show**: `POST /bookings`

## Lombok Configuration

Ensure that Lombok is correctly configured in your IDE:

1. Install the Lombok plugin.
2. Enable annotation processing.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Lombok
- MySQL
- Maven

## License

This project is licensed under the MIT License.
