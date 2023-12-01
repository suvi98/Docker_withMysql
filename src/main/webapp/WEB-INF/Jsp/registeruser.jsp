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
                        <li><a href="<%=request.getContextPath()%>/login" class="nav-link">Back</a></li>
                    </ul>
                    <ul class="navbar-nav">
                        <li><a href="<%=request.getContextPath()%>/login" class="nav-link">Logout</a></li>
                    </ul>
                </nav>
            </header>
            
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
                       
                        <form method="POST" name="add_user" action="<%=request.getContextPath()%>/save/user" align = "center">
                         <h3>Register</h3>
                         <br>
                         Email: <input name="uemail" value="${uemail}" type="text" style="margin-right: -40px;" required/>     
                        <br /><br />
                        Password :    <input name="upassword" value="${upassword}" type="password" required/>
                        <br /> <br />
                        DOB: <input name="dateofbirth" value="${dateofbirth}"type="text" style="margin-right: -40px;" required/>
                        <br /> <br />
                    
                        <input value="Add User" type="submit" class="btn-op"/>
                
                         </form>
                        
                        

                        
                    </div>
                </div>
            </div>
            <style>
                .btn-op {
           color: #fff;
           background-color: #28a745;
           border-color: #28a745;
           margin-left: 30px;
           border-radius: 3px;
           padding: 4px;
              }
          </style>
        </body> 
        
    </html>