package org.websparrow;

import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class SubReportAction extends ActionSupport {
	private static final long serialVersionUID = 3275286583598504231L;
	private String isSelected;
	private ResultSet rs;
	private FileInputStream fileInputStream;

	@Override
	public String execute() throws Exception {
		try {

			String path = ServletActionContext.getServletContext().getRealPath("/assets");
			Map<String, Object> parameterMap = new HashMap<>();

			if (isSelected.equalsIgnoreCase("YES")) {
				
				rs = SubReportDao.employeeDetails();
				parameterMap.put("SUBREPORT_DIR", JasperCompileManager.compileReport(path + "/Subreport.jrxml"));
				parameterMap.put("EmpResultSet", new JRResultSetDataSource(rs));

			} else {
				parameterMap.put("NODATA", "Please select YES from 'Show Employees Details' boxce .");
			}

			JasperReport jr = JasperCompileManager.compileReport(path + "/Report.jrxml");
			JasperPrint jp = JasperFillManager.fillReport(jr, parameterMap, new JREmptyDataSource(1));
			JasperExportManager.exportReportToPdfFile(jp, path + "EmployeeRecords" + ".pdf");
			fileInputStream = new FileInputStream(new File(path + "EmployeeRecords" + ".pdf"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(String isSelected) {
		this.isSelected = isSelected;
	}

	public FileInputStream getFileInputStream() {
		return fileInputStream;
	}

	public void setFileInputStream(FileInputStream fileInputStream) {
		this.fileInputStream = fileInputStream;
	}

}
