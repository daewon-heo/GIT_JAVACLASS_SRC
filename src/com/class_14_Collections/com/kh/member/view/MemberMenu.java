package com.class_14_Collections.com.kh.member.view;

import java.util.Scanner;

import com.class_14_Collections.com.kh.member.controller.MemberManager;
import com.class_14_Collections.com.kh.member.model.vo.Member;

public class MemberMenu {

//	private Member m;
	
	// 회원 정보 관리를 위한 화면 메소드
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		MemberManager mm = new MemberManager();
		
		do {
			System.out.println("== 000's 회원관리 프로그램 ");
			System.out.println("총 가입 가능 회원 수 : " + mm.SIZE);
			System.out.println("현재 가입한 회원 수 : " + mm.getCount());
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 회원 정보 수정");
			System.out.println("3. 회원 정보 삭제");
			System.out.println("4. 전체 회원 조회");
			System.out.println("5. 회원 한 명 정보 조회");
			System.out.println("6. 회원 이름 별 오름 차순 정렬");
			System.out.println("7. 회원 이름 별 내림 차순 정렬");
			System.out.println("9. 프로그램 종료");
			System.out.println("----------------------");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				mm.insertMember();
				break;
			case 2:
				modifyMenu(mm);
				break;
			case 3:
				mm.deleteMember();
				break;
			case 4:
				mm.printAllMember();
				break;
			case 5:
				mm.printOneMember();
				break;
			case 6:
				mm.sortAscName();
				break;
			case 7:
				mm.sortDescName();
				break;
			case 9:
				System.out.print("정말로 종료하시겠습니까?(Y/N) : ");
				if (sc.next().toUpperCase().charAt(0) == 'Y') {
					System.out.println("프로그램을 종료합니다.");
					return;
				} else {
					System.out.println("다시 메뉴를 불러옵니다.");
					break;
				}
			default:
				System.out.println("잘못된 입력입니다.");
			}
		} while (true);
	}
	
	public static void modifyMenu(MemberManager mm){
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("수정 메뉴 입니다.");
			System.out.println("1. 비밀번호 변경");
			System.out.println("2. 이메일 변경");
			System.out.println("3. 연락처 변경");
			System.out.println("4. 이전 메뉴로...");
			System.out.println("-----------------");
			System.out.print("메뉴 선택 : ");
			
			int sel = sc.nextInt();
			
			switch (sel) {
			case 1:
				mm.updateMemberPassword();
				break;
			case 2:
				mm.updateMemberEmail();
				break;
			case 3:
				mm.updateMemberPhone();
				break;
			case 4:
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력 하셨습니다.");
				break;
			}
		}while(true);
	}
	
	// 수정 전용 메소드
	public static Member memberInsert(Member m){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("회원 이름 입력 : ");
		String name = sc.next();
		
		System.out.print("회원 아이디 입력 : ");
		String id = sc.next();
		
		System.out.print("회원 비밀번호 입력 : ");
		String password = sc.next();
		
		System.out.print("회원 이메일 입력 : ");
		String email = sc.next();
		
		System.out.print("회원 연락처 입력 : ");
		String phone = sc.next();
		
		System.out.print("회원 성별 입력(M/F) : ");
		char gender = sc.next().toUpperCase().charAt(0);
		
		System.out.print("회원 나이 입력 : ");
		int age = sc.nextInt();
		
		m = new Member(name, id, password, email, phone, gender, age);
		
		return m;
	}

	// 수정 전용 메소드
	public static Member memberUpdate(Member m){
		Scanner sc = new Scanner(System.in);
		
		if(m == null){
			System.out.println("현재 등록된 회원이 없습니다.");
		}else{
			System.out.print("수정할 이름 : ");
			m.setName(sc.next());
		}
		
		return m;
	}

	// 삭제 전용 메소드
	public static Member memberDelete(Member m){
		if(m == null){
			System.out.println("아직 삭제할 회원 정보가 없습니다.");
		} else {
			System.out.println("회원 정보가 삭제되니다.");
			m = null;
		}
		
		return m;
	}
}
