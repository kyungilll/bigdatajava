package test;

import javax.swing.JOptionPane;

public class CarInfoInsert {
public static void main(String[] args) {
	
	String id = JOptionPane.showInputDialog("ID입력");
	String brand = JOptionPane.showInputDialog("BRAND입력");
	String type  = JOptionPane.showInputDialog("차종입력");
	String price  = JOptionPane.showInputDialog("가격입력");
	String distance  = JOptionPane.showInputDialog("키로수입력");
	String year  = JOptionPane.showInputDialog("연식입력");
	String location  = JOptionPane.showInputDialog("지역입력");
	String color  = JOptionPane.showInputDialog("색상입력");
	String fuel  = JOptionPane.showInputDialog("연료타입입력");
	String transmission  = JOptionPane.showInputDialog("변속기타입입력");
	String opt  = JOptionPane.showInputDialog("옵션등급입력");
	String guarantee = JOptionPane.showInputDialog("보증여부입력");
	
	CarInfoDAO db = new CarInfoDAO();
	CarInfoDTO dto = new CarInfoDTO();
	
	dto.setId(id);
	dto.setBrand(brand);
	dto.setType(type);
	dto.setPrice(price);
	dto.setDistance(distance);
	dto.setYear(year);
	dto.setLocation(location);
	dto.setColor(color);
	dto.setFuel(fuel);
	dto.setTransmission(transmission);
	dto.setOpt(opt);
	dto.setGuarantee(guarantee);
	
	try {
		db.insert(dto);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
