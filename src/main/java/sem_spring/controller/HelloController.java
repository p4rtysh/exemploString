package sem_spring.controller;

import sem_spring.service.IHelloService;

public class HelloController {

    private IHelloService helloService;

    public HelloController(IHelloService helloService) {
        this.helloService = helloService;
    }

    public void execute(){
        System.out.println(helloService.hello());
    }
}
