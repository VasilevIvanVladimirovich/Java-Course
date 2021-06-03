package Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

import Classes.*;

public class ServletAdd extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        User user = new User(login, password);
        Base.getInstance().add(user);

        //Делаем переадресацию на html страницу
        response.sendRedirect(request.getContextPath() + "/index.html");
    }

}
