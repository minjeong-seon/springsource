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
			System.out.println("3. 새 부서 추가");
			System.out.println("4. 부서 정보 수정");
			System.out.println("5. 부서 정보 삭제");
			System.out.println("6. 종료");
			System.out.println("==========================");
			
			System.out.println("선택: ");
			int no = Integer.parseInt(sc.nextLine());
			
			switch (no) {
			case 1:
				//사용자로부터 조회를 원하는 부서번호 입력받기
				System.out.print("부서번호 : ");
				int deptno = Integer.parseInt(sc.nextLine());
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
				
			case 3:		//새 부서 추가 (insert 기능)
				// 1)
//				System.out.print("부서번호 : ");
//				deptno = Integer.parseInt(sc.nextLine());
//				System.out.print("부서명 : ");
//			    String dname = sc.nextLine();
//			    System.out.print("지역 : ");
//			    String loc = sc.nextLine();
//			    
//			    System.out.println(dao.insert(deptno, dname, loc)?"삽입 성공":"삽입실패");
				
				// 2)
				DeptDto dto = new DeptDto();
				System.out.print("부서번호 : ");
				dto.setDeptno(Integer.parseInt(sc.nextLine()));
				System.out.print("부서명 : ");
			   dto.setDname(sc.nextLine());
			    System.out.print("지역 : ");
			    dto.setLoc(sc.nextLine());
			    
			    System.out.println(dao.insert(dto)?"삽입 완료":"삽입 실패");
				break;
				
			case 4:		//부서 정보 수정(update 기능)
				System.out.println("부서 번호 : ");
				deptno = (Integer.parseInt(sc.nextLine()));
				
				System.out.println("1) 부서명 수정 2) 위치 수정");
				int updateNo = Integer.parseInt(sc.nextLine());
			
				String input = null;
				if (updateNo==1) {		// 1. 선택 시 : 부서명 수정
					System.out.println("새 부서명 입력 : ");
					input = sc.nextLine();
				}
				else if (updateNo==2) {		// 2. 선택 시 : 부서 위치 수정
					System.out.println("부서 위치 입력 : ");
					input = sc.nextLine();
				}else {System.out.println("번호를 다시 확인해 주세요.");}
				System.out.println(dao.update(input, deptno, updateNo)?"수정 완료":"수정 실패");
				break;
				
			case 5:		//부서 정보 삭제(delete)
				System.out.println("삭제할 부서 번호 입력 : ");
				deptno = (Integer.parseInt(sc.nextLine()));
				
				System.out.println(dao.remove(deptno)?"삭제 완료" : "삭제 실패");
				break;
				
			case 6:		//부서 정보 삭제(delete 기능)
				flag = false;
				break;
			default:
				System.out.println("번호를 다시 입력해 주세요.");
				break;
			}
		}

	}
}
