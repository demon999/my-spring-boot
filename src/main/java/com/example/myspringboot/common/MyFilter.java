package com.example.myspringboot.common;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author Richard Xue
 * @version 1.0
 * @description
 * @date 2019-06-23 11:58
 */
@Slf4j
@WebFilter(urlPatterns = "/*", filterName = "myFilter", asyncSupported = true)
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("MyFilter >>>>>>>>>>");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("doFilter >>>>>>>>>> {}", ((HttpServletRequest)request).getRequestURI() );
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        log.info("destroy >>>>>>>>>>");
    }
}
