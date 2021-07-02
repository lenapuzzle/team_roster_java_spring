<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="teams" value="${requestScope.teams}" scope="request"/>

<!DOCTYPE html>
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>List of Teams</title>
  </head>

    <body>
    <h2>Teams</h2>
      <ul>
       <c:forEach var="team" items="${teams}">
        <li>
          <a href="/team?teamIndex=${teams.indexOf(team)}">
            <c:out value="${team.teamName}"/>
          </a>
        </li>
       </c:forEach>
      </ul>

    </body>
  </html>
