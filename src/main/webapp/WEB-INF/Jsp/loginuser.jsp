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

                  
                </nav>
            </header>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
                       
                        <form method="POST" name="add_user" action="<%=request.getContextPath()%>/welcome" align = "center">
                         <h3>Login Here</h3>
                         <br>
                         Email : <input name="uemail" value="${uemail}" type="text" / style="margin-right: -44;" required>     
                        <br /><br />
                        Password : <input name="upassword" value="${upassword}" type="password" required/>
                        <br /> <br />
                     
                    
                        <input value="Login" type="submit" class="center"/>
                
                         </form>
                        
                         
                            <form action="<%=request.getContextPath()%>/register" style="margin-left: 160px; width: 100%;">
                                <input value="Register" type="submit" class="center" />
                            </form>
                     
                            <h5>${errorMsg}</h5>
                        
                    </div>
                </div>
            </div>
            <style>
                .center  {
 border: none;
 border-radius: 5px;
  background-color: green;    
  text-align: center;
  width: 30%;
  margin: auto;
}
            </style>
        </body> 
        
    </html>