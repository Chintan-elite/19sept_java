<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
	
	<script type="text/javascript">
	
	function validation()
	{
		var fname = document.getElementById("fname").value
		var lname = document.getElementById("lname").value
		var email = document.getElementById("email").value
		var pass = document.getElementById("pass").value
		var cpass = document.getElementById("cpass").value
		var phno = document.getElementById("phno").value
		var fnameE = document.getElementById("fnameE");
		var lnameE = document.getElementById("lnameE");
		var emailE = document.getElementById("emailE");
		var passE = document.getElementById("passE");
		var cpassE = document.getElementById("cpassE");
		var phnoE = document.getElementById("phnoE");
		var sbtn = document.getElementById("sbtn");
		
		var emailExp = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/
		if(fname==""||fname==null)
		{
			fnameE.innerHTML = "Firstname should not be blank"
			sbtn.disabled=true;
			return;
		}
		else
		{
			fnameE.innerHTML=""
			sbtn.disabled=false;
		}
		
		if(lname==""||lname==null)
		{
			lnameE.innerHTML="Lastname should not be blank"
				sbtn.disabled=true;
			return;
		}
		else
		{
			lnameE.innerHTML=""
				sbtn.disabled=false;
			
		}
		
		if(email=="" || email==null)
		{
			emailE.innerHTML="Email should not be blank"
				sbtn.disabled=true;
			return;
		}
		else if(!emailExp.test(email))
		{
			emailE.innerHTML="Invalid email format"
		}
		else
		{
			emailE.innerHTML=""
				sbtn.disabled=false;
		}
		
		if(pass==""||pass==null)
		{
			passE.innerHTML="Password should not be blank"
				sbtn.disabled=true;
			return;
		}
		else
		{
			passE.innerHTML=""
				sbtn.disabled=false;
		}
		
		if(cpass!=pass)
		{
			cpassE.innerHTML="confirm password should be same as a password"
				sbtn.disabled=true;
			return;
		}
		else
		{
			cpassE.innerHTML=""
				sbtn.disabled=false;
		}
		
		if(phno==""||phno==null)
		{
			phnoE.innerHTML="Phone Number should not be blank"
				sbtn.disabled=true;
			return;
		}
		else
		{
			phnoE.innerHTML=""
			sbtn.disabled=false;
			return false;
			
		}
		
		
	}
	
	</script>
	
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-4 m-auto">


				<h1>Registration form</h1>
				<form action="reg" method="post">
					<span class="text-success">${msg}</span>
					<div class="form-group">
					<label>Firstname</label> <input type="text" name="fname" id="fname" class="form-control" onkeyup="validation()">
					<span id="fnameE" class="text-danger"></span>
					</div>
					<div class="form-group">
					<label>Lastname</label> <input type="text" name="lname" id="lname" class="form-control" onkeyup="validation()">
					<span id="lnameE" class="text-danger"></span>
					</div>
					<div class="form-group">
					<label>Email</label> <input type="text" name="email" id="email" class="form-control" onkeyup="validation()">
					<span id="emailE" class="text-danger"></span>
					</div>
					<div class="form-group">
					<label>Password</label> <input type="text" name="pass" id="pass" class="form-control" onkeyup="validation()">
					<span id="passE" class="text-danger"></span>
					</div>
					<div class="form-group">
					<label>confirm password</label> <input type="text" name="cpass"
						id="cpass" class="form-control" onkeyup="validation()"> 
					<span id="cpassE" class="text-danger"></span>
					</div>
					<div class="form-group">	
						<label>phno</label> <input type="text"
						name="phno" id="phno" class="form-control" onkeyup="validation()">
					<span id="phnoE" class="text-danger"></span>
					</div>
					 <input type="submit" class="btn btn-success" id="sbtn">
					 <input type="reset" class="btn btn-primary">
				</form>
				<a href="display">View all student</a> | 
				<a href="login.jsp">login here</a>
			</div>
		</div>
	</div>
</body>
</html>