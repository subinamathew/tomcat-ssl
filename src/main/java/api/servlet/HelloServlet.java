package api.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response)
            throws ServletException, IOException {

        // Business Logic
        UserModel model = new UserModel();
        User user = model.getUser();

        // Create response message
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getOutputStream(), user);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response)
            throws ServletException, IOException {

        String name = req.getParameter("name");

        // Business Logic
        User user = new User("22255",name);

        // Create response message
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getOutputStream(), user);
        
    }
}

class User {
    private String id;
    private String name;

    public User(String id) {
        this.id = id;
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}