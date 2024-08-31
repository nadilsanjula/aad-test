package lk.ijse.bean;

import lk.ijse.contract.Eat;
import lk.ijse.customannotation.CrispyChicken;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Eat")


public class Chicken_Bun implements Eat {
    @Override
    public void eat() {
        System.out.println("Like to eat Chicken Bun");
    }
}
