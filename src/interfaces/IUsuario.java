package interfaces;

import modelos.Usuario;

import java.util.List;

public interface IUsuario {
    void registrarUsuario(Usuario usuario);
    Usuario buscarPorDocumento(String documento);
    List<Usuario> listarUsuarios();
}
