package spring_xml.controller;

import spring_xml.service.IHelloService;

public class HelloController {

    private IHelloService helloService;

    public HelloController(IHelloService helloService) {
        this.helloService = helloService;
    }

    public void execute(){
        System.out.println(helloService.hello());
    }
}
