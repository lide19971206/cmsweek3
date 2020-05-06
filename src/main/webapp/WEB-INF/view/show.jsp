<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta content="width=device-width,initial-scale=1.0">
<title>Insert title here</title>
<link rel="stylesheet" href="/resource/css/bootstrap.css">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>

</head>
<body>
	<table class="table table-hover">
		<tr>
			<td colspan="100">
				<h1>房屋预定系统</h1>
			</td>
		</tr>
		<tr>
			<td colspan="100">
			<form action="list" id="forms">
				类型
				<select name="leixing">
					<option value="name"<c:if test="${vo.leixing == 'name'}"> selected="selected"</c:if>>姓名
					<option value="phone"<c:if test="${vo.leixing == 'phone'}"> selected="selected"</c:if>>手机
					<option value="ht.type"<c:if test="${vo.leixing == 'ht.type'}"> selected="selected"</c:if>>房型
				</select>
				<input type="text" name="leixingtext" value="${vo.leixingtext}">
				票价
				<input type="text" name="minprice" value="${vo.minprice}">-
				<input type="text" name="maxprice" value="${vo.maxprice}">
				备注
				<input type="text" name="showtext" value="${vo.showtext}">
				预定日期
				<input type="text" name="mindate" value="${vo.mindate}">-
				<input type="text" name="maxdate" value="${vo.maxdate}">
				<input type="text" name="pageNum" id="pageNum">
				<input type="submit" value="查询">
			</form>
			</td>
		</tr>
		<tr>
			<td>预定日期</td>
			<td>姓名</td>
			<td>手机</td>
			<td>类型</td>
			<td>票价</td>
			<td>备注</td>
		</tr>
		<c:forEach items="${list}" var="house">
			<tr>
				<td><fmt:formatDate value="${house.createdata}" pattern="yyyy-MM-dd"/></td>
				<td>${house.name}</td>
				<td>${house.phone}</td>
				<td>${house.typeName}</td>
				<td>${house.typePrice}</td>
				<td>${house.showtext}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="100">
				<jsp:include page="pages.jsp"></jsp:include>
			</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
	function goPage(pageNum){
		$("#pageNum").val(pageNum);
		$("#forms").submit();
	}
</script>
</html>