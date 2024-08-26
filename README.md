### Encrypt-API

### Technologies Used:
- Spring Boot
- OAuth 2.1 - Keycloak

### Project Description:
• Has a single request: API call '/api/encrypt' with a json body with user details
• Logic: Uses Jasypt encryption to encrypt sensitive details 
• Response: Encrypted json body
• Security: Uses Keycloak for OAuth 2.1 implementation

### Setup Instructions:
1. **Prerequisites:**
   - Java Development Kit (JDK) version 17 or higher
   - Maven

2. **Installation:**
   - Clone the repository: `git clone https://github.com/mohamed-khaja/Spring-boot-Crud.git`

3. **Running the Application:**
   - Build the project: `mvn clean package` (if using Maven)
   - Run the application: • `java -jar target/your-application.jar` (replace with your application's JAR file) 
                          •  or mvn spring-boot:run

### Usage:
1. Access the application at `http://localhost:8097`.
