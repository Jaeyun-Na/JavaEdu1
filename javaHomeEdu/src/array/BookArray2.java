package array;

public class BookArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] library = new Book[5];
		
		library[0] = new Book("태백산맥","조정래");
		library[1] = new Book("데미안","헤르만 헤세");
		library[2] = new Book("토지","박경리");
		library[3] = new Book("어린왕자","생텍쥐베리");
		library[4] = new Book("뇌","베르나르 베르베르");
		
		for(int i = 0; i < library.length; i++){
			library[i].showBookInfo();
		}
		
		for(int i = 0; i < library.length; i++) {				//배열 주소 출력
			System.out.println(library[i]);
		}
		
	}

}
