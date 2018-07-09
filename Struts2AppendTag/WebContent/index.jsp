<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<h1>Struts 2 Append Tag Example</h1>
	<h3>ArrayList Append Example</h3>
	<s:append var="myArrayList">
		<s:param value="%{list1}"></s:param>
		<s:param value="%{list2}"></s:param>
		<s:param value="%{list3}"></s:param>
	</s:append>
	<ol>
		<s:iterator value="%{#myArrayList}">
			<li><s:property /></li>
		</s:iterator>
	</ol>

	<h3>HashMap Append Example</h3>
	<s:append var="myHashMap">
		<s:param value="%{map1}"></s:param>
		<s:param value="%{map2}"></s:param>
	</s:append>
	<ol>
		<s:iterator value="%{#myHashMap}">
			<li><s:property /></li>
		</s:iterator>
	</ol>

	<h3>ArrayList and HashMap Append Example</h3>
	<s:append var="myArrayListHashMap">
		<s:param value="%{map1}"></s:param>
		<s:param value="%{map2}"></s:param>
		<s:param value="%{list1}"></s:param>
		<s:param value="%{list2}"></s:param>
	</s:append>
	<ol>
		<s:iterator value="%{#myArrayListHashMap}">
			<li><s:property /></li>
		</s:iterator>
	</ol>
</body>
</html>