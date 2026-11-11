package intero;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Stateless;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.servlet.annotation.WebServlet;

@Stateless
@WebService(serviceName = "PhoneValidatorService")
public class PhoneValidator {
    @WebMethod(operationName = "validatePhone")
    public boolean isValid(@WebParam(name="pNum")String phonenumber) {
        return true;
    }
    @PostConstruct
    void init() {
        System.out.println("Methode postman is deployed");
    }

}
