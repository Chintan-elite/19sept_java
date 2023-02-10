<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>

<script type="text/javascript">

	$(document).ready(function(){
		
		$.get("country",{},function(response){
			$("#country").html(response);
		})
	})
	
	function getstate(cid)
	{
		$.get("state",{cid},function(response){
			$("#state").html(response);
		})
	}


</script>
	

</head>
<body>
		<select id="country" onchange="getstate(value)">
		<option>---select country---</option>
		</select>
		
		<select id="state">
		<option>---select state---</option>
		</select>
			
</body>
</html>