<?php
$servername = 'mysql';
$username = 'myuser';
$password = 'mypassword';
$dbname = 'mydb';
header('Content-Type: text/html; charset=utf-8');
mysqli_set_charset($mysqli, 'utf8');
$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die('Connection failed: ' . $conn->connect_error);
}

$sql = 'SELECT * FROM data';
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    while ($row = $result->fetch_assoc()) {
        echo 'Name: ' . $row['name'] . '<br>';
        echo 'Number: ' . $row['number'] . '<br>';
        echo 'Class: ' . $row['class'] . '<br>';
    }
} else {
    echo 'No data found.';
}

$conn->close();
?>
