import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

@WebServlet(urlPatterns = {"/players/new", "/players"})
public class PlayersController extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/players/new.jsp");
    requestDispatcher.forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    if (req.getServletPath().equals("/players")) {
      // with args constructor
      Player newPlayer = new Player(req.getParameter("position"), req.getParameter("name"));

      // with no arg constructor
//      Player newPlayer = new Player();
//      try{
//        BeanUtils.populate(newPlayer, req.getParameterMap());
//      }  catch (InvocationTargetException e) {
//        e.printStackTrace();
//      } catch (IllegalAccessException e) {
//        e.printStackTrace();
//      }

      req.setAttribute("player", newPlayer);
      RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/players/show.jsp");
      requestDispatcher.forward(req, resp);
    }
  }
}
