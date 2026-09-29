package sem_spring;

import sem_spring.controller.HelloController;
import sem_spring.service.GCService;
import sem_spring.service.IHelloService;

public class Main {
    public static void main(String[] args) {
        IHelloService helloService = new GCService();
        HelloController controller = new HelloController(helloService);

        controller.execute();
    }
}
