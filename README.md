# Spring boot and MySQL restful API for the online book stores
A restful API built on Spring boot that connects to the MySQL database. Application built using Spring Data JPA to perform database operations. Users can add, retrieve, update and delete(CRUD operations) for an online Book store(web app/ website).

## Requirements

1. Java - 17

2. Maven - 3.x.x

3. Mysql - 5.x.x or Ternimal 

4. StringBoot - 3.x.x

5. Visual Studio Code(VScode)

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/coderavdhesh/BookCart_restAPI.git
```

**2. Create Mysql database**
```bash
create database BookCart
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven (BookCart)**

```bash
java -jar target/bookcart.jar
```
Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:7676>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /books
    
    POST /books/addbook
    
    GET /books/{bookId}
    
    DELETE /books/{bookId}
    
    UPDATE /books/{bookId}

You can test them using postman or any other rest client.


## Live demo video link

You can find the tutorial/Explanation video for this web application(API) on my youtube account -

   https://youtu.be/86v93c6cG0Q


## Know More

------------------------------------------------------------------------------------------
                     RESTFUL API for ONLINE BOOK STORE - BOOKCART
------------------------------------------------------------------------------------------
Project Name : BookData_restAPI for the online BookStores
Project aim : This API helps to fatch data and also performed CRUD operations to make our website/apps updated with the correct DataSets.
-----------------------------------------------------------------------------------------------
                                How this API works ? 
Web requests and URLs which helps to perform Get/Post/Put/Delete [CRUD operations] --

1. Create [Post] : 
    -> 'localhost:7676/books/addbook', it helps to Create new Books dataset in our database.
    Note ~ If you will enter wrong URL or RequestBody, Than it will handle the exception and revert the error BAD_REQUEST.

2. Retrieve [Get] : 
    -> 'localhost:7676/books', it helps to retrieve datasets of books from our database.
    -> 'localhost:7676/books/{id}', it is a Dynamic request, helps to retrieve dataset of a spacific book of the passed Id from our database.

3. Update [Put] :
    -> 'localhost:7676/books/{id}', it is also a Dynamic request, helps to update the already existing datasets in our database, if the dataset is not available in out database than the code will handle the exception and return the response error of 'NOT_FOUND'.

4. Delete [Delete] :
    -> 'localhost:7676/books/{id}', it is also a Dynamic request, helps to Delete the already existing datasets in our database, if the dataset is not available in out database than the code will handle the exception and return the response error of 'NO_CONTENT'.
-----------------------------------------------------------------------------------------------
                                    Key Learnings:
 ### Tech Stacks :
  Springboot, Spring Data JPA, MySQL Database, SQL, Postman client tool, Java, Spring annotations, Spring MVC(controllers, HTTP URIs), classpath & dependencies, configuration, etc.                     
1. How things are actually working in Backend, Layers in the backend development.
2. Familiar with SpringBoot-Architectural Layers and how they are working together to get the
   data from the database to the end user.
3. How we can connect our API with our Database with the help of Spring Data JPA and with full functionality of CRUDs with your APIs.
4. Got familiar with the CRUD methods of JPA repo and Database configurations.
5. How we can test/check the working of our backend service/APIs using 'POSTMAN TOOL'
6. More clarity in core Java concepts.
-----------------------------------------------------------------------------------------------
                            Used Tools and other Services: 
1. Postman API tool to get the reponses.
2. MySQL server and Interaction with database through terminal.
3. VS code to manage this project
4. Git(github) to upload this source Code
5. No frontend written yet for this API.
-----------------------------------------------------------------------------------------------



