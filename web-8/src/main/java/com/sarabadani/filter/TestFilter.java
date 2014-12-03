package com.sarabadani.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by soroosh on 11/26/14.
 */
public class TestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Init...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filtering started...");
        chain.doFilter(request, response);
        System.out.println("Filtering finished...");
    }

    @Override
    public void destroy() {
        System.out.println("Filter destroy...");
    }
}
