                                                           # Quiz Master
                                                           
The Quiz Master is a web application developed using Spring Boot, incorporating security features, and utilizing Thymeleaf for templating. This readme file provides an overview of the Quiz Master, its features, and instructions on how to set up and run the application.


### Table of Contents
Introduction
Features
Installation
Usage
Technologies Used
Entity Models
Contributing
License


### Introduction
The Quiz Master is an interactive web application that allows users to participate in quizzes and test their knowledge on Java Fullstack Development in Java Spring Boot Framework, Spring Security Framework, Hobernate ORM, SQL, HTML, CSS, JavaScript and Thymeleaf tempate engine. This readme file provides an overview of the Quiz Master, its features, and instructions on how to set up and run the application.
The Quiz Master is a user-friendly platform designed to engage users in fun and educational quizzes. It is built using the Spring Boot framework, which allows for rapid development and easy integration with various components. Thymeleaf is utilized for server-side templating, enabling dynamic content rendering on the client side.

### Features
The Quiz Master comes with the following features:

**User Registration and Authentication**: Users can create an account or log in using their existing credentials to participate in quizzes and track their progress.

**Multiple-Choice Questions**: Each quiz contains multiple-choice questions with four answer options.

**Instant Feedback**: Users receive immediate feedback on their answers, indicating whether they are correct or incorrect.

**Score Tracking**: The app keeps track of users' scores for each quiz, allowing them to monitor their progress over time.

**Leaderboard**: A leaderboard displays the top scorers, promoting healthy competition among users.

**Responsive Design**: The app is designed to be responsive and accessible on various devices, including desktops, tablets, and mobile phones.

### Installation
To install and run the Quiz Master locally, follow these steps:

1. Clone the repository: **git clone https://github.com/yneelima77/CapstoneQuizMaster.git**
2. Navigate to the project directory: **cd quiz-app**
3. Set up the database: **MySQL**
4. Build the application: **mvn clean package**
5. Run the application: **java -jar target/quiz-app.jar**
6. Open your web browser and visit: **http://localhost:8080**

### Usage
Once the Quiz App is running in your web browser, follow these steps to use the application:

1.**Registration/Login**: If you are a new user, click on the "Register" button to create an account. If you already have an account, click on the "Login" button to access the app.

2. **Get Start the Quiz**: Click on the "Get Start Quiz" button to begin the quiz. Read each question carefully and select the answer you think is correct.

3. **Get Feedback**: After answering each question, you will receive immediate feedback on how many answers are correct or incorrect.

4. **Score and Leaderboard**: At the end of the quiz, your score will be displayed. You can view the leaderboard to see where you stand compared to other users.

5. **Retake Quiz (Optional)**: If you wish to retake the quiz or try another category, you can do so by navigating back to the quiz selection page.

### Technologies Used
The Quiz Master is built using the following technologies:

*Java with Spring Boot
*Thymeleaf for server-side templating
*Spring Security for user authentication and authorization
*Database and Technology - MySQL, Hibernate ORM, JPA
*HTML, CSS, JavaScript, Bootstrap for frontend

### Entity Models
The Quiz Master uses the following entity models to manage data and relationships:

#### User

**Description**: Represents a registered user of the Quiz App.
- **Attributes**:
- `id` (int): Unique identifier for the user. Auto-generated by the system.
- `username` (String): User's username for authentication..
- `email` (String): User's email address for communication.
- `password` (String): Encrypted password for user authentication.
- `roles` (String): User's roles for authorization. This field represents the user's access privileges and can be a comma-separated string of roles (e.g., "ROLE_USER,ROLE_ADMIN").

#### Questions

**Description**: Represents a single question within a quiz.
- **Attributes**:
- `Id` (Long): Unique identifier for the question. This attribute is annotated with @Id and @GeneratedValue to generate an auto-incrementing primary key. The @Column annotation defines the corresponding database column name as "ques_Id" and specifies that this attribute cannot be null.
- `title` (String): The content of the question.
- `optionA` (String): The content of option A for the multiple-choice question.
- `optionB` (String): The content of option B for the multiple-choice question.
- `optionC` (String): The content of option C for the multiple-choice question.
- `optionD` (String): The content of option D for the multiple-choice question.
- `ans` (int): The correct answer for the question represented as an integer. The correct answer is stored as a numerical value corresponding to the correct option (e.g., 1 for option A, 2 for option B, and so on).
- `choose` (int): Represents the user's chosen answer for the question during the quiz attempt. Similar to ans, it stores the numerical value corresponding to the user's selected option (e.g., 1 for option A, 2 for option B, and so on).

#### Results

**Description**: Represents a user quiz score of the Quiz App.
- **Attributes**:
- `id` (Long): Unique identifier for the user. This attribute is used as the primary key for the User entity.
- `username` (String): The username of the user. It must not be empty, and the minimum size allowed is 3 characters.
- `correctAns` (int): Represents the number of correct answers given by the user during quizzes.
  

### Contributing
Contributions to the Quiz App are welcome! If you find any issues or have suggestions for improvements, please submit a pull request. For major changes, please open an issue first to discuss the proposed changes.

###License
The Quiz App is open-source software. Feel free to modify and use the code according to the terms of the license.
