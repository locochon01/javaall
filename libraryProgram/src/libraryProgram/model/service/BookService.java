package libraryProgram.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import libraryProgram.model.vo.Book;

public class BookService {
	
	Scanner sc = new Scanner(System.in);
	
	private List<Book> bookList = new ArrayList <Book>();
	
	public BookService () {
		bookList.add(new Book ("용의자 X의 헌신", "히가시노 게이고", 15120, "재인출판사", 12345));
		bookList.add(new Book ("파친코", "이민진", 14900, "KH출판사",12346 ));
		bookList.add(new Book ("토익 보카", "데이비드 조", 24000, "KH출판사", 12689));
		bookList.add(new Book ("다시보는 삼국지", "허 윤", 16800, "KH출판사", 12135));
		bookList.add(new Book ("하얼빈", "시핑", 11490, "KH출판사", 12455));
	}

	public void displayMenu() {
		
		int menuNum = 0;
		
		do {
			System.out.println("\n============도서 관리 프로그램==============\n");
			System.out.println("1. 도서 정보 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 정보 수정");
			System.out.println("4. 도서 정보 제거");
			System.out.println("5. 도서 검색 (제목)");
			System.out.println("6. 도서 검색 (저자)");
			
			System.out.println("0. 프로그램 종료");
			
			System.out.print("\n메뉴 번호 선택 >>");
			
			try {
				menuNum = sc.nextInt();
				System.out.println(); // 줄바꿈용도
				
				switch(menuNum) {
				case 1: System.out.println(addBook()); break;
				case 2: SelectAll(); break;
				case 3: System.out.println(updateBook()); break;
				case 4: System.out.println(removeBook()); break;
				case 5: searchName(); break;
				case 6: searchAuthor(); break;
				case 0: System.out.println("프로그램 종료"); break;
				default : System.out.println("메뉴에 작성된 번호만 입력해주세요!");
				}
				
				
				
			} catch(InputMismatchException e) {
				
				System.out.println("\nerror : 입력 형식이 유효하지 않습니다. 다시 시도해주세요!");
				sc.nextLine(); 
				menuNum = -1; 
			}
			
		}while(menuNum != 0);
	}
	
	public String addBook() throws InputMismatchException {
		System.out.println("=======도서 정보 추가========");
		
		System.out.print("제목 : ");
		String name = sc.next();
		
		System.out.print("저자 : ");
		String author = sc.next();
		sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String editor = sc.next();
		sc.nextLine();
		
		System.out.print("도서번호 : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		// Book 객체 생성 후 List 추가
		if( bookList.add(new Book(name, author, price, editor, number)) ) {
			return "성공";
				
		}else {
			return "실패";
		}
	}
	
	public void SelectAll() {
		// 등록된 도서 모두 출력
		System.out.println("====== 도서 전체 조회 ======");
		if(bookList.isEmpty()) {
			System.out.println("도서 정보가 없습니다.");
			
			return;
		}
		
		int index = 0;
		
		for( Book bok : bookList) {
			System.out.print((index++) + "번 : ");
			System.out.println(bok);
	    }
		
	}
	
	public String updateBook() throws InputMismatchException {
		
		System.out.println("===== 인덱스 번호 입력: ");
		int index = sc.nextInt();
		sc.nextLine();
		
		if( bookList.isEmpty()) {
			return " 입력된 도서 정보가 없습니다.";
		}else if( index < 0) {
			return "음수는 입력할 수 없습니다.";
			
		}else {
			System.out.println(index + "번째 인덱스에 저장된 도서 정보");
			System.out.println(bookList.get(index));
			
			System.out.print("제목 : ");
			String name = sc.next();
			
			System.out.print("저자 : ");
			String author = sc.next();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			System.out.print("출판사 : ");
			String editor = sc.next();
			
			System.out.print("도서 등록 번호 : ");
			int number = sc.nextInt();
			
			Book temp = bookList.set(index, new Book(name, author, price, editor, number));
			
			return temp.getName() + "의 정보가 변경되었습니다.";
		}
		
		
		
	}
	
	public String removeBook() throws InputMismatchException {
		
		System.out.println("===== 도서 정보 제거====");
		
		System.out.print("인덱스 번호 입력 : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		if(bookList.isEmpty()) {
			return "입력된 도서 정보가 없습니다.";
		}else if( index < 0) {
			return "음수는 입력할 수 없습니다.";
		}else if (index >= bookList.size()) {
			return "범위를 넘어선 값을 입력할 수 없습니다.";
		}else {
			
			System.out.print("정말 삭제하시겠습니까? (Y / N) : ");
			char ch = sc.next().toUpperCase().charAt(0);
			
			if(ch == 'Y') {
				Book temp = bookList.remove(index);
				return temp.getName() + "의 정보가 제거되었습니다.";
			}else {
				return "취소";
			}
			
		}
		
	}
	
	public void searchName() {
		System.out.println("=====도서 검색(제목)=====");
		
		System.out.print("검색할 도서 검색 : ");
		String input = sc.next();
		
		boolean flag = true;
		
		for( Book bok : bookList) {
			if(input.equals( bok.getName())) {
				System.out.println(bok);
				flag = false;
			}
		}
		
		if (flag) {
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
	public void searchAuthor() {
		System.out.println("=====도서 검색(제목)=====");
		
		System.out.print("검색할 저자 검색 : ");
		String input = sc.next();
		
		boolean flag = true;
		
		for( Book bok : bookList) {
			if(input.equals( bok.getAuthor())) {
				System.out.println(bok);
				flag = false;
			}
		}
		
		if (flag) {
			System.out.println("검색 결과가 없습니다.");
		}
	}

}
