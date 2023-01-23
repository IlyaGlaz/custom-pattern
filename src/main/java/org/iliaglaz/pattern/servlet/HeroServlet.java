package org.iliaglaz.pattern.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.iliaglaz.pattern.service.HeroService;

import java.io.IOException;

@WebServlet("/hero")
public class HeroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsp/customize.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String movement = req.getParameter("movement");
        String weapon = req.getParameter("weapon");

        HeroService.build(movement, weapon);
        resp.sendRedirect("/hero/ready");
    }
}