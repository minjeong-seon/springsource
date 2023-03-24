package database2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpMain {
	private static final int sal = 0;

	public static void main(String[] args) {
		EmpDAO empDAO = new EmpDAO();
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.println("=================================");
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 삭제");
			System.out.println("3. 사원 수정");
			System.out.println("4. 사원 조회(사번)");
			System.out.println("5. 사원 조회(이름)");
			System.out.println("6. 종료");
			System.out.println("=================================");
		//메뉴번호 입력받기
		System.out.print("메뉴 선택 : ");
		int no = Integer.parseInt(sc.nextLine());
		//switch 작성
		switch (no) {
		case 1:
			System.out.println();
			
			break;
		case 2:
			
			break;
		case 3:
			System.out.print("사원 번호 입력 : ");
			int empno = Integer.parseInt(sc.nextLine());
			
			System.out.println("수정 급여 입력 : ");
			int sal = Integer.parseInt(sc.nextLine());
			System.out.println(empDAO.update(sal, empno)?"변경 완료":"변경 실패");
			
			break;
			
		case 4:
			System.out.print("사원 번호 입력 : ");
			empno =  Integer.parseInt(sc.nextLine());
			//EmpDTO 가 null 상태일 수 있음
			EmpDTO row =empDAO.getrow(empno);
			//입력한 empno가 EmpDTO에 존재하면 출력, 존재하지 않으면(=null) 메시지 출력
			if(row!=null) {
			System.out.println("\n*** 사원 정보 ***");
			System.out.println("사원 번호: "+row.getEmpno());
			System.out.println("사원명: "+row.getEname());
			System.out.println("직무: "+row.getJob());
			System.out.println("급여: "+row.getSal());
			System.out.println("추가 수당: "+row.getComm());
			System.out.println("부서 번호: "+row.getDeptno());
			}else {
				System.out.println("사원 정보가 존재하지 않습니다.");
			}
			break;
		case 5:
			System.out.print("사원명 입력 : ");
			String ename = sc.nextLine();
			ArrayList<EmpDTO> list =empDAO.getList(ename);
			System.out.println();
			//입력한 ename 이 > list에 없는 경우, 메시지 출력
			//if(list.size=0){출력문}도 가능.(size가 0이면 list에 담긴 내용이 없는 상태)
			if(list.isEmpty()) {
				System.out.println("사원 정보가 존재하지 않습니다.");
				}else {
					System.out.println("사번  |  사원명  |   직무   |   입사일");
					System.out.println("---------------------------------------");
						for (EmpDTO empDTO : list) {
							System.out.print(empDTO.getEmpno()+"\t");
							System.out.print(empDTO.getEname()+"\t"); 
							System.out.print(empDTO.getJob()+"\t");
							System.out.print(empDTO.getHirdate()+"\n");
						}
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
