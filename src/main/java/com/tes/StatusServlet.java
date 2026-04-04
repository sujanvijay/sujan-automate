package com.tes;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class StatusServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/json");
        res.getWriter().write("{\"status\":\"UP\"}");
    }
}
