

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class filterdemo1
 */
@WebFilter("/filterdemo1")
public class filterdemo1 implements Filter 
{
   FilterConfig F=null;
   
    public filterdemo1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		F=null;
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
				
		long longservice_Start = System.currentTimeMillis();
		chain.doFilter(request, response);

		long longservice_Stop = System.currentTimeMillis();
		
		int service_Stop = 0;
		int service_Start = 0;
		Object longserviceTime = (service_Stop - service_Start);
		String path = ((HttpServletRequest) request).getRequestURI();
		String serviceTime = null;
		F.getServletContext().log("Time taken to process request for:  " +path+" is: "+serviceTime+ " milliseconds");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException 
	{
		F=fConfig;
	}

}
