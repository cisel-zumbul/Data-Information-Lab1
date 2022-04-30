package nl.utwente.di.temperature;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/** Example of a Servlet that gets an ISBN number and returns the book price
 */

public class Temperature extends HttpServlet {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Converter converter;
	
    public void init() throws ServletException {
    	converter = new Converter();
    }	
	
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String docType =
      "<!DOCTYPE HTML>\n";
    String title = "Temperature Successfully Converted";
    out.println(docType +
                "<HTML>\n" +
                "<HEAD><TITLE>" + title + "</TITLE>" +
                "<LINK REL=STYLESHEET HREF=\"styles.css\">" +
                		"</HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1>" + title + "</H1>\n" +              
                "  <P>The celsius value: " +
                   request.getParameter("degree") + "\n" +
                "  <P>The Fahrenheit value: " +
                   Double.toString(converter.convertCelsius(request.getParameter("degree"))) +
                "</BODY></HTML>");
  }
  

}
