<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="common/taglibs.jsp" %>

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@ include file="common/btcss.jsp" %>
	
	<title>世界玖玖--包机管理系统登录</title>

	<link rel="stylesheet" href="${ctx }/static/css/login.css">

</head>

<body>
	<div class="box">
		<div class="login-box">
			<div class="login-title text-center">
				<h1>
					<small>XXXX管理系统登录</small>
				</h1>
			</div>
			<div class="login-content ">
				<form id="loginform" action="#">
				<div class="form">
					<div style="text-align: center; color: red;">
						<label id="message"></label>
					</div>
					<div class="form-group">
						<div class="col-xs-12  ">
							<div class="input-group">
								<span class="input-group-addon">
									<span class="glyphicon glyphicon-user"></span>
								</span>
								<input type="text" id="username" name="username" class="form-control" placeholder="请输入用户名">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-12  ">
							<div class="input-group">
								<span class="input-group-addon">
									<span class="glyphicon glyphicon-lock"></span>
								</span>
								<input type="password" id="password" name="password" class="form-control" placeholder="请输入密码">
							</div>
						</div>
					</div>
					<div class="form-group form-actions">
						<div class="col-xs-3 col-xs-offset-1">
							<label> 
								<input type="checkbox" id="rememberme_i" value="1"> 记住我
								<input type="hidden" id="rememberme" name="rememberme" value="0" />
							</label>
						</div>
						<div class="col-xs-4 ">
							<button id="login" type="button" class="btn btn-sm btn-info">
								<span class="glyphicon glyphicon-off"></span> 登录
							</button>
						</div>
					</div>
				</div>
				</form>
			</div>
		</div>
	</div>

	<%@ include file="common/btjs.jsp" %>
	
	<script type="text/javascript" src="${ctx}/static/js/jquery.md5.js"></script>
	
	<script>
		var called = false;
		$(function(){
			//如果登录页显示不在最外层，则将top置为当前链接
			if(this.referrer != "" && this.referrer != location.href) {
				top.location.href = location.href;
			}
			
			$("#username").focus();
			
			$('#login').click(function(){
				if(called) 
					return;
				
				called = true;
				$('#message').html("");
				ajaxclick();
			});

			$('#rememberme_i').click(function(){
				if($(this).is(':checked')) {
					$('#rememberme').val("1");
				} else {
					$('#rememberme').val("0");
				}
			});
			
		});
		
		document.onkeydown = function(e){
			var ev = document.all ? window.event : e;
			if(ev.keyCode==13) {
				var username = $("#username").val();
			    var password = $("#password").val();
			    if(username!='' && password!=''){
			    	$('#login').click();//处理事件
			    }
			}
		}
		
		function ajaxclick() {
			//登录验证失败，需要将call=false
			call = false;
			alert("登录");
			
		}
	</script>
</body>
</html>