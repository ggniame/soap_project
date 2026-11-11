package intero;

public class App {
    public static void main(String[] args) {
        System.out.println("Web service call:");

        intero.PhoneValidatorService service= new intero.PhoneValidatorService();
        intero.PhoneValidator port = service.getPhoneValidatorPort();
         System.out.println(port.validatePhone("0633378"));

    }
}
