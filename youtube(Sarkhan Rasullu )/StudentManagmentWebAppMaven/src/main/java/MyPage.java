/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entities.User;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import studentmanagmentdb.Student;
import studentmanagmentdb.StudentDatabase;
import studentmanagmentdb.UserJPA;
import javax.inject.Inject;

/**
 *
 * @author murad_isgandar
 */
@WebServlet(urlPatterns = {"/MyPage"})
public class MyPage extends HttpServlet {
    
    @Inject
    UserJPA user;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        user.findUserById(1);
        
        
        System.out.println("u"+user);

    }

    public static String getAllDataFromRequest(HttpServletRequest request) throws Exception {

        String body = null;
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;

        try {
            InputStream inputStream = request.getInputStream();
            if (inputStream != null) {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                char[] charBuffer = new char[128];
                int bytesRead = -1;
                while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
                    stringBuilder.append(charBuffer, 0, bytesRead);
                }
            } else {
                stringBuilder.append("");
            }
        } catch (IOException ex) {
            throw ex;
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    throw ex;
                }
            }
        }

        body = stringBuilder.toString();

        return body;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            System.out.println("data " + getAllDataFromRequest(request));

            String name = request.getParameter("name");
            name = name == null ? "" : name;

            System.out.println("name " + name);
            String surname = request.getParameter("surname");
            surname = surname == null ? "" : surname;

            String ageStr = request.getParameter("age");
            ageStr = ageStr == null ? "" : ageStr;

            Integer age = null;
            if (ageStr != null && !ageStr.isEmpty()) {
                age = Integer.parseInt(ageStr);
            }

            List<Student> list = StudentDatabase.getAllStudents(name, surname, age);
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>POST REQUEST</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("POST REQUEST" + list.toString());
                out.println("</body>");
                out.println("</html>");
            }
        } catch (Exception ex) {
            Logger.getLogger(MyPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyPage</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>DELETE REQUEST</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyPage</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>PUT REQUEST</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    protected void doOptions(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyPage</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>OPTIONS REQUEST</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
