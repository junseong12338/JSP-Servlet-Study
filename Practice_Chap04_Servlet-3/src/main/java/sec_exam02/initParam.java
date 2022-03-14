package sec_exam02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class initParam
 */
//�� ��° ���
//�Ʒ��� ���� ������̼��� �����ϱ� ���ؼ��� web.xml�� ����Ǿ� �ִ� �κ��� �ϴ� �ּ�ó���� �Ѵ�.
//�ּ� ó���� �ؾ� �Ʒ��ڵ尡 ������ �ȴ�.������̼��� �̿��� �ؼ� ���� �ʱ�ȭ �Ķ���� ���� �����Ͽ���.
//@WebServlet(urlPatterns = {"/IP"}, 
//			initParams = {
//					@WebInitParam(name = "id", value="admin"),
//					@WebInitParam(name = "pw", value="1234abcd!!"),
//					@WebInitParam(name = "path", value="C://Temp")					
//			})


//����� �ʱ�ȭ �Ķ���͸� ����ϴ� ����, ���� ������ ������ ���� ����� �ϰ�, ��� web.xml���Ͽ� ����� �ϴ°���
//�ٶ����ϴ�.
public class initParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public initParam() {
        super();       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGetȣ��");
				
		//��� �������� ���� ������ Ctrl+T�� �̿��ϸ� �ȴ�.
		//ServletConfig(�������̽�)�� �߻�޼��带 HttpServletŬ�������� �����Ͽ���.
		//���� this�� �ڱ� �ڽ��� �ּҸ� ������ �ִٶ�� ���� �̹� �ڹٿ��� �����.
		//getInitParameter()�� HttpServletŬ������ ����Ŭ���� GenericServletŬ������
		//����� �޼����̹Ƿ� �ڼ�Ŭ�������� �󸶵��� ����� �� ���� �ִ�.
		String id = this.getInitParameter("id");
		String pw = this.getInitParameter("pw");
		String path = this.getInitParameter("path");		
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
		out.println("���̵� : " + id + "<br/>");
		out.println("��й�ȣ : " + pw + "<br/>");
		out.println("��� : " + path + "<br/>");
		out.println("</body></html>");
		
		out.close();		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
