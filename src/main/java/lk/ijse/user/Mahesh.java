package lk.ijse.user;

import lk.ijse.aop.Transaction;
import lk.ijse.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Mahesh {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();
        Transaction transaction = (Transaction) ctx.getBean("transaction");
        transaction.startTransaction();
        transaction.endTransaction();
        ctx.registerShutdownHook();
    }
}