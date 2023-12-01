<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title>User Management Application</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a  class="navbar-brand" style="color: white;"> Book Management App </a>
                    </div>

                    <ul class="navbar-nav">
                        <li><a href="<%=request.getContextPath()%>/welcome" class="nav-link">Back</a></li>
                    </ul>
                    <ul class="navbar-nav">
                        <li><a href="<%=request.getContextPath()%>/login" class="nav-link">Logout</a></li>
                    </ul>
                </nav>
            </header>
            <br>

            <div class="row">
                <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

                <div class="container">
                    <h3 class="text-center">List of Book</h3>
                    <hr>
                    <div class="container text-left">

                        <a href="<%=request.getContextPath()%>/addbook" class="btn btn-success">Add
     New Book</a>
                    </div>
                    <br>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Author</th>
                                <th>Discription</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!--   for (Todo todo: todos) {  -->
                            <c:forEach var="user" items="${listBook}">

                                <tr>
                                    <td>
                                        <c:out value="${user.bookid}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.bookname}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.author}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.discription}" />
                                    </td>
                                    <td>

                                        <a class="btn-op" style="background-color: #28a745; border-color: #28a745;"
        
        
                                        href="<%=request.getContextPath()%>/update/book/${user.bookid}">Update
        
                                        </a>
        
                                        <a class="btn-op"
        
                                        href="<%=request.getContextPath()%>/delete/book/${user.bookid}"
        
                                        onclick="return confirm('Do you really want to delete?')">Delete
        
                                        </a>
        
                                    </td>  </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>

                    </table>
                </div>
            </div>
            <style>
                .btn-op {
             color: #fff;
             background-color: red;
             border-color: red;
             margin-left: 30px;
             border-radius: 3px;
             padding: 4px;
                }
            </style>
        </body>

        </html>