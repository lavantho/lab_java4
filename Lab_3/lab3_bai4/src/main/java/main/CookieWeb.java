package main;

import java.net.http.HttpRequest;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieWeb {
public static Cookie add(String name,String value,int hours,HttpServletResponse resp) {
	Cookie cookie=new Cookie(name, value);
	cookie.setMaxAge(hours*60*60);
	cookie.setPath("/");
	resp.addCookie(cookie);
	return cookie;
}
public static String getCookie(String name,HttpServletRequest req) {
	Cookie[]cookie=req.getCookies();
	if(cookie!=null) {
		for(Cookie x:cookie) {
			if(x.getName().equalsIgnoreCase(name)) {
				return x.getValue();
			}
		}
	}
	return null;
}
}
