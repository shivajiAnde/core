package org.ass.core;

import com.ass.core.dto.UserDTO;
import com.ass.core.entity.UserEntity;
import com.ass.core.repository.UserRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserEntity user=new UserEntity();
        user.setFirstName("ande");
        user.setLastName("shivaji");
        user.setCourse("java");
        
        UserRepository userRepository=new UserRepository();
        userRepository.saveOrUpdate(user);
        System.out.println("done process");
        
        UserDTO userDto=new UserDTO();
        userDto.setFirstName("moodamaallu");
        userDto.setLastName("venakamala");
        userDto.setCourse("moodnalla mucchata");
        userDto.setAltKey(123);
        userRepository.delete(userDto);
        
        
        
    }
}
