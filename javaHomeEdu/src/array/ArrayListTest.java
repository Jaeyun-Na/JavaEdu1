package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥","조전래"));
		library.add(new Book("데미안","헤르만 헤세"));
		library.add(new Book("뇌","베르나르 베르베르"));
		library.add(new Book("토지","박경리"));
		library.add(new Book("어린왕자","생텍쥐페리"));
		
		for(int i = 0; i < library.size(); i++){
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("===향상된 for문 사용===");
		for(Book book : library){
			book.showBookInfo();
		}
	}

}
