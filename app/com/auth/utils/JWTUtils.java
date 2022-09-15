package com.auth.utils;

import dto.LoginDto;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import play.api.libs.*;
import play.libs.Json;

import java.util.HashMap;

public class JWTUtils {

    public static String generateJWT(final Object obj){
        String result ="";
        try{
          result = Jwts.builder()
                  .setClaims(new HashMap<String,Object>(){{
                      put("bearer", Json.toJson(obj));
                  }})
                  .signWith(SignatureAlgorithm.HS256,"secre")
                  .compact();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return result;
    }
    public static String generatePlaiTextJWT(final LoginDto obj){
        String result ="";
        try{
            result = Jwts.builder()
                    .setPayload(obj.getLogin() + obj.getPassword()
                    )
                    .signWith(SignatureAlgorithm.HS256,"secre")
                    .compact();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return result;
    }
}
