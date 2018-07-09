<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Struts 2 and Jasper Subreports Integration Example</title>
</head>
<body>
	<h1>Struts 2 and Jasper Subreports Integration Example</h1>
	<s:form action="SubReport" method="POST">
		<s:select label="Show Employees Details" list="#{'YES':'YES', 'NO':'NO'}" name="isSelected" />
		<s:submit value="Submit" />
	</s:form>
</body>
</html>