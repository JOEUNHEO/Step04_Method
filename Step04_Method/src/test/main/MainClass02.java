package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//showMsg() �޼ҵ带 ȣ���� ������~
		MainClass02.showMsg("������");
		
		String str = "�ȳ��ϼ���";
		MainClass02.showMsg(str);
		
		//��Ȳ�� ���� null �� �����ϴ� ��쵵 �ִ�.
		MainClass02.showMsg(null);
	}
	
	//static ��� �޼ҵ�
	public static void showMsg(String msg) {//������ �Է¹��� ��, �ݵ�� data type�� ����ؾ� �Ѵ�.
		System.out.println("msg:"+msg);
	}
}
