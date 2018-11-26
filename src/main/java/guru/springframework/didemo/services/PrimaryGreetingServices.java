package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingServices implements GreetingService{

    @Override
    public String sayGreeding(){
        return "Hello -Primary greeting service";
    }
}
