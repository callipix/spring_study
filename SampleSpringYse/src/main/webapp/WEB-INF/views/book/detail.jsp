<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 상세</title>
</head>
<body>
<h1>책 상세</h1>
<p>제목 : ${book.TITlE}</p>
<p>카테고리 : ${book.CATEGORY}</p>
<p>가격 : <fmt:formatNumber type="number" maxFractionDigits="3" value="${book.PRICE}" /></p>
<p>입력일 : <fmt:formatNumber value="${book.INSERT_DATE}" pattern="yyyy.MM.dd HH:mm:ss" /></p>

<p><a href="/update?bookId=${bookId}"></a>수정</p>
	<form method="post" action="/delete">
		<input type="hidden" name="bookId" value="${bookId}" />
		<input type="submit" value="삭제" />
	 </form>
<p>
<a href="/list">목록으로</a>
</p>
</body>
</html>