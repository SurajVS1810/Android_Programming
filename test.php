<?php
	$eno=$_REQUEST["eno"];
	$con = mysqli_connect("localhost:3306","root","");
	if(mysqli_connect_error()){
		echo "Failed to connect to MySQL;"+mysqli_connect_error();
	}
	mysqli_select_db($con,"empdb");
	$result=mysqli_query($con,"select * from emp where eno=$eno");
	$row=mysqli_fetch_array($result);
	echo json_encode($row);
?>
	