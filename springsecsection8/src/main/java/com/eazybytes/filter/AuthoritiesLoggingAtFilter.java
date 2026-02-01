package com.eazybytes.filter;

import jakarta.servlet.*;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

// Since we'll not have control on the order of the filters, and it is random in nature
// we should avoid providing the filters at same order using this filter, feel free to user filter after or before
@Slf4j
public class AuthoritiesLoggingAtFilter implements Filter {
    /**
     * @param request  The request to process
     * @param response The response associated with the request
     * @param chain    Provides access to the next filter in the chain for this filter to pass the request and response
     *                 to for further processing
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        log.info("Authentication Validation is in progress");
        chain.doFilter(request, response);
    }
}
