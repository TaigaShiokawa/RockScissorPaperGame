<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>じゃんけん - 1対1</title>
</head>
<body>
<h1>あなたの選択</h1>
	<form action="nomalJanken" method="post">
		<input type="radio" name="playerHand" value="0"> 👊
		<input type="radio" name="playerHand" value="1"> ✌️
		<input type="radio" name="playerHand" value="2"> ✋
		<input type="submit"　value="じゃんけんぽん！">
	</form>
</body>
</html>