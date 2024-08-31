package lk.ijse.user;


import jakarta.annotation.PostConstruct;
import lk.ijse.contract.Eat;
import lk.ijse.customannotation.CrispyChicken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mahesh {
    private Eat eat;

    public Mahesh(){
        System.out.println(eat);
    }

    @Autowired
    @Qualifier("Eat")
    @CrispyChicken
    public void setBakeryItems(Eat bakeryItems){
        this.eat = bakeryItems;
    }

    @PostConstruct
    public void init() {
        eat.eat();
    }

}