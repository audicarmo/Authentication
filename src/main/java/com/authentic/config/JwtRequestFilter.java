package com.authentic.config;

public class JwtRequestFilter extends OncePerRequestFilter {

    private static final String AUTHORIZATION = "Authorization";

    private static final String BEARER = "Bearer ";

    private static final int LENGTH_BEARER_TOKEN = 8;
}
