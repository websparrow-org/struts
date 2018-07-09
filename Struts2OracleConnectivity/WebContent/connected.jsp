<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE>
<html>
<head>
<title>Struts 2 and Oracle Database Connectivity Example</title>
</head>
<body>
	<h2>Struts 2 and Oracle Database Connectivity Example</h2>
	<p>Congratulation, You have successfully connected with Oracle database.</p>
	<s:form action="report.action">
		<s:submit value="Report"></s:submit>
	</s:form>
	<hr>
	<table style="margin-left: 20px;" border="1px solid;">
		<thead>
			<tr style="background-color: #E0E0E1;">
				<th>EMPNO</th>
				<th>ENAME</th>
				<th>JOB</th>
				<th>HIREDATE</th>
				<th>SAL</th>
			</tr>
		</thead>
		<s:iterator value="list">
			<tr>
				<td><s:property value="empNo" /></td>
				<td><s:property value="empName" /></td>
				<td><s:property value="job" /></td>
				<td><s:property value="hireDate" /></td>
				<td><s:property value="sal" /></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>