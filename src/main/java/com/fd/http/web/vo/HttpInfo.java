package com.fd.http.web.vo;

import java.util.Map;

import javax.servlet.http.Cookie;

public class HttpInfo {
	private Cookie[] cookies;
	private Map<String, String[]> params;
	private Map<String, String> heads;
	private String ip;

	public Cookie[] getCookies() {
		return cookies;
	}

	public void setCookies(Cookie[] cookies) {
		this.cookies = cookies;
	}

	public Map<String, String[]> getParams() {
		return params;
	}

	public void setParams(Map<String, String[]> params) {
		this.params = params;
	}

	public Map<String, String> getHeads() {
		return heads;
	}

	public HttpInfo() {
		super();
	}

	public HttpInfo(Map<String, String[]> params, Map<String, String> heads, String ip) {
		super();
		this.params = params;
		this.heads = heads;
		this.ip = ip;
	}

	public HttpInfo(Cookie[] cookies, Map<String, String[]> params, Map<String, String> heads, String ip) {
		super();
		this.cookies = cookies;
		this.params = params;
		this.heads = heads;
		this.ip = ip;
	}

	public void setHeads(Map<String, String> heads) {
		this.heads = heads;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}
