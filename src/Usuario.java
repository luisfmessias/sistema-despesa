import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Usuario {
    private String nome;
    private String login;
    private String senhaCriptografada;

    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senhaCriptografada = criptografarSenha(senha);
    }

    private String criptografarSenha(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(senha.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao criptografar senha", e);
        }
    }

    public boolean autenticar(String login, String senha) {
        return this.login.equals(login) && this.senhaCriptografada.equals(criptografarSenha(senha));
    }

    @Override
    public String toString() {
        return "Usuário: " + nome + " | Login: " + login;
    }
}
