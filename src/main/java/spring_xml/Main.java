package spring_xml;

import spring_xml.controller.HelloController;
import spring_xml.service.GCService;
import spring_xml.service.IHelloService;

public class Main {
    public static void main(String[] args) {
        IHelloService helloService = new GCService();
        HelloController controller = new HelloController(helloService);

        controller.execute();
    }
}
