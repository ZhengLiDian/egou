package net.zld.egou.web;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@Service
public class HttpSessionProvider implements SessionProvider{
    @Override
    public void setAttribute(HttpServletRequest request, HttpServletResponse response, String name, Object value) {
        request.getSession().setAttribute(name,value);
    }

    @Override
    public Object getAttribute(HttpServletRequest request, HttpServletResponse response, String name) {
        return request.getSession().getAttribute(name);
    }

    @Override
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().removeAttribute("buyer");
    }

    @Override
    public String getSessionId(HttpServletRequest request, HttpServletResponse response) {
        return request.getSession().getId();
    }
}
