package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class PrimaryGreetingServices implements GreetingService{

    @Override
    public String sayGreeding(){
        return "Hello -Primary greeting service";
    }
}
