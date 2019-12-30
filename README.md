# TutorME ![Travis Build Status](https://api.travis-ci.com/McGill-ECSE321-Fall2019/project-group-3.svg?token=EYsrvu215mfczoLCWqrr&branch=master)

<details>
<summary>
Android User Guide:</summary>
<br>


### Login:

<img src = "https://i.imgur.com/HBxCq6T.png" width="65%"/>

The above screenshot shows our landing page. From there, the manager can choose to either login if they already have an account, or to sign up otherwise. Clicking sign in redirects the user to the homepage, sign up sends them to the registration page.

### Registration:

<img src = "https://i.imgur.com/HjgZI0L.png" width="65%"/>

The above screenshot shows our registration page for users who do not have an account. To create an account, they enter their registration information and click on register. All fields are required, the email address needs to follow a standard email format (i.e example@example.com) and there are no restrictions on the password format.

### HomePage:

<img src = "https://user-images.githubusercontent.com/1579701/70012246-e5c26000-1541-11ea-8713-12653125c7c2.png" width="65%"/>

The above screenshot shows our HomePage, which the user is redirected to after logging into our application. The first screenshot depicts the standard view of the calendar, with upcoming lessons indicated by the green icon, fetched from the database. On clicking the icon of the lesson, the manager can view the exact details of which lesson and which room in a small text popup at the bottom of the screen. 


### Courses:

<img src = "https://i.imgur.com/TGVSkVl.png" width="65%"/>

The above screenshot shows the 'View Courses' page which lists all courses at the TutorMe Center. The courses are displayed according to a parent categorization of subjects. The courses are shown in a bullet list form.

### Universities:

<img src="https://user-images.githubusercontent.com/1579701/70012255-ece96e00-1541-11ea-882b-49134000ca5d.png" width="65%"/>

The above screenshot shows the 'View Universities' page which lists all the registered Universities for the TutorMe application. The respective courses for the university are also shown in a spinner (dropdown) adjacent to the card for the University. The page is scrollable and loads with data from the backend. 

### Student:
<img src = "https://i.imgur.com/jcFqvqP.png" width="65%"/>

The above screenshot displays the list of Students currently registered at the center. The manager can view the students' email and review comments.

### Tutor:

<img src = "https://i.imgur.com/m6mxlSA.png" width="65%"/>

The above screenshot displays the list of Tutors currently registered at the center. The manager can view the tutors' email and review comments.
</details>

<details>
<summary>
Web User Guide:</summary>
<br>

The following user guide provides a detailed overview of how to use the TutorMe Application. 


### Login:

![](https://i.imgur.com/VZFq8g5.png)

The above screenshot shows our landing page. From there, the manager can choose to either login if they already have an account, or to sign up otherwise. Clicking sign in redirects the user to the homepage, sign up sends them to the registration page.

### Registration:

![](https://i.imgur.com/bwNOY3a.png)

The above screenshot shows our registration page for users who do not have an account. To create an account, they enter their registration information and click on register. All fields are required, the email address needs to follow a standard email format (i.e example@example.com) and there are no restrictions on the password format.

### HomePage:

![](https://i.imgur.com/tsXyue1.png)

The above screenshot shows our HomePage, which the user is redirected to after logging into our application. On the Homepage, the Manager is able to view a scheduler of all lessons currently taking place at the TutorMe Center, where lessons can only take place between 9am-9pm and on weekdays.

### Lesson:

![](https://i.imgur.com/a541FYa.png)

The above screenshot shows the 'View Lessons' page, which lists all the current lessons taking place at the TutorMe Center. Each lesson has a date, and a starting-ending time. Each lesson can also be updated or deleted by clicking on the respective text hyperlink or delete button. If there are more than seven students attending a lesson, this is considered a group/review session which is listed in the Group Lessons section. The manager can then update lessons within this section to assign large enough rooms for the lesson to take place.


### Create Lesson:

![](https://i.imgur.com/jhyapSp.png)

The above screenshot shows the 'Create/Update Lesson' page which provides input fields to either create or update a lesson. A lesson can be assigned a course, room, starting time and ending time through the field's calendar integration, multiple students and tutors. 

### Courses:

![](https://i.imgur.com/9PoY2l1.png)

The above screenshot shows the 'View Courses' page which lists all courses at the TutorMe Center. The courses are displayed according to a parent categorization of subjects. A 'Create Subject' button allows the user to create new categorizations of courses, and within each subject a user can create/update/delete courses by clicking on the respective buttons or hyperlinks.

### Create Subject:

![](https://i.imgur.com/u1LDEv8.png)

The above screenshot shows the 'Create/Update Subject' page which provides input fields to either create/update a subject according to a selected associated university and the subject's name.

### Create Course:

![](https://i.imgur.com/rpH83nm.png)

The above screenshot shows the 'Create/Update Course' page which provides the input fields to either create/update a course within a subject by choosing the associated subject and inputting the course name. 

### Universities:

![](https://i.imgur.com/0LUuRKf.png)

The above screenshot shows the 'View Universities' page which lists all the registered Universities for the TutorMe application. From this page, a university may be created/updated/deleted according to the respective buttons or hyperlinks.

### Create University:

![](https://i.imgur.com/MXs65lY.png)

The above screenshot shows the 'Create/Update University' page which provides the input fields to either create/update a university with a name and a list of subjects to add to the selected university.

### Room:

![](https://i.imgur.com/VyL7IMO.png)

The above screenshot lists all the rooms that are at the TutorMe Center. The manager can create a room if a new room has been added to the center. The manager may also update a room if there are any sizing changes that need to be made or delete a room if it has been removed from the center.

### Create Room:

![](https://i.imgur.com/j0gLuyM.png)

The above screenshot shows the 'Create/Update Room' page which provides the input fields to either create/update a room with the number of seats within the room and its size.

### Student:
![](https://i.imgur.com/MHL2m9o.png)

The above screenshot displays the list of Students currently registered at the center. The manager can view the students' email, review comments, and toggle the visibility of the reviews given to students. The manager can also remove students from the Center by clicking the 'Remove Student' button.

### Tutor:

![](https://i.imgur.com/ddkPi1E.png)

The above screenshot displays the list of Tutors currently registered at the center. The manager can view the tutors' email, hourly pay-rate, review rating according to reviews written by students and review comments, approved courses that the tutor can teach, and courses the tutor has applied to teach. The manager can then approve or deny courses that the tutor has requested to teach. The manager can toggle the visibility of the reviews and can fire tutors from the Center by clicking on the 'Fire Tutor' button. Lastly, the manager can view their commission on the tutor's hourly wage through the integrated payment partner 'Paypal' that is linked at the top of the Tutor page. 

</details>


## Scope of Project

The TutorME application is designed to cater the tutoring needs of the students at the high school, CÉGEP, and university levels.
The application shall allow a mixture of students, tutors to interact in order to accommodate the students' needs for a particular course, subject or even tutor; all under the company manager's supervison. The project is organized in four Agile sprints. The final deliverable consists of an Android app and a website for the Manager viewpoint of the mentioned tutoring app. It should allow the manager to manage tutors and students, book rooms for lessons, add courses, subjects and universities. The project scope also includes a persistence layer to save and load all the necessary data into a database.

Our application supports the scenarios described in the user stories for the Company Manager.
Additionally this application is designed to integrate with the viewpoints of other stake-holders created by seperate teams via service calls. All functionality of the system is to be accessible via the web frontend for respective stakeholders. In addition, a mobile (Android) frontend allows easy execution of the most important functionality for the given stakeholder having both read and write access to the backend via RESTful service call.


