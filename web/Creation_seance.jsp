<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 16/12/2019
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Creation seance</title>
</head>
<body>
    <FORM Method="POST" Action="CreationSeance">
        Id : <INPUT type=number size=20 name="IdSeance"><BR>
        Horraire début : <INPUT type=time size=20 name="HorraireDebut"><BR>
        Horraire fin : <INPUT type=time size=20 name="HorraireFin"><BR>
        Date : <INPUT type=date size=20 name="Date"><BR>
        <INPUT type=submit value=Créer>
    </FORM>

</body>
</html>
