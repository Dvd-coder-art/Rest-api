package dio.web.api.repositore;


import dio.web.api.handler.BusinessException;
import dio.web.api.handler.CampoObrigatorioException;
import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if (usuario.getLogin()==null){
            throw new CampoObrigatorioException("login");
        }if (usuario.getPassword()==null){
            throw new CampoObrigatorioException("password");
        }
        if (usuario.getId()==null){
            System.out.println("Save - Recebendo o usuário na camada de repositório.");
        }else{
            System.out.println("Update - Recebendo o usuário na camada de repositório.");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("Delete/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios= new ArrayList<>();
        usuarios.add(new Usuario("Gleyson", "password"));
        usuarios.add(new Usuario("Frank", "senha"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - recebendo o id: %d para localizar um usuário. ",id));
        return new Usuario("Gleyson", "password");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - recebendo o username: %s para localizar um usuário " + username));
        return new Usuario("Gleyson", "password");
    }

}
