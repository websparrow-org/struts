
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">

// function for report
	function report() {		
		$.getJSON("report.action", function(data) {
			var tblData="";
			$.each(data.beanList, function() {
				tblData += "<tr><td>" + this.uname + "</td>" + 
				"<td>" + this.uemail + "</td>" + 
				"<td>" + this.upass + "</td>" + 
				"<td>" + this.udeg + "</td>" +
				"<td>"+
				"<button onclick='fetchOldRecord(this);' class='btn btn-sm btn-info' data-toggle='modal' data-target='#updateModal'>Update</button>"+
				"<button onclick='deleteUser(this);' class='btn btn-sm btn-danger'>Delete</button>"+
				"</td></tr>" ;
			});
			$("#tbody").html(tblData);
		});
	}
	
// function for fetch old data in form
	function fetchOldRecord(that){		
		   $("#uname").val($(that).parent().prev().prev().prev().prev().text());
		   $("#uemail").val($(that).parent().prev().prev().prev().text());
		   $("#upass").val("");
		   $("#udeg").val($(that).parent().prev().text());
		   $("#hiddenuemail").val($(that).parent().prev().prev().prev().text());
       	}
       	
// function for update new records
	function updateNewRecord() {		
		var newDataURL="uname="+$("#uname").val()+"&uemail="+$("#uemail").val()+"&upass="+$("#upass").val()+
		                "&udeg="+$("#udeg").val()+"&hiddenuemail="+$("#hiddenuemail").val();		
		$.getJSON("updateuser.action",newDataURL, function(data){			
			var ht= data.msg;
			$("#resp").html(ht);
		});
	}

// function for delete selected record
	function deleteUser(that) {		
		var delDataURL="uemail="+$(that).parent().prev().prev().prev().text();
		$.getJSON("deleteuser.action",delDataURL, function(data){			
			if(data.msg==="Delete Successful"){
				alert(data.msg)
				$(that).closest('tr').remove();				
			} else{
				alert(data.msg)
			}			
		});		
	}
</script>
</head>
<body onload="report();">
	<nav class="navbar navbar-default">
		<div class="container">
			<div class="navbar-header"><a class="navbar-brand" href="/">CRUD</a></div>
			<ul class="nav navbar-nav">
				<li><a href="register.jsp">Register</a></li>
				<li><a href="report.jsp">Report</a></li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<table class="table table-bordered">
			<thead>
				<tr class="bg-info">
					<th>Name</th>
					<th>Email</th>
					<th>Password</th>
					<th>Designation</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody id="tbody">
			</tbody>
		</table>
	</div>
<div class="container" id="updateBlock">
		<div class="modal fade" id="updateModal" role="dialog">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Update New Information</h4>
					</div>
					<div class="modal-body">
						<div class="row">
							<div class="col-xs-6 col-sm-6 col-md-6">
								<div class="form-group">
									<input type="text" name="uname" id="uname" class="form-control input-sm" placeholder="Full Name">
								</div>
							</div>
							<div class="col-xs-6 col-sm-6 col-md-6">
								<div class="form-group">
									<input type="text" name="udeg" id="udeg" class="form-control input-sm" placeholder="Designation">
								</div>
							</div>
						</div>
						<div class="form-group">
							<input type="text" name="uemail" id="uemail" class="form-control input-sm" placeholder="Email">
							<input type="hidden" name="hiddenuemail" id="hiddenuemail">
						</div>
						<div class="form-group">
							<input type="password" name="upass" id="upass" class="form-control input-sm" placeholder="Password">
						</div>
						<button onclick="updateNewRecord();" class="btn btn-info btn-block">Update</button>
						<div id="resp" class="text-center" style="margin-top: 13px;"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>