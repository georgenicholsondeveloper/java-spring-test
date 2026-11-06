package services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class NameGeneratorService implements INameGeneratorService {

    public String GetFormattedString(String name){
        return String.format("Hello, %s!", name);
    }
}
