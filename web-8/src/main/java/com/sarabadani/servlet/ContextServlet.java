package com.sarabadani.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by soroosh on 11/25/14.
 */
@WebServlet(name = "contextServlet", urlPatterns = {"/context"})
public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String contextParam1 = this.getServletContext().getInitParameter("contextParam1");
        resp.getWriter().println(contextParam1);
    }
}
