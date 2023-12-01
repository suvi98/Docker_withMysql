<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>
            <body>
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
                <div class="center">
                <!-- <h1>Welcome to Book Store</h1> -->
                <h4>${uemail} Welcome to Book Store  </h4>
               
                <div class="row">
                    
                    <form action="<%=request.getContextPath()%>/user">

                        <input type="submit" value="User crud operation" class="mydiv">
    
                    </form>
                </div>
                    
                    <div class="row">
                    
                        <form action="<%=request.getContextPath()%>/book">
    
                            <input type="submit" value="Book crud operation" class="mydiv">
        
                        </form>
                    </div>
              
               </div>
                 
               <div class="row">
                <div class="column">
                   

                <img
                    src="https://img00.deviantart.net/e732/i/2008/166/a/d/summoning_the_dark_source_by_karemelancholia.jpg"
                    alt="Cinque Terre" width="200px" height="250px">
                </div>
                <div class="column">
                   

                    <img
                        src="https://tse3.mm.bing.net/th/id/OIP.5F-0xA67D6cyip1qLhGhsgHaJ9?pid=ImgDet&w=754&h=1014&rs=1"
                        alt="Cinque Terre" width="200px" height="250px">
                    </div>
                    <div class="column">
                   

                        <img
                            src="https://tse2.mm.bing.net/th/id/OIP.VTjKXmoUoIA6A5FDRrAHPgHaJQ?pid=ImgDet&w=600&h=750&rs=1"
                            alt="Cinque Terre" width="200px" height="250px">
                        </div>
                    <div class="column">
                   

                    <img
                        src="https://i.pinimg.com/originals/bf/56/37/bf5637aba4c9878109cad3db35d6f873.png"
                        alt="Cinque Terre" width="200px" height="250px">
                    </div>
                    <div class="column">
                   

                        <img
                            src="https://tse4.mm.bing.net/th/id/OIP.DSPjFjvi_A--CsjP5pL4nwHaLH?pid=ImgDet&w=588&h=883&rs=1"
                            alt="Cinque Terre" width="200px" height="250px">
                        </div>
            </div>
                <style>
                    .center  {
  /* border: 2px outset black;
  background-color: lightblue;     */
  text-align: center;
  width: 50%;
  margin: auto;
}
.column {
	float: left;
	
	padding: 10px;
	height: 300px; /* Should be removed. Only for demonstration */
    margin-left: 20px;
}
.mydiv {
    background-color: #04AA6D;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    margin-left: 100%;
}
                </style>
            </body>
        </html>