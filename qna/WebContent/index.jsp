<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

</head>

<body>
<div>
<c:forEach items="${list}" var="candidate" varStatus="status">
${candidate.name }
</c:forEach>
</div>
	<div class="container-fluid" id="XS">
		<div class="row-fluid">
			<div class="span12">
				<div class="page-header">
					<h1>全国十大投资项目</h1>
				</div>
				<table class="table table-striped table-hover table-condensed">
					<thead>
						<tr>
							<th>排名</th>
							<th>项目LOGO</th>
							<th>项目名称</th>
							<th>简介</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td><img
								src="http://img0.imgtn.bdimg.com/it/u=2218069644,1332462894&amp;fm=21&amp;gp=0.jpg"
								width="50px" alt='' /></td>
							<td>慧致天诚</td>
							<td>俞敏洪老师的公司</td>
						</tr>
						<tr>
							<td>1</td>
							<td><img
								src="http://img0.imgtn.bdimg.com/it/u=2218069644,1332462894&amp;fm=21&amp;gp=0.jpg"
								width="50px" alt='' /></td>
							<td>慧致天诚</td>
							<td>俞敏洪老师的公司</td>
						</tr>
						<tr>
							<td>1</td>
							<td><img
								src="http://img0.imgtn.bdimg.com/it/u=2218069644,1332462894&amp;fm=21&amp;gp=0.jpg"
								width="50px" alt='' /></td>
							<td>慧致天诚</td>
							<td>俞敏洪老师的公司</td>
						</tr>
						<tr>
							<td>1</td>
							<td><img
								src="http://img0.imgtn.bdimg.com/it/u=2218069644,1332462894&amp;fm=21&amp;gp=0.jpg"
								width="50px" alt='' /></td>
							<td>慧致天诚</td>
							<td>俞敏洪老师的公司</td>
						</tr>
						<tr>
							<td>1</td>
							<td><img
								src="http://img0.imgtn.bdimg.com/it/u=2218069644,1332462894&amp;fm=21&amp;gp=0.jpg"
								width="50px" alt='' /></td>
							<td>慧致天诚</td>
							<td>俞敏洪老师的公司</td>
						</tr>
						<tr>
							<td>1</td>
							<td><img
								src="http://img0.imgtn.bdimg.com/it/u=2218069644,1332462894&amp;fm=21&amp;gp=0.jpg"
								width="50px" alt='' /></td>
							<td>慧致天诚</td>
							<td>俞敏洪老师的公司</td>
						</tr>
					</tbody>
				</table>
				<div class="view">
					<div class="pagination">
						<ul contenteditable="true">
							<li><a href="#">上一页</a></li>
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#">下一页</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>