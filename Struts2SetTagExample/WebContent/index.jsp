<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Struts 2 Set Tag Example</title>
</head>
<body>
	<h1>Struts 2 Set Tag Example</h1>

	<%-- 	<s:set var="ws" value="%{'INDIA'}" /> --%>

	<s:set var="ws" value="country" />

	<s:if test="%{#ws=='INDIA'}">

		<p>Hi, You are from INDIA.</p>

	</s:if>
	<s:else>

		<p>Sorry, You are not from INDIA.</p>

	</s:else>

</body>
</html>