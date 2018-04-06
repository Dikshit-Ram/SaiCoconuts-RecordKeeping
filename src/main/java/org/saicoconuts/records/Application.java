package org.saicoconuts.records;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        /*
        for(int i = 0; i < 10; i++)
		{
        	Consumer consumer = new Consumer();
            consumer.setName("Consumer " +i);
            consumer.setDebt(10000L);
            
            Transaction transaction = new Transaction();
            transaction.setSale(100L);
            transaction.setPaid(100L);
            HashMap<Type, Integer> coconutQuantites = new HashMap<>();
            coconutQuantites.put(Type.MEDIUM, 10);
            transaction.setCoconutQuantites(coconutQuantites);
            
            consumer.setTransactions(Arrays.asList(transaction));
            
            Address address = new Address();
            address.setLine1("LIG");
            address.setLine2("BHEL");
            address.setCity("Hyderabad");
            address.setState("TG");
            address.setZipcode(502032);
		}
        */
    }
}
