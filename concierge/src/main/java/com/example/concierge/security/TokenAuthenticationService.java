package com.example.concierge.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.json.JSONObject;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

public class TokenAuthenticationService {

    //tempo de expiração do token = 10 dias
    static final long EXPIRATION_TIME = 860_000_000;
    static final String SECRET = "MySecret";
    static final String TOKEN_PREFIX = "Bearer";
    static final String HEADER_STRING = "Authorization";


    static void addAuthentication(HttpServletResponse response, String username) throws IOException {
        String JWT = Jwts.builder()
                        .setSubject(username)
                        .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                        .signWith(SignatureAlgorithm.HS512, SECRET)
                        .compact();

        HashMap<String, String> token = new HashMap<String, String>();

        token.put("Authorization",JWT);
        token.put("User","Teste");
        JSONObject json = new JSONObject(token);
        response.setContentType("application/json");
        System.out.println(json);
        //response.setContentLength(json.length());
        response.getWriter().write(String.valueOf(json));

        //response.setHeader(HEADER_STRING, TOKEN_PREFIX + " " + JWT);
    }

    static Authentication getAuthentication(HttpServletRequest request){
        String token = request.getHeader(HEADER_STRING);

        if(token != null){
            // faz parse de token
            String user = Jwts.parser()
                            .setSigningKey(SECRET)
                            .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
                            .getBody()
                            .getSubject();
            if (user != null){
                return new UsernamePasswordAuthenticationToken(user,null, Collections.emptyList());
            }

        }
        return null;
    }
}
