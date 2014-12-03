package com.sarabadani.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


public class HomeServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("HomeServlet initialized!");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("Here are the best!!");
        writer.println(req.getRequestURI());
        writer.println(req.getRequestURL().toString());
        req.getSession().setAttribute("hello","hello");
        req.getSession().setAttribute("hello","hello");
        req.getSession().setAttribute("hello","hello");
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            writer.println(headerName);
            writer.println(req.getHeader(headerName));

        }
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("HomeServlet destroyed!");

    }
}
