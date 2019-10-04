package lp2;

import java.util.Objects;

public class Contato {

    private String nome;
    private String sobrenome;
    private String telefone;


    public Contato(String nome, String sobrenome, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    /**
     * @return
     */
    public String getContato() {
        return "\n" + this.nome + " " + this.sobrenome + " - " + this.telefone + "\n";
    }

    @Override
    public String toString(){
        return this.nome + " " + this.sobrenome + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome) &&
                Objects.equals(sobrenome, contato.sobrenome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome);
    }
}
