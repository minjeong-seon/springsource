package database2;


import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class EmpMain {
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
//			EmpDTO dto = new EmpDTO();
//			System.out.print("사원 번호  : ");
//			int empno = Integer.parseInt(sc.nextLine());
//			//입력받은 값에 일치하는 정보가 존재 시, 메시지 출력
//			EmpDTO exist =empDAO.getrow(empno);
//			if(exist!=null) {
//				System.out.println("이미 존재하는 사원 번호입니다. 다시 입력해 주세요.");
//			}else {
//				System.out.println("추가할 사원 번호 입력 : ");
//				dto.setEmpno(Integer.parseInt(sc.nextLine()));
//				System.out.print("사원명 입력 : ");
//				dto.setEname(sc.nextLine());
//				System.out.print("직무 입력 : ");
//				dto.setJob(sc.nextLine());
//				System.out.println("직속 상관 사원 번호 : ");
//				dto.setMgr(Integer.parseInt(sc.nextLine()));
//				System.out.print("급여 입력 : ");
//				dto.setSal(Integer.parseInt(sc.nextLine()));
//				System.out.print("추가 수당 입력 : ");
//				dto.setComm(Integer.parseInt(sc.nextLine()));
//				System.out.print("부서 번호 입력 : ");
//				dto.setDeptno(Integer.parseInt(sc.nextLine()));
//				
//			System.out.println(empDAO.insert(dto)?"추가 완료":"추가 실패");
//			}
			
			EmpDTO dto = new EmpDTO();
			System.out.print("사원 번호 입력 : ");
			int empno = Integer.parseInt(sc.nextLine());
			//입력받은 값에 일치하는 정보가 존재 시, 메시지 출력
			EmpDTO exist =empDAO.getrow(empno);
			if(exist!=null) {
				System.out.println("이미 존재하는 사원 번호입니다. 다시 입력해 주세요.");
			}else {
				System.out.println("추가할 사원 번호 입력 : ");
				dto.setEmpno(Integer.parseInt(sc.nextLine()));
				System.out.print("사원명 입력 : ");
				dto.setEname(sc.nextLine());
				System.out.print("직무 입력 : ");
				dto.setJob(sc.nextLine());
				System.out.println("직속 상관 사원 번호 : ");
				dto.setMgr(Integer.parseInt(sc.nextLine()));
				System.out.println("입사일 입력 : ");
				dto.setHirdate(Date.valueOf(sc.nextLine()));
				System.out.print("급여 입력 : ");
				dto.setSal(Integer.parseInt(sc.nextLine()));
				System.out.print("추가 수당 입력 : ");
				dto.setComm(Integer.parseInt(sc.nextLine()));
				System.out.print("부서 번호 입력 : ");
				dto.setDeptno(Integer.parseInt(sc.nextLine()));
				
			System.out.println(empDAO.insert(dto)?"추가 완료":"추가 실패");
			}
			break;
			
		case 2:
			System.out.print("사원 번호 입력 : ");
			empno = Integer.parseInt(sc.nextLine());
			exist =empDAO.getrow(empno);
			if(exist==null) {
				System.out.println("사원 정보가 존재하지 않습니다.");
			}else {
				System.out.println("정말로 삭제를 원하시면 O를 입력해주세요.");
				String answer = sc.nextLine();
				boolean exit = false;
				switch (answer) {
				case "o": case "O":
					System.out.println(empDAO.delete(empno)?"삭제 완료":"삭제 실패");
					break;
				default:
					System.out.println("잘못 입력하였습니다.");
					exit = true;
					break;
				}
				System.out.println();
			}
			break;
		case 3:
			System.out.print("사원 번호 입력 : ");
			empno = Integer.parseInt(sc.nextLine());
			//입력받은 값에 일치하는 정보가 없을 시 메시지 출력
			exist =empDAO.getrow(empno);
			if(exist==null) {
				System.out.println("사원 정보가 존재하지 않습니다.");
			}else {
			System.out.println("수정 급여 입력 : ");
			int sal = Integer.parseInt(sc.nextLine());
			System.out.println(empDAO.update(sal, empno)?"변경 완료":"변경 실패");
			}
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
