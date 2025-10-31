package servicios;

import interfaces.IUsuario;
import modelos.Libro;
import modelos.Usuario;

import java.util.List;

public class UsuarioServicio implements IUsuario {
    private List<Usuario> usuarios;

    @Override
    public void registrarUsuario(Usuario usuario) {

    }

    @Override
    public Usuario buscarPorDocumento(String documento) {
        return null;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return List.of();
    }

    private boolean validarCorreo(String correo) {
        return true;
    }

    private boolean existeCedula(String cedula) {
        return true;
    }
}
