<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="tpl/header.jsp" %>
<%@ include file="tpl/nav.jsp" %>

      <div class="starter-template">
        <h1>Результаты регистрации</h1>
        <h2>Логин: ${user.login}</h2>
        <h2>Пароль: ${user.pass1}</h2>
        <h2>Повтор: ${user.pass2}</h2>
        <h2>Емаил: ${user.email}</h2>
      </div>

<%@ include file="tpl/footer.jsp" %>