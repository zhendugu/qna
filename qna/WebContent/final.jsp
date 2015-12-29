<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="css/bootstrap-theme.min.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<script src="js/npm.js" type="text/javascript" charset="utf-8"></script>
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery.js"></script>
<!-- ajax -->
<script type="text/javascript">
	function loadXMLDoc() {
		$.post("VoteController","name=${candidate.name}",function haha(){alert('投票成功');})
		}
</script>

</head>
<body>

	<div class="container-fluid" id="XS">
		<div class="row-fluid">
			<div class="span12">
				<div class="header">
					<ul class="nav nav-pills pull-right">
						<li class="active"><a href="#">主页</a></li>
						<li><a href="#">关于</a></li>
						<li><a href="CandidateShow">查看排行榜</a></li>
					</ul>
					<h3 class="text-muted"></h3>
				</div>
				<div class="jumbotron well">
					<h1>${candidate.name }</h1>
					<img alt="${candidate.name }"
						src="http://shanyuanjie.cn/r/cms/www/default/channel/images/logo.png">

					<h5>项目说明</h5>
					<p class="lead">${candidate.introduce }</p>
					<p>
					<h4>融资情况</h4>
					<p>${candidate.financing }</p>

					<h4>创始人</h4>
					<p>${candidate.member }</p>

					<h4>项目模式</h4>
					<p>${candidate.mode }</p>
					<a class="btn btn-lg btn-success" onclick="loadXMLDoc()"
						role="button">投票</a>
					</p>

				</div>
				<div class="row marketing">
					<!-- <div class="col-lg-6">
						<h4>子标题</h4>
						<p>W3CSCHOOL 菜鸟教程，学的不仅是技术，更是梦想！</p>
						<h4>子标题</h4>
						<p>W3CSCHOOL 菜鸟教程，学的不仅是技术，更是梦想！</p>
						<h4>子标题</h4>
						<p>W3CSCHOOL 菜鸟教程，学的不仅是技术，更是梦想！</p>
					</div>
					<div class="col-lg-6">
						<h4>子标题</h4>
						<p>W3CSCHOOL 菜鸟教程，学的不仅是技术，更是梦想！</p>
						<h4>子标题</h4>
						<p>W3CSCHOOL 菜鸟教程，学的不仅是技术，更是梦想！</p>
						<h4>子标题</h4>
						<p>W3CSCHOOL 菜鸟教程，学的不仅是技术，更是梦想！</p>
					</div> -->
				</div>
			</div>
		</div>
	</div>
</body>
</html>