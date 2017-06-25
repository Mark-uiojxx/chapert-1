package org.mylearn.chapter1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 2017/6/25.
 */
//使用WebServlet注解并配置请求路径，对外发布Servlet服务
@WebServlet("/hello")
//继承HttpServlet，成为Servlet类
public class HelloServlet extends HttpServlet {
    //覆盖doGet方法，用于接收GET请求
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dateFormat.format(new Date());
        req.setAttribute("currentTime",currentTime);
        //转发
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);
    }
}
