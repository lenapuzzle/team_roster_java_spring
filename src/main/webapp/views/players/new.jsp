
<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
  <head>
    <title>List of Teams</title>
  </head>
  <body>
    <h2>Add a new Player</h2>
    <form action="/players" method="POST">
      <label for="name">Name:
        <input type="text" name="name" id="name">
      </label>

      <label for="position">Position:</label>
      <input type="text" name="position" id="position">

      <input type="submit" value="Add a Player" />
    </form>
  </body>
</html>