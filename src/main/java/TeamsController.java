import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/", "/team"})
public class TeamsController extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    League league = League.getLeague();
    List<Team> teams = league.getTeams();

    if (req.getServletPath().equals("/")) {
      req.setAttribute("teams", teams);
      RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/teams/index.jsp");
      requestDispatcher.forward(req, resp);
    } else if (req.getServletPath().equals("/team")) {
      String teamIndexString = req.getParameter("teamIndex");
      int index = Integer.parseInt(teamIndexString);

      if (index < 0 || index >= teams.size()) {
        resp.sendError(HttpServletResponse.SC_NOT_FOUND);
      } else {
        Team team = teams.get(index);
        req.setAttribute("team", team);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/teams/show.jsp");
        requestDispatcher.forward(req, resp);
      }
    }
  }
}
