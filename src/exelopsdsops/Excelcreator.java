package exelopsdsops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcreator {

	public static void main(String args[]) throws IOException{

		String x = "bonmots@outlook.com,seano@optonline.net,aardo@optonline.net,kassiesa@aol.com,mmccool@gmail.com,mleary@att.net,jesse@comcast.net,benits@optonline.net,jbearp@optonline.net,slanglois@live.com,gomor@me.com,pgolle@me.com,jbarta@sbcglobal.net,solomon@att.net,lcheng@aol.com,panolex@gmail.com,chrisj@me.com,wenzlaff@mac.com,lukka@icloud.com,djpig@mac.com,maradine@att.net,keutzer@me.com,oechslin@me.com,koudas@live.com,dwsauder@me.com,uraeus@aol.com,nasor@sbcglobal.net,dwheeler@yahoo.ca,ccohen@msn.com,violinhi@gmail.com,godeke@yahoo.ca,jbearp@outlook.com,ylchang@yahoo.com,cgarcia@yahoo.ca,marcs@mac.com,brickbat@mac.com,nelson@optonline.net,frikazoyd@yahoo.com,fatelk@live.com,themer@aol.com,zeller@yahoo.com,yfreund@comcast.net,vmalik@hotmail.com,frode@att.net,emcleod@msn.com,arebenti@hotmail.com,techie@comcast.net,biglou@comcast.net,ylchang@optonline.net,martyloo@icloud.com,matthijs@mac.com,dkrishna@verizon.net,kenja@verizon.net,monopole@me.com,blixem@verizon.net,vlefevre@mac.com,fbriere@optonline.net,eminence@optonline.net,madanm@msn.com,gospodin@yahoo.com,lushe@me.com,dialworld@aol.com,glenz@verizon.net,rsteiner@me.com,nweaver@outlook.com,amaranth@yahoo.ca,loscar@yahoo.ca,staikos@msn.com,uraeus@yahoo.ca,eidac@verizon.net,mchugh@comcast.net,dkeeler@hotmail.com,andrei@live.com,tkrotchko@msn.com,thaljef@aol.com,bwcarty@sbcglobal.net,hstiles@sbcglobal.net,teverett@att.net,webteam@msn.com,lydia@yahoo.ca,thomasj@sbcglobal.net,parrt@msn.com,rsmartin@yahoo.com,dbrobins@mac.com,ahmad@hotmail.com,epeeist@gmail.com,wildfire@optonline.net,smpeters@live.com,maradine@yahoo.ca,johnbob@aol.com,nweaver@yahoo.ca,leviathan@att.net,stern@outlook.com,richard@comcast.net,nimaclea@comcast.net,louise@mac.com,pemungkah@mac.com,andrei@att.net,yenya@sbcglobal.net,treit@yahoo.ca";
		String[] email = x.split(",");
		String y = "Gary Summers,Alena Delgado,Ramon Porter,Marlon Brady,Marcos Strickland,Ross Newton,Tiffany Keller,Janis Diaz,Allen Morris,Dora Mcgee,David Burgess,Natasha Nunez,Kyle Hunter,Ronnie Welch,Shelley	Wade,Raquel Mullins,Kristina Romero,Doug Larson,Tanya Sutton,Clifford Boone";
		String[] name = y.split(",");
		String z = "11,22,33,44,55,66,77,88,99,666,12,23,34,45,56,67,78,76,79,90";
		String[] bisk = z.split(",");
		int count;
		int[] id = new int[20];
		for(count = 0; count<bisk.length; count++) {
			id[count] = Integer.parseInt(bisk[count]); 
		}
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("mysheet");

		for (int i = 0; i < 20; i++) {
			XSSFRow row = sheet.createRow(i);
			XSSFCell cell = row.createCell(0);
			XSSFCell cell1 = row.createCell(1);
			XSSFCell cell2 = row.createCell(2);
			cell.setCellValue(name[i]);
			cell1.setCellValue(id[i]);
			cell2.setCellValue(email[i]);
		}
		sheet.autoSizeColumn(0);
		sheet.autoSizeColumn(1);
		sheet.autoSizeColumn(2);
		wb.write(new FileOutputStream("exl.xlsx"));
		wb.close();
		
		TreeSet sett = new TreeSet();
		XSSFWorkbook wb1 = new XSSFWorkbook(new FileInputStream("exl.xlsx"));
		XSSFSheet sheet1 = wb1.getSheetAt(0);
		for (int i = 0; i < 20; i++) {
			XSSFRow row1 = sheet1.getRow(i);
			//System.out.println(row1);
			String s = row1.getCell(0).getStringCellValue();
			double p = row1.getCell(1).getNumericCellValue();
			String q = row1.getCell(2).getStringCellValue();
			
			Employee e = new Employee();
			e.setName(s);
			e.setId(p);
			e.setDesc(q);
			
			sett.add(e);
			
		}
		System.out.println(sett);
		
		TreeSet<Employee> settu = new TreeSet<Employee>(new Comp());
		XSSFWorkbook wb2 = new XSSFWorkbook(new FileInputStream("exl.xlsx"));
		XSSFSheet sheet2 = wb1.getSheetAt(0);
		for (int i = 0; i < 20; i++) {
			XSSFRow row1 = sheet2.getRow(i);
			//System.out.println(row1);
			String s = row1.getCell(0).getStringCellValue();
			double p = row1.getCell(1).getNumericCellValue();
			String q = row1.getCell(2).getStringCellValue();
			
			Employee e = new Employee();
			e.setName(s);
			e.setId(p);
			e.setDesc(q);
			
			settu.add(e);
			
		}
		System.out.println("***************************************");
		System.out.println(settu);
	}
}
