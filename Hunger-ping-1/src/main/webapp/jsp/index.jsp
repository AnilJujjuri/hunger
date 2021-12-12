<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hunger-Ping</title>
</head>


<style>
* {box-sizing: border-box;}

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #e9e9e9;
}

.topnav a {
  float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}


.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #2196F3;
  color: white;
}

.topnav .search-container {
  float: right;
}

.topnav input[type=text] {
  padding: 6px;
  margin-top: 8px;
  font-size: 17px;
  border: none;
}

.topnav .search-container button {
  float: right;
  padding: 6px 10px;
  margin-top: 8px;
  margin-right: 16px;
  background: #ddd;
  font-size: 17px;
  border: none;
  cursor: pointer;
}

.topnav .search-container button:hover {
  background: #ccc;
}

@media screen and (max-width: 600px) {
  .topnav .search-container {
    float: none;
  }
  .topnav a, .topnav input[type=text], .topnav .search-container button {
    float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 20px;
  }
  .topnav input[type=text] {
    border: 1px solid #ccc;  
  }
}
</style>
<body style="background-color:	#D2042D;">

<div class="topnav" style="background-color:#D2042D;">
  <a href="#home"><h1>Hunger-Ping</h1></a>
  <i style='font-size:24px' class='fas'>&#xf56b;</i>
  <h2>
 <select action="location.jsp"  style="width:10%"; >
  <option value="hyderabad">Hyderabad</option>
  <option value="guntur">Guntur</option>
  <option value="chennai">Chennai</option>
  <option value="kolkata">Kolkata</option>
  <option value="mysure">Mysure</option>
  <option value="mumbai">Mumbai</option>
</select>
  </h2>
  <div class="search-container" >
    <form action="/action_page.php">
      <input type="text" placeholder="Search Items,Restaurant,dish" name="search">
      <button type="submit"><i class="fa fa-search"></i></button>
    </form>
  </div>
</div>
<div class="topnav" align="right"  >
  <a class="active" href="login">Login</a>
  <a href="registration">Register</a>
  <a href="adminlogin">adminProfile</a>
</div>
<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
<div><img src='https://www.teahub.io/photos/full/253-2538486_slider3-restaurant-food-pic-hd.jpg' width=1535 height=574></img></div>
</body>
</html>