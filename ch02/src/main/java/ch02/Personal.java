package ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Personal
 */
@WebServlet("/Personal")
public class Personal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Personal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String []notice = request.getParameterValues("notice");//복수선택을 받아주려면 : getParameterValues!
		String job = request.getParameter("job");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.printf("이름 : %s" , name + "<p>");
		out.printf("아이디 : %s" ,id+ "<p>");
		out.printf("암호 : %s" , password + "<p>");
		out.printf("성별 : %s" , gender + "<p>");
		out.printf("수신메일 : + ");
		if (notice != null) {
			for(int i = 0; i <notice.length; i++) {
				out.println(notice[i] + " ");
			}
		}else out.println("없음");
		out.printf("직업 : %s" , job + "<p>");
		out.println("</body></html>");
		out.close();

	}
}
