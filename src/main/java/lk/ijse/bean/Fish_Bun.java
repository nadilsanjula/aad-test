package lk.ijse.bean;

import lk.ijse.contract.Eat;
import org.springframework.stereotype.Component;

@Component
public class Fish_Bun implements Eat {
    @Override
    public void eat() {
        System.out.println("Like to eat Fish Bun");
    }
}
