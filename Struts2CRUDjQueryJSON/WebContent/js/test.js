function deleteUser(that) {
	var delDataURL = "uemail=" + $(that).parent().prev().prev().prev().text();
	$.getJSON("deleteuser.action", delDataURL, function(data) {
		if (data.msg === "Delete Successful") {
			alert(data.msg)
			$(that).closest('tr').remove();
		} else {
			alert(data.msg)
		}
	});
}