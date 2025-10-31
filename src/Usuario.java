public class Usuario {
    private String nome;
    private String login;
    private String senhaCriptografada;

    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senhaCriptografada = criptografar(senha);
    }

    private String criptografar(String senha) {
        return Integer.toHexString(senha.hashCode());
    }

    public String getLogin() {
        return login;
    }

    public boolean validarSenha(String senha) {
        return this.senhaCriptografada.equals(Integer.toHexString(senha.hashCode()));
    }

    @Override
    public String toString() {
        return "Usuário: " + nome + " | Login: " + login;
    }
}
