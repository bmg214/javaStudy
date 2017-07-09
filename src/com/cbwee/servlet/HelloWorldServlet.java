package com.cbwee.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by Administrator on 2017/4/16 0016.
 */
public class HelloWorldServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String str = "<html><head><title>Hello World sample</title>"+
                "<body><h1>Hello World:"+ new Date().toLocaleString()+"</h1></body></html>";
        out.println(str);

        System.out.println( new Date().toLocaleString());
        out.flush();
    }
}
