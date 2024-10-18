<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Auction Form</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<style>
.form{
background-color: #fff5e4;
}
</style>
</head>

<body class="container">
<div class="card form" style="width:600px; margin: auto; margin-top:50px; text-align: center;">
<h2>Welcome to AP Auctions. Enter your Bid</h2>
    <form class="form" action="register" method="post">
    <label >Item ID: </label>
    <input type="text" id="itemid" name="itemid" required><br>
    <label >Item Name: </label>
    <input type="text" id="itemname" name="itemname" required><br>
    <label >Your name: </label>
    <input type="text" id="name" name="name" required><br>
    <label >Your Email Address: </label>
    <input type="text" id="email" name="email" required><br>
    <label >Amount bid: </label>
    <input type="text" id="bid" name="bid"><br>
    <label  > Auto increment Bids to match other bidders? </label>
    <input type="checkbox" name="true" id="true" required><br>
    <input type="submit" value="Submit Bid" name="submit">
    <br>
    </form>
</div>
</body>
</html>