<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<title>Sending email using Struts 2 and JavaMail API</title>
<style type="text/css">
.jumbotron {
	background: #358CCE;
	color: #FFF;
	border-radius: 0px;
}

.jumbotron-sm {
	padding-top: 24px;
	padding-bottom: 24px;
}

.jumbotron small {
	color: #FFF;
}

.h2 small {
	font-size: 18px;
}
</style>
</head>
<body>
	<div class="jumbotron jumbotron-sm">
		<div class="container">
			<div class="row">
				<div class="col-sm-12 col-lg-12">
					<h2 class="h2">
						WebSparrow.org <small>Sending email using Struts 2 and JavaMail API</small>
					</h2>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<div class="well well-sm">
					<form action="sendemail" method="post">
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label for="senderEmail">Login</label> <input type="text" name="senderEmail" class="form-control" id="senderEmail" placeholder="Sender email" required="required" />
									<br> <input type="password" class="form-control" id="senderPassword" placeholder="Password" name="senderPassword" required="required" />
								</div>
								<div class="form-group">
									<label for="receiverEmail">Receiver Email</label> <input type="text" name="receiverEmail" class="form-control" id="receiverEmail" placeholder="Receiver email"
										required="required" />
								</div>
								<div class="form-group">
									<label for="subject">Subject</label> <input type="text" class="form-control" id="subject" name="subject" placeholder="Subject" required="required" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<label for="message"> Message</label>
									<textarea name="message" id="message" class="form-control" rows="11" cols="25" required="required" placeholder="Message"></textarea>
								</div>
							</div>
							<div class="col-md-12">
								<button type="submit" class="btn btn-primary pull-right" id="btnContactUs">Send Message</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>