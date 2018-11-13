package guru.springframework.didemo.controllers;
import guru.springframework.didemo.services.GreetingService;
public class ConstructorinjectedController {

    private GreetingService greetingService;

    public ConstructorinjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    String sayHello(){
        return greetingService.sayGreeding();
    }
}
