//package by.ramok.kasbi.controllers;
//
//import by.ramok.kasbi.entities.User;
//import by.ramok.kasbi.exceptions.InternalServerError;
//import by.ramok.kasbi.exceptions.ResourceNotFoundException;
//import by.ramok.kasbi.exceptions.WrongParameters;
//import by.ramok.kasbi.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/1.0/users")
////@CrossOrigin
//public class UserController {
//
//    @Autowired
//    UserService service;
//
//    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
//    public List<User> readAll() {
//        List<User> user = service.getAllUsers();
//        if (user.size() == 0) throw new ResourceNotFoundException();
//        return user;
//    }
//
//    @RequestMapping(value = "{username}", method = RequestMethod.GET, produces = "application/json")
//    public User read(@PathVariable String username) {
//        User user = service.getUserByUsername(username);
//        if (user == null) throw new ResourceNotFoundException();
//        return user;
//    }
//
//    @RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json")
//    public ResponseEntity<User> create(@RequestBody User user) {
//        try {
//            service.createUser(user);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (WrongParameters p) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        } catch (InternalServerError u) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @RequestMapping(value = "", method = RequestMethod.PUT, produces = "application/json")
//    public ResponseEntity<User> update(@RequestBody User user) {
//        try {
//            service.updateUser(user);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (WrongParameters p) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        } catch (InternalServerError u) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @RequestMapping(value = "{username}", method = RequestMethod.DELETE, produces = "application/json")
//    public ResponseEntity<User> delete(@PathVariable String username) {
//        try {
//            service.deleteUser(username);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (WrongParameters p) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        } catch (InternalServerError u) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//}
