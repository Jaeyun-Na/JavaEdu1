package array;

public class BookArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] library = new Book[5];
		
		library[0] = new Book("�¹���","������");
		library[1] = new Book("���̾�","�츣�� �켼");
		library[2] = new Book("����","�ڰ渮");
		library[3] = new Book("�����","�����㺣��");
		library[4] = new Book("��","�������� ��������");
		
		for(int i = 0; i < library.length; i++){
			library[i].showBookInfo();
		}
		
		for(int i = 0; i < library.length; i++) {				//�迭 �ּ� ���
			System.out.println(library[i]);
		}
		
	}

}
