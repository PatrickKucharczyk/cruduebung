<html>
<head>
    <title>Schueler</title>
</head>

<body>
<h1>Schueler</h1>

<#list schueler as schueler>
    <li><a href="schueler/${schueler.id}">${schueler.nachname}
</#list>

<p><a href="/schueler/new">Neuer Schueler </a></p>
</body>
</html>


