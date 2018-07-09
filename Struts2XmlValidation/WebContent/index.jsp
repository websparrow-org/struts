<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<s:head />
</head>
<body>
	<h1>Struts2 XML File Validation Example</h1>	
	<s:form action="xmlvalidation">
		<s:textfield name="user" label="User Name"></s:textfield>
		<s:password name="pass" label="Password"></s:password>
		<s:submit value="Login"></s:submit>
	</s:form>
</body>
</html>