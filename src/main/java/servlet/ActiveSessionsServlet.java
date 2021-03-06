package servlet;

import tools.SQL;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
// import javax.servlet.RequestDispatcher;
// import javax.servlet.ServletException;
// import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Describes the servlet used on the gameslist page
 * @author Thomas LEPERCQ
 */
@WebServlet(name = "activesessions", urlPatterns = { "/onsessions" })
public class ActiveSessionsServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Displays the page
     * @param request
     * @param response
     * @author Dejan PARIS
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/activesessions.jsp");
        try {
            ArrayList<String> sessions = SQL.allActiveSessions();
            request.setAttribute("data", sessions);
            rd.forward(request, response);
        } catch (Exception e) {}
    }

    /**
     * Gets checkbox value to add or remove selected session.
     * @param request
     * @param response
     * @author Dejan PARIS
     */
    // TODO
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            ArrayList<String> sessions = SQL.allActiveSessions();
            String checkbox = request.getParameter("checkbox");
            for (int i=0; i<sessions.size(); i++) {
                if(checkbox.equals(""+i)) {
                    SQL.endSession(sessions.get(3*i), sessions.get(3*i+1));
                }
            }
        } catch (Exception e) {}
        doGet(request, response);
    }
}
