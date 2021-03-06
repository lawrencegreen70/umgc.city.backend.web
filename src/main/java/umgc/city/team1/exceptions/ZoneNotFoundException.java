package umgc.city.team1.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import java.util.UUID;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ZoneNotFoundException extends Exception {
    public ZoneNotFoundException(){
        super();
    }
    public ZoneNotFoundException(String message){
        super(message);
    }
    public ZoneNotFoundException(Throwable e){
        super(e);
    }
    public ZoneNotFoundException(String message, Throwable e){
        super(message, e);
    }
}


