<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<title>Zapisz się na targi!</title>
</head>
<body>
	<form action = "zapis" method = "GET">
	Imię: <input type="text" name = "name"><br>
	Nazwisko: <input type="text" name = "lastname"><br>
	Firma: <input type="text" name = "company"><br>
	Wielkość przedsiębiorstwa: <input type="radio" name="size" value = "mikro">mikro <input type="radio" name="size" value = "małe">małe 
	<input type="radio" name="size" value = "średnie">średnie <input type="radio" name="size" value = "duże">duże <br>
	E-mail: <input type="text" name = "email"><br><br>
	Jesteś:<br>
	<input type="radio" name="type" value = "wystawca">Wystawcą <input type="radio" name="type" value = "odwiedzający">Odwiedzającym<br>
	Wybierz dni, w których chcesz uczestniczyć:<br>
	<input type="checkbox" name="day" value = "all">Wszystkie dni<br>
	<input type="checkbox" name="d1" value = "d1">Pierwszy dzień<br>
	<input type="checkbox" name="d2" value = "d2">Drugi dzień<br>
	<input type="checkbox" name="d3" value = "d3">Trzeci dzień<br>
	Dodatki:<br>
	<input type="checkbox" name="material" value = "material">Materiały promocyjne<br>
	<input type="checkbox" name="catering" value = "catering">Wyżywienie<br>
	<input type="checkbox" name="transport" value = "transport">Transport<br>
	<input type="submit" value="Wyślij zgłoszenie">
	
	
	</form>
</body>
</html>