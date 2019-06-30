package com.square.root.filters;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class HeaderFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        if (req.getHeader("server-key").equals("qwerty"))
            System.out.println("Все ок.");

        if (req.getHeader("server-key").equals("true"))
            filterChain.doFilter(servletRequest, servletResponse);
    }
}
