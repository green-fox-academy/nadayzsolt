package com.homework.homework.util;

import com.homework.homework.user.User;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


@Component
public class JwtTokenUtil implements Serializable {
  private static final long serialVersionUID = -2550185165626007488L;
  public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;
  @Value(value = "${JWT_SECRET}")
  private String secret;

  public String getIdFromToken(String token) {
    return getClaimFromToken(token, Claims::getSubject);
  }

  public Date getExpirationDateFromToken(String token) {
    return getClaimFromToken(token, Claims::getExpiration);
  }

  public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
    final Claims claims = getAllClaimsFromToken(token);
    return claimsResolver.apply(claims);
  }

  private Claims getAllClaimsFromToken(String token) {
    return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
  }

  private Boolean isTokenExpired(String token) {
    final Date expiration = getExpirationDateFromToken(token);
    return expiration.before(new Date());
  }

  public String generateToken(User user) {
    Map<String, Object> claims = new HashMap<>();
    claims.put("dollarAmount", user.getDollarAmount());
    return createToken(claims, user.getId());
  }

  private String createToken(Map<String, Object> claims, Long subject) {
    return Jwts.builder().setClaims(claims).setSubject(subject.toString())
        .setIssuedAt(new Date(System.currentTimeMillis()))
        .signWith(SignatureAlgorithm.HS512, secret).compact();
  }

  public Boolean validateToken(String token, User user) {
    final String id = getIdFromToken(token);
    return (id.equals(user.getId().toString()) && !isTokenExpired(token));
  }

  public Long getIdFromRequest(HttpServletRequest request) {
    return Long.parseLong(getIdFromToken(request.getHeader("Home-token").substring(7)));
  }

  public Double getDollarAmountFromRequest(HttpServletRequest request) {
    return (double) getDollarAmountFromToken(request.getHeader("Home-token").substring(7));
  }

  private Double getDollarAmountFromToken(String token) {
    Map<String, Object> claims = getAllClaimsFromToken(token);
    return (double) (claims.get("dollarAmount"));
  }
}