# Post and Comment REST API

This REST API is designed to handle posts and comments, providing functionality for creating, reading, updating, and deleting posts and comments. It can be used as a backend for various applications that require managing user-generated content, such as social media platforms, forums, blogs, e-commerce websites, educational platforms, and project management tools.

## Technologies Used

- **Spring Boot:** Framework for building robust and scalable Java applications, providing features such as dependency injection, MVC architecture, and embedded server capabilities.
- **Lombok:** Library that helps reduce boilerplate code in Java applications by automatically generating getters, setters, constructors, and other repetitive code.
- **Gradle:** Build automation tool used for managing project dependencies, building, and testing Java applications.
- **Swagger:** Tool for designing, documenting, and testing RESTful APIs, providing a user-friendly interface for exploring API endpoints and their functionality.
- **H2 Database:** Lightweight and embeddable relational database management system written in Java, commonly used for development and testing purposes.

## Features

- **Post Management:** Allows users to create, read, update, and delete posts.
- **Comment Management:** Enables users to add, view, edit, and delete comments on posts.
- **User Authentication:** Provides user authentication mechanisms to ensure secure access to the API endpoints.
- **Role-Based Access Control:** Implements role-based access control to restrict certain actions based on user roles, such as administrators, moderators, and regular users.
- **Data Persistence:** Utilizes a database (e.g., H2, MySQL, PostgreSQL) for persistent storage of posts, comments, and user data.
- **Scalability:** Built with scalability in mind, allowing for the handling of large volumes of posts and comments efficiently.
- **Documentation:** Includes comprehensive documentation on how to use the API endpoints, along with examples and usage scenarios.

## How to Use

1. **Clone the Repository:** Clone this repository to your local machine using `git clone`.
2. **Install Dependencies:** Install the necessary dependencies using a build tool like Gradle or Maven.
3. **Configure Database:** Set up the database configuration according to your chosen database system.
4. **Build and Run:** Build the project and run the application on your local environment.
5. **Access API Endpoints:** Access the API endpoints using a tool like Postman or curl to interact with the provided functionality.

## Contributing

Contributions are welcome! If you have any ideas for improvements or new features, feel free to open an issue or submit a pull request. Please ensure that your contributions align with the project's coding standards and guidelines.

## License

This project is licensed under the [Javne](LICENSE).
