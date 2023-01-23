package org.iliaglaz.pattern.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.iliaglaz.pattern.service.HeroService;

import java.io.IOException;

@WebServlet("/hero/ready")
public class LetsGoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("hero", HeroService.getHero());

        req.getRequestDispatcher("/WEB-INF/jsp/hero.jsp")
                .forward(req, resp);
    }

}