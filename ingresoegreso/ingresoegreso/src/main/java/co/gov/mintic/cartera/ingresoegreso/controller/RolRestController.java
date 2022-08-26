package co.gov.mintic.cartera.ingresoegreso.controller;

import co.gov.mintic.cartera.ingresoegreso.entity.Rol;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController     // api rest
@RequestMapping("/api")   // solicitud una ruta
public class RolRestController {
    @GetMapping("/rol/{id}") // llama el metodo get dentro de la ruta /api/rol
    public Rol findById(@PathVariable int id) {   // se agrega @PathVariable para que se pueda ingresar la variable id en @getmapping

        Rol rol = new Rol();
        rol.setIdRol(id);
        rol.setDescripcion("admin");
        rol.setEstado(true);
        return rol;
    }

    @GetMapping("/rol")
    public List<Rol> findAll() {   // se llama todos
        List<Rol> roles = new ArrayList<Rol>();
        Rol rol1 = new Rol();
        rol1.setIdRol(1);
        rol1.setDescripcion("admin");
        rol1.setEstado(true);
        roles.add(rol1);
        Rol rol2 = new Rol();
        rol2.setIdRol(2);
        rol2.setDescripcion("User");
        rol2.setEstado(true);
        roles.add(rol2);

        return roles;
    }

    @PostMapping ("/rol")
    public Rol createRol(@RequestBody Rol rol) {

        Rol newrol = new Rol();
        newrol.setIdRol(3);
        newrol.setDescripcion(rol.getDescripcion());
        newrol.setEstado(rol.isEstado());
        return newrol;
}
    @PutMapping("/rol/{id}")
    public Rol updateRol(@PathVariable int id,@RequestBody Rol rol){
        Rol updaterol = findById(id);
        updaterol.setIdRol(id);
        updaterol.setDescripcion(rol.getDescripcion());
        updaterol.setEstado(rol.isEstado());
        return updaterol;
    }
    @DeleteMapping("/rol/{id}")
    public void deleteRol(@PathVariable int id){
        Rol delerol = findById(id);


    }

}
