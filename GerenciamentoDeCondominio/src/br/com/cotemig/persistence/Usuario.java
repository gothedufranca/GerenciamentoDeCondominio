package br.com.cotemig.persistence;

import javax.swing.JOptionPane;

public class Usuario {
    
    private String user;
    private String senha;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public boolean validarUsuario(Usuario user){
    
    boolean valida = false;
    
    
    return valida;
    
}
    public void MostrarUsuario(){
        JOptionPane.showMessageDialog(null, "Usuário : " + this.getUser() + " Senha : " + this.getSenha());
    }
    
}