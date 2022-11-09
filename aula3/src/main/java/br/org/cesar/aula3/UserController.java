package br.org.cesar.aula3;

import org.apache.catalina.realm.JNDIRealm.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String getUser(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "idade") int idade) {
        return "usuario " + name + " com " + idade + " anos.";
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable(value = "id") int id) {
        return new User(id, "gerson", "123456789", "12345678");
    }

    @GetMapping("/user/path/{id}")
    public String getUserPathById(@PathVariable(value = "id") String id,
            @PathVariable(value = "name") String name) {
        if (id.equalsIgnoreCase("47fec212dbed34b2e0cd86e9377b7dfc")) {
            return "autenticado";
        }
        return "usuario
}
}
}