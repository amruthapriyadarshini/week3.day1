package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("Inside desktop size method");
	}
	public static void main(String[] args) {
		Desktop deskTop = new Desktop();
		deskTop.computerModel();
		deskTop.desktopSize();
		
	}

}
