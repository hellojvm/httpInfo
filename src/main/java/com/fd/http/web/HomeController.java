package com.fd.http.web;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fd.http.web.vo.HttpInfo;

@RestController
@RequestMapping("/home")
public class HomeController {
	@RequestMapping
	public HttpInfo index(HttpServletRequest req) {
		Map<String, String> heads = new HashMap<String, String>();
		Enumeration<String> ns = req.getHeaderNames();
		while (ns.hasMoreElements()) {
			String name = ns.nextElement();
			heads.put(name, req.getHeader(name));
		}
		HttpInfo hi = new HttpInfo(req.getCookies(), req.getParameterMap(), heads, req.getRemoteAddr());
		return hi;
	}
}
