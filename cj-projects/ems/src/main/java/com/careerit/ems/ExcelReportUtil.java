package com.careerit.ems;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReportUtil {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;

    public ExcelReportUtil() {
        workbook = new XSSFWorkbook();
    }
    public void createExcel(Collection<String> headerData, Collection<List<Object>> rowsData){

          this.createExcel("","",headerData,rowsData);
    }
    public  void createExcel(String fileName,String sheetName,Collection<String> headerData, Collection<List<Object>> rowsData){
        if(fileName == null || fileName.isBlank()){
            fileName = System.currentTimeMillis()+"_Report.xlsx";
        }
        if(sheetName == null || sheetName.isBlank()){
            sheetName = ""+System.currentTimeMillis();
        }
        try (FileOutputStream fos = new FileOutputStream(new File(fileName))){
            sheet = workbook.createSheet(sheetName);
            writeHeaderRow(headerData);
            writeDataRows(rowsData);
            workbook.write(fos);
        }catch (IOException e){
            e.printStackTrace();
           
        }
    }
    private void writeHeaderRow(Collection<String> headers) {
        XSSFRow row = sheet.createRow(0);
        int count = 0;
        XSSFCellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        short size = 12;
        font.setFontHeightInPoints(size);
        style.setFont(font);
        for(String header:headers) {
            createCell(row, count++, header, style);
        }
    }
    private void createCell(XSSFRow row, int columnCount, Object value, XSSFCellStyle style) {
        sheet.autoSizeColumn(columnCount);
        XSSFCell cell = row.createCell(columnCount);
        if (value instanceof Long) {
            cell.setCellValue((Long) value);
        }else if (value instanceof UUID) {
            cell.setCellValue(value.toString());
        }else if(value instanceof Timestamp){
            cell.setCellValue(value.toString());
        }else if(value instanceof  java.sql.Timestamp){
            cell.setCellValue(value.toString());
        }else if(value instanceof LocalDateTime){
            cell.setCellValue(value.toString());
        }else if(value instanceof LocalDate){
            cell.setCellValue(value.toString());
        }else if(value instanceof  Integer){
            cell.setCellValue((Integer) value);
        }else if (value instanceof Double) {
            cell.setCellValue((Double) value);
        }else if (value instanceof Float) {
            cell.setCellValue((Float) value);
        }else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        }else {
            cell.setCellValue((String) value);
        }
        cell.setCellStyle(style);
    }
    private void writeDataRows(Collection<List<Object>> rows) {
        int rowCount = 1;
        XSSFCellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        short size = 12;
        font.setFontHeightInPoints(size);
        style.setFont(font);
        for (List<Object> dataRow : rows) {
            XSSFRow row = sheet.createRow(rowCount++);
            int columnCount = 0;
            for(Object cellValue:dataRow) {
                createCell(row, columnCount++, cellValue, style);
            }
        }
    }

}