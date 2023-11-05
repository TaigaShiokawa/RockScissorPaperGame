<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>結果</h1>
	<p>あなたの手：${myHand }</p>
	<p>コンピュータの手：${cpHand }</p>
	<p>
		<strong>${ result }</strong>
	</p>
	<a href="nomalJanken">もう一度</a><br>
	<a href="startScreen">人数を選びなおす</a><br>
</body>
</html>