package com.ducetech.framework.security;


public interface TokenManager {

    String createToken(String userId);

    boolean checkToken(String token);
}
