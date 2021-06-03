package Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class ServletList extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//      Перенаправляем наш запрос на jsp странницу
        String path = "/list.jsp";
        ServletContext servletContext = getServletContext();  //получаем объект ServletContext, который представляет контекст запроса.
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);

    }
}









//        response.setContentType("text/html");
//        request.getRequestDispatcher("/list.jsp").forward(request, response);