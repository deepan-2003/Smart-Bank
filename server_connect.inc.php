<?php
$con = mysqli_connect('localhost','root','Deepan@1234');
if(!$con || !mysqli_select_db($con, 'bank'))
{	$error='Cant connect';
	die($error);
}
?>
