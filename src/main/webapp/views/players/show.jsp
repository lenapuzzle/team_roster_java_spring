<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="player" value="${requestScope.player}" scope="request"/>

<!DOCTYPE html>
<html>
  <head>
    <title>List of Teams</title>
  </head>
  <body>
    <h2><c:out value="${player.name}"/></h2>
    <p>Position: <c:out value="${player.position}" /></p>
  </body>
</html>