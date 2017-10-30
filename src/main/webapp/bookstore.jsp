<%@ page contentType="text/html; charset=utf-8" %>
<%@ include file="common.jsp" %>
<html>
<head><title>Bookstore</title></head>
<%@ include file="banner.jsp" %>

<center>
<p><b><a href="<%=request.getContextPath() %>/catalog.jsp" >查看所有书目</a></b>

<form action="bookdetails.jsp" method="POST">
<h3>请输入查询信息</h3>
<b>书的编号:</b>
<input type="text" size="20" name="bookId" value="" ><br><br>
<center><input type=submit value="查询"></center>
</form>
</center>
</body>
</html>