package cn.itcast.web.servlet;

import cn.itcast.domain.Province;
import cn.itcast.service.Impl.ProvinceServiceImpl;
import cn.itcast.service.ProvinceService;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/provinceServlet")
public class ProvinceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProvinceService service=new ProvinceServiceImpl();
        List<Province> list = service.findAll();
        ObjectMapper mapper=new ObjectMapper();
        String json = mapper.writeValueAsString(list);
        System.out.println(json);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
