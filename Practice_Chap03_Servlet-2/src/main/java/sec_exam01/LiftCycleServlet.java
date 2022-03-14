package sec_exam01;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LiftCycleServlet
 */
@WebServlet("/LC")
public class LiftCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	//������
    public LiftCycleServlet() {
        System.out.println("������ ȣ��");
    }
    
    //init()�� ctrl+space�ٸ� ���� ���� �Է��Ͽ� �ڵ�����
    //���� �ѹ��� ������ �ȴ�.
    @Override
	public void init() throws ServletException {
		System.out.println("init()ȣ��");
	}	
    
    //����Ǿ�����, ���� ��ü�� �޸𸮿� �ε��� �ǰ�, ��� ������ �Ѵ�.
    //�ּ�ǥ���ٿ��� ���ΰ�ħ�� ��� �ϸ� doGet()ȣ���� �Ǵ� ���� �� ���� �ִ�.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()ȣ��");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()ȣ��");
	}
	
	//doGet(),doPost()�� ���ٸ� service()�� ȣ���� �ǰ�,
	//������ �޼��尡 �� �����Ͽ��� service()�� ȣ���� �ȴ�.
	//service()�� get,post������� � �޼��� ������� ȣ���� �Ǿ�����
	//�� ���� ����.�Ͽ�, ��������� doGet(),doPost()�� ����Ѵ�.
//	@Override
//	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
//		System.out.println("service()ȣ��");
//	}	
	
	//������ �������� ���� destroy()�� ȣ��Ǵ� ���� ������ �ִ�.
	@Override
	public void destroy() {
		System.out.println("destroy()ȣ��");
	}
	
	//�������̵��� ������ �ƴϴ�.���� �޼��带 ������ִ� ���̴�.(�߿�)
	//��ó�� �κп� �ش��Ѵ�.
	//init()�޼��尡 ȣ��Ǳ� ���� ���� �����Ѵ�.
	//@PostConstruct������̼��� �����Ϸ����� ���� �����Ѵ�.
	private void initPostConstructor() {
		System.out.println("initPostConstructor() ��ó��");
	}
	
	//�������̵��� ������ �ƴϴ�.���� �޼��带 ������ִ� ���̴�.(�߿�)
	//��ó�� �κп� �ش��Ѵ�.
	//destroy()�޼��尡 ȣ��� �Ŀ� �����Ѵ�.
	//@PreDestroy������̼��� �����Ϸ����� ���� �����Ѵ�.
	private void destroyPredestroy() {
		System.out.println("destroyPredestroy() ��ó��");
	}
}
