<%-- 
    Document   : index
    Created on : Aug 30, 2019, 4:13:45 PM
    Author     : murad_isgandar
--%>

<%@page import="studentmanagmentdb.StudentDatabase"%>
<%@page import="studentmanagmentdb.Student"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Main Page JSP | Student Managment App</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="author" content="Murad Isgandar" >

        <link rel="stylesheet" href="studentcore.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

        <script>
            function setIdForDelete(id) {
                document.getElementById("studentIdForDelete").value = id;
            }

            function setIdForUpdate(id) {
                document.getElementById("studentIdForUpdate").value = id;
            }

        </script>
    </head>
    <body> 

        <%

            request.setCharacterEncoding("UTF-8");
            String action = request.getParameter("action");

            String name = request.getParameter("name");
            name = name == null ? "" : name;

            String surname = request.getParameter("surname");
            surname = surname == null ? "" : surname;

            String ageStr = request.getParameter("age");
            ageStr = ageStr == null ? "" : ageStr;

            Integer age = null;
            if (ageStr != null && !ageStr.isEmpty()) {
                age = Integer.parseInt(ageStr);
            }

            String id = request.getParameter("studentId");
            String studentİd = null;
            if (id != null && !id.isEmpty()) {
                studentİd = id;
            }

            if (action != null && !action.isEmpty()) {
                if (action.equalsIgnoreCase("delete")) {
                    StudentDatabase.deleteStudent(studentİd);
                } else if (action.equalsIgnoreCase("update")) {
                    StudentDatabase.updateStudent(new Student(studentİd, name, surname, age));
                } else if (action.equalsIgnoreCase("add")) {
                    StudentDatabase.addStudent(new Student(null, name, surname, age));
                }
                if (!action.equalsIgnoreCase("search")) {
                    name = "";
                    surname = "";
                    ageStr = "";
                    age=null;
                    response.sendRedirect("index.jsp");
                }
            }
            

            List<Student> students = StudentDatabase.getAllStudents(name, surname, age);

        %>

        <div class="container">
            <!-- Modal -->
            <div class="modal fade" id="deleteModal" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <form action="index.jsp" method="GET">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                <h4 class="modal-title">Delete Student</h4>
                            </div>
                            <div class="modal-body">
                                <p>Are you sure?</p>
                            </div>
                            <div class="modal-footer">
                                <input type="hidden" name="studentId" id="studentIdForDelete"/>
                                <input type="hidden" name="action" value="delete"/>
                                <input type="submit" class="btn btn-default" value="Yes"/>
                                <input type="submit" class="btn btn-danger" data-dismiss="modal" value="Cancel"/>
                            </div>
                        </form>
                    </div>

                </div>
            </div>

        </div>

        <div class="container">
            <!-- Modal -->
            <div class="modal fade" id="updateModal" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <form action="index.jsp" method="POST">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                <h4 class="modal-title">Update Student</h4>
                            </div>
                            <div class="modal-body">
                                <div class="form-group">
                                    <label for="name">Name</label>
                                    <input type="text" name="name" class="form-control"placeholder="name"/>
                                </div>
                                <div class="form-group">
                                    <label for="surname">Surname</label>
                                    <input type="text" name="surname" class="form-control" placeholder="surname"/>
                                </div>
                                <div class="form-group">
                                    <label>Age</label>
                                    <input type="number" name="age" class="form-control" placeholder="age"/>
                                </div>

                            </div>
                            <div class="modal-footer">
                                <input type="hidden" name="studentId" id="studentIdForUpdate"/>
                                <input type="hidden" name="action" value="update"/>
                                <input type="submit" class="btn btn-default" value="Ok"/>
                                <input type="submit" class="btn btn-danger" data-dismiss="modal" value="Cancel"/>
                            </div>
                        </form>
                    </div>

                </div>
            </div>

        </div>


        <div class="row">
            <form class="col-md-3" action="index.jsp" method="POST">
                <div class="form-group">
                    <label for="name">Name</label>
                    <input type="text" name="name" class="form-control"placeholder="name" value="<%=name%>">
                </div>
                <div class="form-group">
                    <label for="surname">Surname</label>
                    <input type="text" name="surname" class="form-control" placeholder="surname" value="<%=surname%>">
                </div>
                <div class="form-group">
                    <label>Age</label>
                    <input type="number" name="age" class="form-control" placeholder="age" value="<%=age%>">
                </div>

                <button type="submit" class="btn btn-primary" name="action" value="add" id="addBtn">Add</button>
                <button type="submit" class="btn btn-primary" name="action" value="search">Search</button>
            </form> 
        </div>
        <br>

        <table class="table">

            <thead>
                <tr>
                    <th>#</th>
                    <th>name</th>
                    <th>surname</th>
                    <th>age</th>
                    <th>actions</th>
                </tr>

            </thead>

            <tbody>
                <%
                    for (int i = 0; i < students.size(); i++) {
                        Student s = students.get(i);
                %>

                <tr>
                    <td>
                        <%=i + 1%>
                    </td>
                    <td>
                        <%=s.getName()%>
                    </td>
                    <td>
                        <%=s.getSurname()%>
                    </td>
                    <td>
                        <%=s.getAge()%>
                    </td>
                    <td>
                        <button class="btn btn-warning" data-toggle="modal" data-target="#updateModal"
                                onclick="setIdForUpdate('<%=s.getId()%>')"
                                >
                            <i class="fa fa-pencil-square-o" aria-hidden="true"></i>
                        </button> 
                        <button class="btn btn-danger" data-toggle="modal" data-target="#deleteModal"
                                onclick="setIdForDelete('<%=s.getId()%>')"  
                                >
                            <i class="fa fa-trash" aria-hidden="true"></i>

                        </button> 
                    </td>
                </tr>

                <%
                    }
                %>

            </tbody>

        </table>


    </body>
</html>

