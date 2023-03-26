public class Estabelecimento implements Cloneable {
    private int numero;
    private String nome;
    private Proprietario proprietario;

    public Estabelecimento(int numero, String nome, Proprietario proprietario) {
        this.numero = numero;
        this.nome = nome;
        this.proprietario = proprietario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public Estabelecimento clone() throws CloneNotSupportedException {
        var clone = (Estabelecimento) super.clone();
        clone.proprietario = clone.proprietario.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "Estabelecimento{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", proprietario=" + proprietario +
                '}';
    }
}
