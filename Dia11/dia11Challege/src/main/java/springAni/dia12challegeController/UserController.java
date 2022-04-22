package springAni.dia12challegeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import springAni.dia12challegeException.ResourceNotFoundException;
import springAni.dia12challegeModel.User;
import springAni.dia12challegeRepository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/apires/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @GetMapping("/{dni}")
    public User getUserById(@PathVariable ( "dni") Integer userDni) {
        return this.userRepository.findById(userDni).orElseThrow(() -> new ResourceNotFoundException("User not found with id :" + userDni));
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return this.userRepository.save(user);
    }

    @PutMapping("/{dni}")
    public User updateUser(@RequestBody User user, @PathVariable ("dni") Integer userDni) {
        User addUsers = this.userRepository.findById(userDni)
                .orElseThrow(() -> new ResourceNotFoundException("Error id not Found" + userDni));
        addUsers.setNombre(user.getNombre());
        addUsers.setApellido(user.getApellido());
        addUsers.setDireccion(user.getDireccion());
        return this.userRepository.save(addUsers);
    }

    @DeleteMapping("/{dni}")
    public ResponseEntity<User> deleteUser(@PathVariable("id") Integer userDni){
        User existingUser = this.userRepository.findById(userDni)
                .orElseThrow(() -> new ResourceNotFoundException("Error id not Found:" + userDni));
        this.userRepository.delete(existingUser);
        return ResponseEntity.ok().build();
    }
}

    //@Autowired
    //Metodo GET =>GetMapping
    //Metodo POST =>PostMapping
    //Metodo PUT =>PutMapping
    //Metodo DELETE =>DeleteMapping
    ///METODO GET CON PARAMETROS: GetMapping("ruta/{parametro}")
    ///PARAMETRO EN LA FUNCION: @PathVariable("parametro") //recibimos el parametro
    ///(@RequestBody Modelo)

