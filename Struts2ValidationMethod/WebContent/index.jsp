<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body>
	<h1>Struts 2 Validate Method Example</h1>
	<s:actionerror />
	<s:form action="validate">
		<s:textfield name="firstName" label="First Name"></s:textfield>
		<s:textfield name="lastName" label="Last Name"></s:textfield>
		<s:submit value="Save"></s:submit>
	</s:form>
</body>
</html>