<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Update" method="post">
	
	项目名称:<input type="text" name='name' /><br/>
	一句话说明: <input type="text" name='introduce' /><br/>
	 项目LOGO：<input type="text" name='logoUrl' /><br/>
	 融资情况:<input type="text" name='financing' /><br/>
	 团队成员简介:<input type="text" name='member' /><br/>
	 项目模式简介：<input type="text" name='mode' /><br/>
	 产品/官网链接:<input type="text" name='productUrl' /><br/>
	 商业计划书附件:<input type="text" name='prospectusUrl' /><br/>
	 票数:<input type="text" name='vote' value='0' /><br/>
	 <input type='submit' value='提交' />
	 
	</form>
</body>
</html>