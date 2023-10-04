<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="myExtrangeCalculator.Calculator"%>
    <%@ page import="java.util.ArrayList"%>
    <%@ page import="java.util.List"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Extrange Calculator</title>
<style>
	form{
		margin: 0 auto;
		border: solid 2px black;
		width: 30%;
		padding: 10px;
		margin-top: 10%		
	}
	button{
		margin-left: 10%
	}
	h1{
		text-align: center;
	}
	
	
</style>
</head>
<body>
	<%
	String area = request.getParameter("area");
	String n = request.getParameter("n");
	String op = request.getParameter("op");
	String b = request.getParameter("b");
	
	Calculator c = new Calculator();
	
	if(b!=null && b.equals("send")){
		area=Calculator.send(area, n,op);
		c.add(op,n);
		
	}else if(b!=null && b.equals("reset")){
		area="";
		c.clear();
		
	}else if(b!=null && b.equals("solve")){
		area=Calculator.solve(area);
	}
	%>
	<h1>My Strange Calculator</h1>
	<form method="get" action="index.jsp" >
		<textarea rows="3" cols="40" name="area"><%=area%></textarea>
		<br>
		<br>
		Number: <input type="number" name="n">
		<br>
		<br>
		Operator <select name="op">
					<option value=""></option>
					<option value="+">+</option>
					<option value="-">-</option>
				 </select>
		<br>
		<br>
		<button type="submit" name="b" value="send">Send</button>
		<button type="submit" name="b" value="reset">Reset</button>
		<button type="submit" name="b" value="solve">Solve</button>
	</form>
</body>
</html>