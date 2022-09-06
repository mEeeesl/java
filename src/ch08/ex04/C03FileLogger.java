package ch08.ex04;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class C03FileLogger {
	private Logger logger;
	
	public C03FileLogger() {
		this.logger = Logger.getLogger(this.getClass().getName());
	}
	
	public void log() throws Exception {
		Handler handler = new FileHandler("c:/DEV/ch08.ex04.xml");
		logger.addHandler(handler);
		
		logger.info("�α��� �����մϴ�.");
		logger.severe("���ܰ� �߻������ϴ�.");
		logger.info("�α��� �����ϴ�.");
		
		handler.flush();
		handler.close();
	}
	
	public static void main (String[] args) throws Exception {
		new C03FileLogger().log();
	}
}

/*

��Ű������ ����Ʈ�ڵ����� �ٲ㺸��
> ��ü.getClass() > ClassŸ���� ��ü�� ���ϵ� 
�ű⿡ .getName() ������ Ŭ���� ��Ű������ ����

�ΰſ� ���ο� �ڵ鷯�� �߰������ִ°��� 
�׷��� �� �ΰſ� �������� �����ִ� ;;

�ΰŰ� ���� �ڵ鷯�� ����߾� �׷��� �޸𸮿� �����
�츮�� ���Ͽ� ��ϵǴ°� ������.
handler.flush();
handler.close(); �ڵ鷯 ����Ÿ ����ϰ� �����

27�� new C03FileLogger().log(); �̰� ������
��? throws ������
log�� ���� - try ������ ����� ��
�ٵ� try�� ���� �Ⱦ�
-> �������� ���Ѱ� ������
public static void main (String[] args) throws Exception {}




*/