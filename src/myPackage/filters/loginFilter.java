package myPackage.filters;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class loginFilter implements Filter {
    
    public void init(FilterConfig config) throws ServletException {}
    
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
            throws IOException, ServletException {
        
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession(false);
        
        if (session == null || session.getAttribute("userId") == null) {
            res.sendRedirect(req.getContextPath() + "/main/login.jsp");
        } else {
            chain.doFilter(request, response);
        }
    }
    
    public void destroy() {}
}
