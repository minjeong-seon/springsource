package database2;

import java.util.ArrayList;
import java.util.Scanner;

public class DeptMain {
	public static void main(String[] args) {
		DeptDao dao = new DeptDao();
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		
		while (flag) {
			System.out.println("==========================");
			System.out.println("1. 특정부서 조회");
			System.out.println("2. 전체부서 조회");
			System.out.println("6. 종료");
			System.out.println("==========================");
			
			System.out.println("선택: ");
			int no = sc.nextInt();
			
			switch (no) {
			case 1:
				//사용자로부터 조회를 원하는 부서번호 입력받기
				System.out.print("부서번호 : ");
				int deptno = sc.nextInt();
				//입력받은 부서 1개 조회하기
				DeptDto row = dao.getRow(deptno);
				//DeptDto 출력
				System.out.println(row);
				break;
			case 2:
				//전체 select하는 메소드 호출
				ArrayList<DeptDto> list = dao.getRows();
				for (DeptDto deptDto : list) {
					System.out.print(deptDto.getDeptno()+"\t");
					System.out.print(deptDto.getDname()+"\t");
					System.out.print(deptDto.getLoc()+"\n");
				}
				break;
			case 6:
				flag = false;
				break;
			default:
				System.out.println("번호를 다시 입력해 주세요.");
				break;
			}
		}

	}
}
