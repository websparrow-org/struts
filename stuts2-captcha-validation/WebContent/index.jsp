<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Struts 2 login validation example using Captcha</title>
<script type="text/javascript">
	function generateNewCaptcha() {		
		document.getElementById("capImg").setAttribute("src", "");
		document.getElementById("capImg").setAttribute("src", "loadCaptcha?date="+new Date());
	}
</script>
</head>
<body>
<h1>Struts 2 login validation example using Captcha</h1>
	<pre>
		<form action="login.action" method="post">

			user:	<input type="text" name="userId" />
		
			pass:	<input type="password" name="pass" />

			captcha:<input type="text" name="captcha" />
	
			<img id="capImg" src="loadCaptcha" /> <button type="button"	onclick="generateNewCaptcha();">Refresh</button>


			<input type="submit" value="Login" />

		</form>
</pre>
	<p>	<s:property value="msg" /> </p>
</body>
</html>