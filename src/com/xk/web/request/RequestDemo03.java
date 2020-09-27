package com.xk.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo3")
public class RequestDemo03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //演示获取请求头数据
         String referer = req.getHeader("referer");
        System.out.println(referer);

        //防盗链
        if(referer != null){
            if(referer.contains("/com_servlet")){
                //正常访问
                //System.out.println("播放中");
                resp.setContentType("text/html;charset=utf-8");
                resp.getWriter().write("播放电影中---");
            }else{
                //盗链
               // System.out.println("想看电影？你配吗?");
                resp.setContentType("text/html;charset=utf-8");
                resp.getWriter().write("您配吗？？---");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
