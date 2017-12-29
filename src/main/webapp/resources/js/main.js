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
        var emailid = $('#email').val();
        var associateid = $('#associateid').val();
        var name = $('#name').val();
        if(password==""||confirmpassword==""||emailid==""||associateid==""||name==""){
            count++;
            alert("All fields are mandatory")
        }
        if (password!=confirmpassword) {
            count++;
            $("#validatePassword").show();
            //alert("inside password validation Count"+count);
        }
        if (count == 0) {
            $.ajax({
                method : "GET",
                url : "allUser",
                async : false,
                success : function(data) {
                    userinfo = data;
                    // alert("Data"+userinfo+"Data"+data+"length"+userinfo.length+"name"+userinfo[0].name);
                },
                error : function(xhr, status, error) {
                    alert(xhr.responseText);
                }
            });
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
        if(count==0){
            alert("Thanks for Registering !!!! Please Login ");
        }
    });

    $("input").change(function() {
        hideError();
    });

});


//login.jsp
function hideLoginError() {
    $("#logincredentialerror").hide();
}
$(document).ready(function() {
    hideLoginError();
    $("#userloginsubmit").click(function() {
        try{
            var userinfo = [];
            var count = 0;
            $.ajax({
                method : "GET",
                url : "allUser",
                async : false,
                success : function(data) {
                    userinfo = data;
                    // alert("Data"+userinfo+"Data"+data+"length"+userinfo.length+"name"+userinfo[0].name);
                },
                error : function(xhr, status, error) {
                    alert(xhr.responseText);
                }
            });
            var associateId = $('#associateId').val();
            var password = $('#password').val();
            //alert("associate id="+associateId+" length="+userinfo.length);
            for (var i = 0; i < userinfo.length; i++) {
                if ((associateId==userinfo[i].associateId)&& (password==userinfo[i].password)) {
                    count++;
                }
            }
            if(count==0){
                $("#logincredentialerror").show();
                event.preventDefault();
                $("form")[0].reset();
            }
        }
        catch(err){
            alert("Error=="+err.message);
        }

    });
});

