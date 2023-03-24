package mayday;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSelect {
	public static void main(String[] args) {
		Dao dao = new Dao();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while (flag) {
			System.out.println("========================");
			System.out.println("1. 특정 부서 조회");
			System.out.println("2. 전체 부서 조회");
			System.out.println("6. 종료");
			System.out.println("========================");
			
			System.out.print("메뉴 선택 >> ");
			int no = sc.nextInt();
			switch (no) {
			case 1:
				System.out.print("부서 번호 >> ");
				int deptno = sc.nextInt();
				Dto row = dao.getRow(deptno);
				System.out.println(row);
				break;
			case 2:
				ArrayList<Dto> list = dao.getRows();
				for (Dto dto : list) {
					System.out.print(dto.getDeptno()+"\t");
					System.out.print(dto.getDname()+"\t");
					System.out.print(dto.getLoc()+"\n");
				}
				break;
			case 6:
				flag=false;
				break;
			default:
				System.out.println("번호를 확인해 주세요.");
				break;
			}
		}

	}

}
