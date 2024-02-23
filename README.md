# nimap-assignment
This is a Java Spring Boot application that implements CRUD (Create, Read, Update, Delete) operations for managing categories and products. It utilizes RESTful APIs for communication and integrates with a relational database using JPA and Hibernate.

#Features:

    Category CRUD Operations:
        Retrieve all categories with pagination
        Create, read, update, and delete categories by ID

    Product CRUD Operations:
        Retrieve all products with pagination
        Create, read, update, and delete products by ID

    One-to-Many Relationship:
        Establishes a one-to-many relationship between categories and products, where one category can have multiple products

#API Endpoints:

    Categories:
        GET /api/categories?page={page}: Retrieve all categories with pagination
        POST /api/categories: Create a new category
        GET /api/categories/{id}: Retrieve category by ID
        PUT /api/categories/{id}: Update category by ID
        DELETE /api/categories/{id}: Delete category by ID

    Products:
        GET /api/products?page={page}: Retrieve all products with pagination
        POST /api/products: Create a new product
        GET /api/products/{id}: Retrieve product by ID
        PUT /api/products/{id}: Update product by ID
        DELETE /api/products/{id}: Delete product by ID

#Technologies Used:

    Spring Boot
    Spring Data JPA
    Hibernate
    RESTful APIs
    MySQL (or your preferred relational database)

#Instructions for Running:

    Clone the repository
    Configure the database connection in application.properties
    Run the application using mvn spring-boot:run or by executing the JAR file
