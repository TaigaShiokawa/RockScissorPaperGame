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
		<label for="rock">
		<input type="radio" id="rock" name="playerHand" value="0"> 👊
		</label>
		<label for="scissor">
		<input type="radio" id="scissor" name="playerHand" value="1"> ✌
		</label>️
		<label for="paper">️
		<input type="radio" id="paper" name="playerHand" value="2"> ✋
		</label>
		<input type="submit" value="じゃんけんぽん！">
	</form>
</body>
</html>