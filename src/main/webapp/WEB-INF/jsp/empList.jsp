<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/28
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            margin: 50px auto 0 auto;
            border-collapse: collapse;
            text-align: center;
            vertical-align: center;
        }
        table, tr, td {
            border: 1px solid black;
        }
        tr, td {
            width: 100px;
            height: 30px;
        }
        #header {
            height: 50px;
            text-align: right;
        }

        #avatar {
            width: 45px;
            height: 45px;
            margin-right: 20px;
        }
    </style>
    <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
</head>
<body>
    <div id="header">
        <img id="avatar" src="${pageContext.request.contextPath}/imgs/${user1.avatar}"><span id="user">欢迎您,${user1.username}</span><a href="servlet/LogoutServlet">Logout</a>

    </div>
   <table>
       <tr>
           <td>empno</td>
           <td>ename</td>
           <td>job</td>
           <td>mgr</td>
           <td>hiredate</td>
           <td>sal</td>
           <td>com</td>
           <td>deptno</td>
           <td>delete</td>
           <td>update</td>
       </tr>
       <c:forEach items="${list}" var="emp">
           <tr>
               <td>${emp.empno}</td>
               <td>${emp.ename}</td>
               <td>${emp.job}</td>
               <td>${emp.mgr}</td>
               <td>${emp.hiredate}</td>
               <td>${emp.sal}</td>
               <td>${emp.com}</td>
               <td>${emp.deptno}</td>
               <td><a href="delete?empno=${emp.empno}">删除</a></td>
               <td><a href="update?empno=${emp.empno}">修改</a></td>
           </tr>
       </c:forEach>
   </table>
</body>
</html>
