package com.example.Register_Login;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
public class UserRepositoryTest 
{
    @Autowired
    private UserRepository repo;
    
    @Test
    public void testCreateUser()	
    {
    	User user=new User();
  	user.setName("Adarsh");
  	user.setEmail("aja@gmail.com");
   	user.setSubject("tuku");
   	user.setMessage("jais");
    	
    	repo.save(user);
    	
	User existUser=repo.findByEmail("aja@gmail.com");
  	  	assertThat(existUser.getName()).isEqualTo(user.getName());
    	
    }
}
