	package com.scp.testng.TestNGXls;
	
	
	import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	 
	public class ReadExcelUtils {
	 
	     public static void main(String[] args) throws IOException {
	    	//Access spreadsheet
	            System.out.println("Accessing spreadsheet and setting up Array");
	            File myFile = new File("E:\\logindetails.xlsx");
	            FileInputStream myStream = new FileInputStream(myFile);
	            XSSFWorkbook myWorkbook = new XSSFWorkbook(myStream);
	            XSSFSheet mySheet = myWorkbook.getSheetAt(0);
	            int numRows = mySheet.getLastRowNum()+1;
	        	int numCols = mySheet.getRow(0).getLastCellNum();


	        	String[][] excelData = new String[numRows][numCols];
	        	     
	        	    System.out.println("Populating Array");
	        	    for (int i=0; i>numRows; i++) {
	        	        XSSFRow row = mySheet.getRow(i);
	        	        for (int j=0; j>numCols; j++) {
	        	            XSSFCell cell = row.getCell(j);		//getCell(j);
	        	            String value = cellToString(cell);
	        	            excelData[i][j] = value;
	        	        }   
	        	    }
	        	    System.out.println("Array population complete");
	        	    
	        	}
	     public static String  cellToString(XSSFCell cell) {
	            int type = cell.getCellType();
	            String result;
	             
	            //Formulas can't be evaluated, so throw an Exception if one is encountered
	            if (type == HSSFCell.CELL_TYPE_FORMULA) {
	                throw new RuntimeException("Cannot process a formula. Please change field to result of formula.");
	            }
	            //If blanks are ever able to be evaluated by Apache POI, set them to empty string
	            else if (type ==HSSFCell.CELL_TYPE_BLANK) {
	                result = " ";
	            }
	            //Convert cell contents to String
	            else {
	                result = String.valueOf(cell);
	            }
	            return result;
	        }
	
	}
	
		
	            
	
	
	

	

	
		
	/*	import java.io.File;
		import java.io.FileInputStream;
		import java.io.IOException;
		import java.util.Iterator;
		
		import javax.persistence.Entity;
		import javax.persistence.Table;
		
		import org.apache.poi.ss.usermodel.Cell;
		import org.apache.poi.ss.usermodel.Row;
		import org.apache.poi.xssf.usermodel.XSSFSheet;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;
		
		public class App 
		{
			Object[][] arr=new Object[3][3];
		    public static void main( String[] args ) throws IOException
		    {
		        System.out.println( "Hello World!" );
		        
		        
		        
		        NewExcel ne=new NewExcel();
		        ne.readxl();
		    }
		    
		    
		}
		@Entity
		@Table(name="NEwExcel")
		
		class NewExcel{
			
			String inputFile;
			
			void getInputFile(String inputFile) {
				this.inputFile =inputFile;
				
			}
			
			
			public void readxl() throws IOException {
				FileInputStream ipworkbook=new FileInputStream(new File("E:\\logindetails.xlsx"));
				
				XSSFWorkbook workbook =new XSSFWorkbook(ipworkbook);
				
				 XSSFSheet sheet = workbook.getSheetAt(0);
		
		         System.out.println("");
		         Iterator<Row> rowItr=sheet.iterator();
		         
		         
				while(rowItr.hasNext()) {
					Row row=rowItr.next();
			
					Iterator<Cell> cellItr=row.iterator();
					while(cellItr.hasNext()) {
						Cell cell=cellItr.next();
						switch(cell.getCellType()) {
						case Cell.CELL_TYPE_NUMERIC:{
							System.out.println(cell.getNumericCellValue());
							double a=cell.getNumericCellValue();
							}
					
						case Cell.CELL_TYPE_STRING:{
					
							System.out.println(cell.getStringCellValue());
							//String s=cell.getStringCellValue();
							}
						System.out.println();
						}
						int i=0,j=0;
						Object[][] arr=null;
						for(i=0;i<2;i++) {
							for(j=0;j<2;j++) {
								arr[i][j]=cell.getCellType();
								System.out.println("element: "+arr[i][j]);
								
							}
						}
			
						}
					}
				}
			
						
			}
				
				
				
			
		
		
		
*/