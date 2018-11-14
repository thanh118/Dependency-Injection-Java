package guru.springframework.didemo.services;
import org.springframework.stereotype.Service;
@Service
public class SetterGreetingService implements GreetingService{
    @Override
    public String sayGreeding(){
        return "Hello- I was injected by the setter" ;
    }
}
