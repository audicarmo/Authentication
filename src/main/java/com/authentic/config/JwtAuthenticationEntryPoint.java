package com.authentic.config;

import org.springframework.stereotype.Component;

import javax.naming.AuthenticationException;
import java.io.IOException;
import java.io.Serializable;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

    private static final long serialVersionUID = -7858869558953243875L;
    private static final String UNAUTHORIZED = "Não Autorizado";

    public void start(HttpServletRequest request, HttpServletResponse response, AuthenticationException authenticationException)

        throws IOException {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZES, UNAUTHORIZED);
    }
}
