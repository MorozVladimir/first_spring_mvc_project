<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="tpl/header.jsp" %>
<%@ include file="tpl/nav.jsp" %>



      <div class="starter-template">
        <h1>Регистрация</h1>
        
        <%
response.setCharacterEncoding("UTF-8");
response.setContentType("text/html");
request.setCharacterEncoding("UTF-8");
%>
        <form id="regform" action="regrap" method="post" accept-charset="utf-8">
      
      <p>
      	<label for="login">Логин:</label><br>
      	<input type="text" id="login" name="login" required>
      </p>
      <p>
      	<label for="pass1">Пароль:</label><br>
      	<input type="password" id="pass1" name="pass1" required>
      </p>
      <p>
      	<label for="pass2">Подтвердить:</label><br>
      	<input type="password" id="pass2" name="pass2" required>
      </p>
      <p>
      	<label for="email">E-Mail:</label><br>
      	<input type="email" id="email" name="email" required>
      </p>
      <p>
      	<input type="submit" id="submit" name="submit" value="Отправить">
      	<input type="reset" id="reset" name="reset" value="Сбросить">
      </p>
      
      </form>
      </div>
      
<%@ include file="tpl/footer.jsp" %>
