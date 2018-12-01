package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingServices implements GreetingService {

    @Override
    public String sayGreeding(){
        return "Primäer Grußdienst";
    }
}
