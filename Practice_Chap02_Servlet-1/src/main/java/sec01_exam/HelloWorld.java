package sec01_exam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// javax.servlet��Ű���� ������ �߻��ϸ�, ������Ʈ ��Ŭ������ bulid path -> libraries -> add external jars
// -> ��Ĺ����\lib\ ->ã�� (jsp_api.jar, serviet_api.jar�߰��� �ϸ��)
/**
 * Servlet implementation class HelloWorld
 */
// URL �����ڱװ� @WebServlet ������̼ǿ� ���Ǿ� �ִ�.
// @WebServlet������̼Ǻ��� web.wml���� ������ �����ڵ��� �켱������ �ξ� ����
// ���� �����̵Ǹ� HttpServletŬ������ �ڵ����� ��� �޴´�.

//@WebServlet("/Hworld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */


	
	// ������
    public HelloWorld() {
        
    }

	
    // ���⼭ 2���� �޼��尡 �����µ� doGet(), doPost()d�ε� ,�̰��� �� ���� ������ ó���ϴ� �κ��̴�.
    // �� ������ ȣ���Ҷ� Ŭ���̾�Ʈ���� ��û�� ���� ��, get����̳�, post����̳Ŀ� ���� ȣ���� �޶�����.
    // doGet() �޼���� �׳� ����ϴ� ���·� ���� ���δ�.
    // doPost() �޼���� �����͸� �����̳� ó���ڵ带 ���� �Ҷ� ���� ���ȴ�.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hellow Wolrd!");
		System.out.println("doGet()");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hellow Wolrd!");
		System.out.println("doPost()");
	}
	
	
	// ���
	// 1. jsp���� : HTML ���ϳ��� jsp �ڵ带 �ִ°�
	// servlet���� : �ڹ������̰�, �ݵ�� ������ �� �� ����ؾ��Ѵ�
}
