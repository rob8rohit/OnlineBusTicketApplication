# 🚌 Online Bus Ticket Booking Application

A full-stack web application built with **Spring Boot**, **MySQL**, **HTML/CSS/JavaScript** to allow users to search for buses, book tickets, and manage bookings. It also includes an **admin panel** to manage bus schedules and user bookings.

## 🚀 Features

### 🧑‍💼 User Features:
- Search for buses based on source, destination, and date
- View bus details: time, price, availability
- Book tickets and get confirmation
- View and cancel booked tickets

### 🔐 Admin Features:
- Admin login and dashboard
- Add, update, and delete bus routes
- View all bookings and user d

## 🛠️ Technologies Used

- Java 8+
- Spring Boot
- Spring MVC
- MySQL
- HTML/CSS
- JavaScript (Vanilla)
- Thymeleaf (if used)
- Maven

## 🗂️ Project Structure
src/
└── main/
├── java/
│ └── com.example.busbooking/
│ ├── controller/
│ ├── entity/
│ ├── repository/
│ ├── service/
│ └── OnlineBusTicketApplication.java
└── resources/
├── templates/ # HTML files
├── static/ # CSS & JS
└── application.properties

## 🔑 Sample Endpoints / Pages

| Page / Endpoint         | Function                              |
|--------------------------|----------------------------------------|
| `/search`               | Search buses by route/date             |
| `/book/{busId}`         | Book a ticket for selected bus         |
| `/admin/login`          | Admin login page                       |
| `/admin/dashboard`      | Admin dashboard overview               |
| `/admin/addBus`         | Add a new bus                          |
| `/bookings`             | View booked tickets                    |
