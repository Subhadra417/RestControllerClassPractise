<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>congratulation page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>

<div class="container">
  <h2>Congratulations!!!</h2>
            
  <table class="table table-hover">
    <thead>
      <tr bgcolor="yellow">
        <th>Book Id</th>
        <th> Name</th>
        <th>price</th>
       
        
      </tr>
    </thead>
    <tbody>
      
      <tr bgcolor="pink">
        <td>${bookDTO.bookId}</td>
        <td>${bookDTO.Name}</td>
        <td>${bookDTO.price}</td>
       
        
      </tr>
      
      
    </tbody>
  </table>
  
  <a href="fetchAll">click here to fetch all the records</a>
</div>









</body>
</html>