package ch08.ex04;

import java.util.logging.Level;
import java.util.logging.Logger;

public class C02MyLogger {
	private Logger logger;
	
	public C02MyLogger() {
		this.logger =Logger.getLogger("ch08.ex04"); 
	}
	
	public void log() {
		logger.info("�α��� �����մϴ�.");
		
		try {
			throw new Exception("�Ϻη� ���ܸ� ��������ϴ�.");
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
		
		logger.info("�α��� �����ϴ�.");
	}
	
	public static void main(String[] args) {
		new C02MyLogger().log();
	}
}
/*

�Ʊ�� �ΰŰ�ü ��������� �ΰ� �ٱ۷ι�
������ Logger.getLogger("")
�Ķ���� => ���� ����ϰ� �ִ� ��ü(Class)�� ��Ű����

���� �ΰŴ� exception �߻������� �� ��

info , err �� �������� method�� �ִµ�
�� �����ϴ°� logger.log 
��, ù��° �Ķ���ͷ� level�� �־��ָ��
Level.SEVERE  - �ɰ��Ѽ���

�ֿܼ� ��µǴ� �ΰ��� �Ѱ� �� ����
-> ���� ���ᰡ �Ǹ� �ΰŴ� �����

�� �� �غ��ϴ°� �ܼ��� �ƴ϶� ���Ͽ��ٰ� �� �ִ°���.


*/