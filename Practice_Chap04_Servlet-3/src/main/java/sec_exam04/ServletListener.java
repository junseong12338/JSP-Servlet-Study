package sec_exam04;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ServletListener implements ServletContextListener {
	//�Ʒ� 2���� �ݹ� �޼���� �ٸ� �����ø����̼�(Ÿ ������Ʈ)�� ����� ���� ����� ����
	//���� ������ �Ǳ� ������ �Ʒ��� ���� �ڵ带 �����ֱ� �ȴٸ� �ּ�ó���� �ϸ� �ȴ�. 
		
	//��Ĺ������ ������ �� �ڵ� ȣ���� �ȴ�.
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("contextDestroyed()ȣ��");
	}

	//��Ĺ������ ���۵� �� �ڵ� ȣ���� �ȴ�.
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("contextInitialized()ȣ��");
	}
}

/*������ ���� ����(����������)
1.contextInitialized()ȣ��
2.������ ȣ��
3.initPostConstructor() ��ó��
4.init()ȣ��
5.doGet()ȣ��, doPost()ȣ��
6.contextDestroyed()ȣ��
7.destroy()ȣ��
8.destroyPredestroy() ��ó��
*/
