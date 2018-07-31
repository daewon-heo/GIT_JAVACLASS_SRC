package com.class_14_Collections.com.kh.member.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.class_14_Collections.com.kh.member.model.vo.Member;

public class MemberManager {
	// 화면과 객체를 연결하는 클래스

	// 회원 목록을 관리할 객체 배열
//	private Member[] mArr;
	private ArrayList<Member> mlist;

	// 회원 배열을 최대로 담을 수 있는 공간 선언
	public static final int SIZE = 10;

	// 현재 값이 담겨 있는 회원 수
	private static int count;

	Scanner sc = new Scanner(System.in);

	{
		// 초기화 블럭
//		mArr = new Member[SIZE];
//		mArr[0] = new Member("홍길동", "hong123", "pass01", "test@test.com", "010-1111-1111", 'M', 30);
//		mArr[1] = new Member("홍2동", "HONG2", "pass02", "test2@test2.com", "010-2222-2222", 'F', 20);
//		mArr[2] = new Member("홍3동", "HO3", "pass03", "test3@test3.com", "010-3333-3333", 'F', 25);
//		mArr[3] = new Member("홍4동", "NG444", "pass04", "test4@test4.com", "010-4444-4444", 'M', 34);
		mlist = new ArrayList<>();
		mlist.add(new Member("홍길동", "hong123", "pass01", "test@test.com", "010-1111-1111", 'M', 30));
		mlist.add(new Member("홍2동", "HONG2", "pass02", "test2@test2.com", "010-2222-2222", 'F', 20));
		mlist.add(new Member("홍3동", "HO3", "pass03", "test3@test3.com", "010-3333-3333", 'F', 25));
		mlist.add(new Member("홍4동", "NG444", "pass04", "test4@test4.com", "010-4444-4444", 'M', 34));
		// 초기화한 회원 수에 따른 카운트 변경
//		count = 4;
		count = mlist.size();
	}

	// 생성자
	public MemberManager() {
	}

	// Settesr & Getter
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		MemberManager.count = count;
	}

	public void printAllMember() {
		for (int i = 0; i < count; i++) {
//			System.out.println("[" + (i + 1) + "]" + mArr[i].memberInfo());
			System.out.println("[" + (i + 1) + "]" + mlist.get(i).memberInfo());
		}
	}

	// 회원 가입 기능 메소드
	public void insertMember() {

		if (count == SIZE) {
			System.out.println("정원 초과입니다.");
		} else {
			Member member = new Member();

			System.out.print("이름 입력 : ");
			member.setName(sc.next());

			System.out.print("아이디 입력 : ");
			member.setId(sc.next());

			System.out.print("비밀번호 입력 : ");
			member.setPassword(sc.next());

			System.out.print("이메일 입력 : ");
			member.setEmail(sc.next());

			System.out.print("전화번호 입력 : ");
			member.setPhone(sc.next());

			System.out.print("성별 입력(M/F) : ");
			member.setGender(sc.next().charAt(0));

			System.out.print("나이 입력 : ");
			member.setAge(sc.nextInt());

			mlist.add(member);
			count++;
		}
	}
	
	// 회원 한명의 아이디를 사용하여
	// 해당 회원의 인덱스를 반환하는 메소드
	public int selectMember(){
		int idx = -1; // 에러 발생 코드
		
		System.out.print("선택할 회원의 아이디 : ");
		String id = sc.next();
		
		for (int i = 0; i < count; i++) {
			if(mlist.get(i).getId().equals(id)){
				idx = i;
			}
		}
		return idx;
	}
	
	// 회원 정보 수정 기능 메소드
	public void updateMemberPassword(){
		int idx = selectMember();
		
		if(idx < 0){
			System.out.println("해당 아이디를 가진 회원이 없습니다.");
		}else{
			System.out.println("현재 회원의 비밀번호 : ");
			System.out.println(mlist.get(idx).getPassword());
			System.out.print("변경할 비밀번호 : ");
			mlist.get(idx).setPassword(sc.next());
		}
	}
	
	// 이메일 업데이트
	public void updateMemberEmail(){
		int idx = selectMember();
		
		if(idx < 0){
			System.out.println("해당 아이디를 가진 회원이 없습니다.");
		}else{
			System.out.println("현재 회원의 이메일 : ");
			System.out.println(mlist.get(idx).getEmail());
			System.out.print("변경할 이메일 : ");
			mlist.get(idx).setEmail(sc.next());
		}
	}
	
	// 연락처 업데이트
	public void updateMemberPhone(){
		int idx = selectMember();
		
		if(idx < 0){
			System.out.println("해당 아이디를 가진 회원이 없습니다.");
		}else{
			System.out.println("현재 회원의 연락처 : ");
			System.out.println(mlist.get(idx).getPhone());
			System.out.print("변경할 연락처 : ");
			mlist.get(idx).setPhone(sc.next());
		}
	}
	
	// 회원 한 명 정보 조회
	public void printOneMember(){
		int idx = selectMember();
		if(idx < 0 ){
			System.out.println("해당하는 회원은 없습니다.");
		}else{
			System.out.println(mlist.get(idx).memberInfo());
		}
	}
	
	// 회원 정보 삭제 기능 메소드
	public void deleteMember(){
		int idx = selectMember();
		
		if(idx < 0){
			System.out.println("해당하는 회원은 없는 회원입니다.");
		}else{
			System.out.print("정말로 삭제하시겠습니까? (Y/N) : ");
			char answer = sc.next().toUpperCase().charAt(0);
			
			if(answer == 'Y'){
				mlist.remove(idx);
				count--;
			}else{
				System.out.println("메뉴 화면으로 돌아갑니다.");
			}
		}
	}
	
	public void sortAscName(){
		// 이름을 기준으로 오름차순 정렬하는 메소드
		
		mlist.sort(new AscNameSort());
		
	}
	
	public void sortDescName(){
		// 이름을 기준으로 내림차순 정렬하는 메소드
		mlist.sort(new DescNameSort());
	}
	
	public void sort(String str){
		
	}
	
}
