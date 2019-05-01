package 스태틱;

import java.util.Scanner;

public class DayLife {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부",10,"강남");
		System.out.println(Day.count + "일차");
		Day day2 = new Day("여행",15,"강원도");
		System.out.println(Day.count + "일차");
		Day day3 = new Day("운동",11,"피트니스");
		System.out.println(Day.count + "일차");
		
		System.out.println();
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
		System.out.println();
		
		System.out.print("전체 하는일의 시간은? : ");
		System.out.println(Day.sumtime + "시간");
		System.out.print("평균 하는 일의 시간은? : ");
		System.out.println((Day.sumtime/Day.count)+"시간" );
		System.out.println("매일 무엇을 얼마나 어디에서 했는지 프린트");
		System.out.println("	"+day1);
		System.out.println("	"+day2);
		System.out.println("	"+day3);
		
		System.out.print("며칠 간 했는지? : ");
		System.out.println(Day.count +"일 동안");
		System.out.println(Day.getTotal());
	}	
}
