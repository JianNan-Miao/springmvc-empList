<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/28
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
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

    </style>
</head>
<body>
    <form action="updates" method="post">
        <table>
            <tr>
                <td>empno</td><td>ename</td><td>job</td><td>mgr</td>
                <td>hiredate</td><td>sal</td><td>com</td><td>deptno</td>
            </tr>
            <tr>
                <td  ><input type="text" name="empno"  value="${emp.empno}"></td>
                <td  ><input type="text" name="ename"  value="${emp.ename}"></td>
                <td ><input type="text" name="job" value="${emp.job}"></td>
                <td  ><input type="text" name="mgr"  value="${emp.mgr}"></td>
                <td  ><input type="text" name="hiredate"  value="${emp.hiredate}"></td>
                <td ><input type="text" name="sal"  value="${emp.sal}"></td>
                <td  ><input type="text" name="com"  value="${emp.com}"></td>
                <td  ><input type="text" name="deptno"  value="${emp.deptno}"></td>
            </tr>
            <button type="submit">更新</button>
        </table>
    </form>
</body>
</html>
