package net.zld.egou.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Session 供应类，为后面的session共享作好扩展
 * @author stone
 *
 */
public interface SessionProvider {

	//往Session设置值
	//name Constants  buyer_session
	//value   用户对象
	public void setAttribute(HttpServletRequest request, HttpServletResponse response, String name, Object value);
	
	//从Session中取值
	public Object getAttribute(HttpServletRequest request, HttpServletResponse response, String name);
	
	//退出登陆
	public void logout(HttpServletRequest request, HttpServletResponse response);
	
	//获取SessionID
	public String getSessionId(HttpServletRequest request, HttpServletResponse response);
}
