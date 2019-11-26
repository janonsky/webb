import com.google.gson.Gson;
import dao.AuthorsDAO;
import dao.DAOFactory;
import data.Author;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "Test")
public class Test extends HttpServlet {
    private Gson gson = new Gson();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        DAOFactory factory = DAOFactory.getDaoFactory();
        AuthorsDAO authorsDAO = factory.getAuthorsDAO();
        PrintWriter writer = response.getWriter();

        if (request.getParameterMap().isEmpty()) {
            ArrayList<Author> authors = authorsDAO.getAll();
            writer.println(gson.toJson(authors));
        } else if (request.getParameterMap().containsKey("id")) {
            Author item = authorsDAO.findByID(Integer.parseInt(request.getParameter("id")));
            writer.println(gson.toJson(item));
        } else {
            ArrayList<Author> authors = authorsDAO.getByParameters(request.getParameterMap());
            writer.println(gson.toJson(authors));
        }
        writer.flush();
        writer.close();
    }
}
