<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function goToLocation() {
		var selectedOption = document.getElementById("menuSelect").value;
		window.location.href = selectedOption;
	}
</script>
</head>
<body>
	<h1>じゃんけんゲーム</h1>
	<h3>対戦するコンピュータの数を選んでください</h3>
	<form>
		<select id="menuSelect" onchange="goToLocation();">
			<option>–– コンピュータの数 ––</option>
			<option value="nomalJanken">–– 1対 ––</option>
			<option value="multiJanken">–– 2対 ––</option>
		</select>
	</form>
</body>
</html>