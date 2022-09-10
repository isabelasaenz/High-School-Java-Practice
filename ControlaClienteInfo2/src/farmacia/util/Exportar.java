package farmacia.util;
    
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import farmacia.bean.Produto;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
/*import org.apache.poi.xssf.usermodel.XSSFWorkbook;*/

public class Exportar {
    public static void writeListaProdutoToFile(String ListaProdutos, List<Produto> produtoList) throws Exception{
		Workbook workbook = null;
		
		/*if(ListaProdutos.endsWith("xlsx")){
			workbook = new XSSFWorkbook();
		}else*/if(ListaProdutos.endsWith("xls")){
			workbook = new HSSFWorkbook();
		}else{
			throw new Exception("invalid file name, should be xls or xlsx");
		}
		
		Sheet sheet = workbook.createSheet("ListaProdutos.xls");
		
		Iterator<Produto> iterator = produtoList.iterator();
		
		int rowIndex = 0;
		while(iterator.hasNext()){
			Produto produto = iterator.next();
			Row row = sheet.createRow(rowIndex++);
			Cell cell0 = row.createCell(0);
			cell0.setCellValue(produto.getId());
			Cell cell1 = row.createCell(1);
			cell1.setCellValue(produto.getDescricao());
                        Cell cell2 = row.createCell(2);
			cell2.setCellValue(produto.getQtd());
                        Cell cell3 = row.createCell(3);
			cell3.setCellValue(produto.getPreco());
                        
		}

		FileOutputStream fos = new FileOutputStream("ListaProdutos.xls");
		workbook.write(fos);
		fos.close();
		System.out.println(ListaProdutos + " written successfully");
	}
	
	/*public static void main(String args[]) throws Exception{
		List<Produto> list = ReadExcelFileToList.readExcelData("Sample.xlsx");
		Exportar.writeListaProdutoToFile("Produtos.xls", list);
	}*/
}

