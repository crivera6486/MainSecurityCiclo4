package BackendSecurity.Ciclo4.Grupo2.MainSecurityCiclo4.controladores;

import BackendSecurity.Ciclo4.Grupo2.MainSecurityCiclo4.modelos.Rol;
import BackendSecurity.Ciclo4.Grupo2.MainSecurityCiclo4.repositorios.RepositorioRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/roles")

public class ControladorRol {
    @Autowired
    private RepositorioRol repositorioRol;
    @GetMapping("")
    public List<Rol> index(){
        return this.repositorioRol.findAll();

    }
}
