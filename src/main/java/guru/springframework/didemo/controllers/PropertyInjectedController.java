package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){

        return getGreetingService().sayGreeding();
    }
    public GreetingServiceImpl getGreetingService(){
        return  greetingService;
    }
}
