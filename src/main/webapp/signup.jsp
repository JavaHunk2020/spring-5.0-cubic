<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>

<header style="height: 30px;background-color: fuchsia;">
 You are most welcome here!
</header>

<div  class="container" style="height: 200px;background-color: #e5f2ff;">
  <img src="img/student.png" style="height: 230px;">
  
  <hr/>
  <form action="signup" method="post">
  
  <div class="form-group">
    <label for="name">Name:</label>
    <input type="text" class="form-control" name="name" >
  </div>
  
    <div class="form-group">
    <label for="email">Email:</label>
    <input type="email" class="form-control" name="email" >
  </div>
  
  <div class="form-group">
    <label for="mobile">Mobile:</label>
    <input type="number" class="form-control" name="mobile" >
  </div>
  
    <div class="form-group">
    <label for="gender">Gender:</label>
    <select  class="form-control" name="gender" >
    	<option>Male</option>
    	<option>Female</option>
    </select>
    
    <hr/>
    <button type="submit" class="btn btn-primary">Signup</button>
    <button type="reset" class="btn btn-danger">Clear</button>
  </div>
  
  
  </form>

</div>

</body>
</html>