/**
 * 
 */
// register.jsp
function hideError() {
	$("#emailvalidation").hide();
	$("#associateidvalidation").hide();
	$("#validatePassword").hide();
}

$(document).ready(function() {
	hideError();
	$("#registersubmit").click(function() {
		var userinfo = [];
		var count = 0;
		var password = $('#password').val();
		var confirmpassword = $('#confirmpassword').val();
		if (password!=confirmpassword) {
			count++;
			$("#validatePassword").show();
			//alert("inside password validation Count"+count);
		}
		if (count == 0) {
			$.ajax({
				method : "GET",
				url : "http://localhost:8080/O2_Academy/allUser",
				async : false,
				success : function(data) {
					userinfo = data;
					// alert("Data"+userinfo+"Data"+data+"length"+userinfo.length+"name"+userinfo[0].name);
				},
				error : function(xhr, status, error) {
					alert(xhr.responseText);
				}
			});
			var emailid = $('#email').val();
			var associateid = $('#associateid').val();
			for (var i = 0; i < userinfo.length; i++) {
				if (emailid == userinfo[i].emailId) {
					$("#emailvalidation").show();
					count++;
				}
				if (associateid == userinfo[i].associateId) {
					$("#associateidvalidation").show();
					count++;
				}
			}
		}
		if (count > 0) {
			event.preventDefault();
			$("form")[0].reset();
		}
	});

	$("input").change(function() {
		hideError();
	});

});