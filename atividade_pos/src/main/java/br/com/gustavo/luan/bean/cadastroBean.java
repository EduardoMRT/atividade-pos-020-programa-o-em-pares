package br.com.gustavo.luan.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.gustavo.luan.dao.UsuarioDAO;
import br.com.gustavo.luan.domain.Usuario;
import lombok.Getter;
import lombok.Setter;

@ManagedBean(name = "MBCadastro")
@ViewScoped
public class cadastroBean implements Serializable {
	@Getter @Setter	
    private Usuario usuario;
	@Getter @Setter	
    private String senha;
    
    

    // Método de Registro
    public String cadastrar() {
         UsuarioDAO userDao = new UsuarioDAO();
         userDao.save(usuario);
        
        FacesContext.getCurrentInstance().addMessage(null,
            new FacesMessage("Usuário registrado com sucesso!"));
        return "login?faces-redirect=true"; // Redireciona para a página de login
    }
}
