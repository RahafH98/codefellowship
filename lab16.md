## codefellowship 


there are these calsses
1. userDetailImpl
2. UserSite
3. UerSiteController
4. UserSiteRepositry
5. WebSecurityConfig 


The project involves creating a web application with a login system and user management features. The application will be well-styled and use templates for displaying information. Here's a breakdown of the project's feature tasks and their current state:

Login Page:

Task Description: Create a login page.
Current State: This task is implemented.
Signup Page:

Task Description: The login page should have a link to a signup page.
Current State: This task is implemented.
User Model:

Task Description: Define the ApplicationUser model with fields like username, hashed password (using BCrypt), firstName, lastName, dateOfBirth, bio, and any other useful fields. These fields must be set at signup and should not be editable later.
Current State: The ApplicationUser model is defined with the required fields, and password hashing is implemented using BCrypt.
User Registration:

Task Description: Allow users to create an ApplicationUser on the signup page. Use the passwordEncoder to hash the password before saving it.
Current State: User registration is implemented, and password hashing is correctly handled.
User Login:

Task Description: Implement user login functionality using the provided cheat sheet. Users should be able to log in.
Current State: User login functionality is implemented.
Homepage:

Task Description: Create a homepage at the root route (/) containing basic site information. Display links to login and signup if the user is NOT logged in. Display a link to logout if the user IS logged in. Ensure that the homepage, login, and registration routes are accessible to non-logged-in users.
Current State: The homepage is implemented with the described features.
User Display:

Task Description: When a user is logged in, display the user's username on every page, typically in the heading.
Current State: User's username is displayed on every page when logged in.
Logout:

Task Description: Implement user logout functionality, and ensure that users are redirected to the home page or login page upon logout.
Current State: User logout functionality is implemented, and proper redirection is ensured.
Styling and Templates:

Task Description: Style the site to make it attractive and use templates to display information.
Current State: The site is well-styled and utilizes templates for displaying information.
Automatic Login after Registration:

Task Description: Ensure that user registration also logs users into the app automatically.
Current State: User registration automatically logs users into the app.