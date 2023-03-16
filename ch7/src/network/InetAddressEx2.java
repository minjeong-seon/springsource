package network;

import java.net.InetAddress;

import java.util.Arrays;
public class InetAddressEx2 {
	public static void main(String[] args) {
		// InetAddress 클래스 : IP주소를 다루기 위한 클래스
		InetAddress ip = null;
		
		try {
			ip=InetAddress.getLocalHost();
			
			//getHostName() : ip를 통해서 호스트명을 얻게 됨
			System.out.println("getHostName() : "+ip.getHostName());
			//getHostAddress() : ip주소
			System.out.println("getHostAddress() : "+ip.getHostAddress());
			
		} catch (Exception e) {
			
		}

	}}
