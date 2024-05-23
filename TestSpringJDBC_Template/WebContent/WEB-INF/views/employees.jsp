<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employees</title>
</head>
<body>
    <h2>Employee List</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Emp No</th>
                <th>Emp Name</th>
                <th>Job</th>
                <th>Salary</th>
                <th>Dept No</th>
                <th>Hire Date</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="employee" items="${employees}">
                <tr>
                    <td>${employee.emp_no}</td>
                    <td>${employee.emp_name}</td>
                    <td>${employee.job}</td>
                    <td>${employee.salary}</td>
                    <td>${employee.dept_no}</td>
                    <td>${employee.hire_date}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>