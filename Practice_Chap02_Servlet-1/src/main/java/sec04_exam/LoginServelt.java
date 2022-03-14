package sec04_exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServelt
 */
@WebServlet("/Login")
public class LoginServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("doGet�޼��� ȣ���");
//		// Ŭ���̾�Ʈ�� ��û�� �Ķ���� ������ ���ڵ� �������ִ� �ڵ�
//		request.setCharacterEncoding("UTF-8");
//		// Ŭ���̾�Ʈ���Լ� �Ѿ���� ���̵�,��й�ȣ���� �ް� ���ڵ� ������ ��½�Ʈ���� ��� ȭ�鿡 �Ѹ���.
//		String id = request.getParameter("id");
//		String passwd = request.getParameter("password");
//		
//		response.setContentType("text/html; charset=utf-8");
//		PrintWriter writer = response.getWriter();
//		writer.println("���̵� : " +id+"<br/>");
//		writer.println("��й�ȣ : " +passwd+"<br/>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost�޼��� ȣ���");
		// Ŭ���̾�Ʈ�� ��û�� �Ķ���� ������ ���ڵ� �������ִ� �ڵ�
		request.setCharacterEncoding("UTF-8");
		// Ŭ���̾�Ʈ���Լ� �Ѿ���� ���̵�,��й�ȣ���� �ް� ���ڵ� ������ ��½�Ʈ���� ��� ȭ�鿡 �Ѹ���.
		String id = request.getParameter("id");
		String passwd = request.getParameter("password");
		
		// Ŭ���̾�Ʈ���� �ѷ��ִ� ȭ���� �Ǵ� �ڵ�
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.println("���̵� : " +id+"<br/>");
		writer.println("��й�ȣ : " +passwd+"<br/>");
	}

}
