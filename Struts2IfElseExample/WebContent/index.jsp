<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
</head>
<body>
	<h1>Struts 2 If, ElseIf and Else tag example</h1>

	<!-- start of if block -->
	<s:if test="msg=='WebSparrow'">
		<p>I am in If condition</p>
	</s:if>

	<!-- start of elseif block -->
	<s:elseif test="msg=='WebSparrow.org'">
		<p>I am in ElseIf condition.</p>
	</s:elseif>

	<!-- start of else block -->
	<s:else>
		<p>I am in Else condition</p>
	</s:else>

</body>
</html>