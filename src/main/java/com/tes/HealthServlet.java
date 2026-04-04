package com.tes;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class HealthServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        res.getWriter().write("Application is healthy");
    }
}
