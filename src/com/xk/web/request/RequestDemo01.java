package com.xk.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo1")
public class RequestDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //演示获取请求头数据 user-agent
        String agent = req.getHeader("user-agent");
        if(agent.contains("Chrome")){
            //谷歌
            System.out.println("谷歌来了！");
        }else if(agent.contains("Firefox")){
            System.out.println("火狐来了！！");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
