package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
public class SetterInjectedController {
    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeding();
    }
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

}
