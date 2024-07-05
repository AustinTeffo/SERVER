package com.example.Server.Service;

import com.example.Server.Models.User;
import com.example.Server.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersService {

    private final Repo usersRepo;

    @Autowired
    public UsersService(Repo usersRepo){
        this.usersRepo = usersRepo;
    }

    public User addSUser(User user){

        return usersRepo.save(user);

    }

    public User deleteUsers(Integer id){
        if(usersRepo.existsById(id)){
            User user = usersRepo.findById(id).get();
            usersRepo.delete(user);
            return user;
        }
        return null;
    }

    //    public String upDateBalance(Integer id,Integer amount){
//        if(usersRepo.existsById(id)){
//            Optional<Student> student = usersRepo.findById(id);
//            Integer updatedAmount  = student.get().getBalance()+amount;
//            student.get().setBalance(updatedAmount);
//
//            return "Updated successfully Your new balance is "+student.get().getBalance();
//        }
//        return "Error Student was not found";
//    }
    public Integer upDateBalance(Integer id,Integer amount){
        if(usersRepo.existsById(id)){
            Optional<User> user = usersRepo.findById(id);
            Integer updatedAmount = user.get().getMedicalaidbalance()+amount;
            user.get().setMedicalaidbalance(updatedAmount);
            return updatedAmount;
        }
        return null;
    }
    public User upDateUsers(Integer id, User currentUser){

        if(usersRepo.existsById(id)){
            Optional<User> users = usersRepo.findById(id);
            if(users.isPresent()){
                users.get().setAge(currentUser.getAge());
                users.get().setName(currentUser.getName());
                users.get().setSurname(currentUser.getSurname());
                users.get().setAccountnumber(currentUser.getAccountnumber());
                users.get().setAddress(currentUser.getAddress());
                users.get().setCarinsurancetype(currentUser.getCarinsurancetype());
                users.get().setEmail(currentUser.getEmail());
                users.get().setMedicalaidbalance(currentUser.getMedicalaidbalance());
                users.get().setPassword(currentUser.getPassword());
                users.get().setPhone(currentUser.getPhone());
                users.get().setMedicalaidnumber(currentUser.getMedicalaidnumber());
                users.get().setMedicalaidtype(currentUser.getMedicalaidtype());
            }
            System.out.println(users.get().toString());
            usersRepo.save(users.get());
            return users.get();
        }else{
            return null;
        }
    }

    public Iterable<User> getAllStudents(){
        return usersRepo.findAll();
    }

}
