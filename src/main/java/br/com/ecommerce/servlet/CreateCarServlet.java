package br.com.ecommerce.servlet;

import br.com.ecommerce.dao.CarDao;
import br.com.ecommerce.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String carName = request.getParameter("car-name");

        Car car = new Car(carName);

        new CarDao().createCar(car);

        //request.getRequestDispatcher("index.html").forward(request, response);
        response.sendRedirect("/find-all-cars");


    }
}
