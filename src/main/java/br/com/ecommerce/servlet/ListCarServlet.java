package br.com.ecommerce.servlet;

import br.com.ecommerce.dao.CarDao;
import br.com.ecommerce.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-cars")
public class ListCarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Car> cars = new CarDao().findAllCars();

        req.setAttribute("cars", cars);
        System.out.println("Item lista: " + cars.get(1).getName());
        req.getRequestDispatcher("dashboard.jsp").forward(req, resp);

    }
}
