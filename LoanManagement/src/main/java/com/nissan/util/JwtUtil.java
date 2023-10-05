package com.nissan.util;

import java.nio.file.AccessDeniedException;
import java.sql.Date;

import org.springframework.stereotype.Component;

import com.nissan.entity.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component 
public class JwtUtil {
	//secret key for TOKEN
	private static String secret = "THIS_IS_JAVA";
	
	//expiration time
	private static long expiryDurationn = 60*60;
	
	//generate token: header.payload.signature
	public String generateJwt(User user) {
		long milliTime = System.currentTimeMillis();
		long expiryTime = milliTime + expiryDurationn*1000;
		
		//set issuedTime and ExpiryTime in token
		Date issuedAt = new Date(milliTime);
		Date expiryAt = new Date(expiryTime);
		
		//claims
		Claims claim = Jwts.claims().setIssuer(user.getUserId().toString())
				.setIssuedAt(issuedAt).setExpiration(expiryAt);
		//generate JWT token using claims
		return Jwts.builder().setClaims(claim).signWith(SignatureAlgorithm.HS512, secret).compact();
	}
	
	//checking token is valid or not
	public static Claims verify(String authorization) throws AccessDeniedException {
		try {
			Claims claim = Jwts.parser().setSigningKey(secret).parseClaimsJws(authorization).getBody();
			return claim;
		}catch(Exception e) {
			throw new AccessDeniedException("Sorry! ACCESS DENIED!!");
		}
	}
}