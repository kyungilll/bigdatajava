package java08;

import java.util.Scanner;
import java.util.Stack;

public class Ex2 {

	public static void main(String[] args) {
		int members = 3; //변경가능
		int years = 6;
		String[] member = new String[members]; 
		int[] year = new int[members];
		String[] grade = new String[members];
		char[] gradename = {'a','b','c','d','f'};
		System.out.println("동아리 명단의 이번학기 성적입니다.");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < member.length; i++) {
			System.out.print("이름을 입력하세요. > ");
			member[i] = sc.next();
			System.out.print("학년을 입력하세요. > ");
			year[i] = sc.nextInt();
			System.out.print("성적을 입력하세요. > ");
			grade[i] =sc.next();
		} // 이름, 학년, 성적 입력받음
		System.out.println("이름     학년     학점");
		System.out.println("------------------");
		for (int i = 0; i < grade.length; i++) {
			System.out.println(member[i] + "        " + year[i] + "        "+ grade[i]);
		} //입력받은 내용 출력
		
		System.out.print("1. 전체인원은? > " + member.length + "명");
		System.out.println("2. 전체 명단 프린트? > 위 내용 참조");
		
		int[] county = new int[years];
		int[] countg = new int[gradename.length];
		
		for (int i = 0; i < grade.length; i++) {
				county[i] = county[i]+1;
				countg[i] = countg[i]+1;
			}
			
		
		System.out.println("3. 학년별 인원수, 학점 별 인원수!");
		for (int j = 0; j < county.length; j++) {
			System.out.println(j+1 + "학년은 " + county[j] + "명");
		}
		
		for (int i = 0; i < countg.length; i++) {
			System.out.println(gradename[i] + "학점은 " + county[i] + "명");
		}
		
		System.out.println("이름을 입력받아 몇번 째 인덱스에 있는지 찾아보세요");
		System.out.print("이름 입력 > ");
		String findname = sc.next();
		for (int j = 0; j < countg.length; j++) {
			if (findname.equals(member[j])){
			System.out.println(findname + "씨는 " + (j+1) + "번 째 입력되어 있고 " + year[j] + "학년이며 " + grade[j] + "학점입니다.");			
		}
		}
		}
	}

