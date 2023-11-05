<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>じゃんけん勝負</title>
</head>
<body>
	<h1>結果</h1>
	<p>
		あなたの手：${myHand }<br> 
		PC1の手：${pcHand1 }<br> 
		PC2の手：${pcHand2 }<br>
		<strong>結果</strong><br>${result}</p>
	<a href="multiJanken">もう一度</a>
	<br>
	<a href="startScreen">人数を選びなおす</a>
	<br>
</body>
</html>