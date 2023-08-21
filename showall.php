<?php
	$con = mysqli_connect("localhost:3306","root","");
	if (mysqli_connect_errno()) {
      		echo "Failed to connect to MySQL: " . mysqli_connect_error();
   	}
	mysqli_select_db($con,"empdb");
	$result = mysqli_query($con,"select * from emp");
	$row = mysqli_fetch_array($result);
	$arr = Array();
	$i=0;
	while($row)
	{
		$arr[$i]["eno"] = $row[0];
		$arr[$i]["ename"] = $row[1];
        $arr[$i]["esal"] = $row[2];
		$i++;
		$row = mysqli_fetch_row($result);
	}
	echo json_encode($arr);	
?>