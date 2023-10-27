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

        System.out.println(carName);
        CarDao cardao = new CarDao();
        Car car = new Car();
        car.setName(carName);
        cardao.createCar(car);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }
}
