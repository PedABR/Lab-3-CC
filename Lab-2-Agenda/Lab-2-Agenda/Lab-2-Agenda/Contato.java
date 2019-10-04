package lp2;

import java.util.Objects;

/**
* Representação de um contato pertencente a uma agenda, todo
* contato precisa de um nome, sobrenome e telefone, sendo identificado
* pela sua posição na agenda.
* @author Rodrigo Torres Meira - 119110292
*/
public class Contato {

    /**
    * Nome do contato.
    */
    private String nome;

    /**
    * Sobrenome do contato.
    */
    private String sobrenome;

    /**
    * Telefone do contato.
    */
    private String telefone;

    /**
     * Constrói um contato a partir do seu nome, sobrenome e telefone.
     *
     * @param nome o nome do contato
     * @param sobrenome o sobrenome do contato
     * @param telefone o telefone do contato
     */
    public Contato(String nome, String sobrenome, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    /**
     * Retorna uma String com a representação completa de um 
     * contato, feita com nome, sobrenome e seu número.
     *
     * @return a representação completa de um contato
     */
    public String getContato() {
        return "\n" + this.nome + " " + this.sobrenome + " - " + this.telefone + "\n";
    }

    /**
     * Retorna uma String com a representação parcial de um 
     * contato, feita apenas do seu nome e sobrenome.
     *
     * @return a representação em String de um contato
     */
    @Override
    public String toString(){
        return this.nome + " " + this.sobrenome + "\n";
    }

    /**
     * Retorna um boolean que verifica a igualdade entre dois  
     * contatos.
     *
     * @return o valor boolean da comparação de contatos
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome) &&
                Objects.equals(sobrenome, contato.sobrenome);
    }   

    /**
    * Retorna o hash de um contato necessário
    * para a funcionalidade do método ".equals"
    *
    * @return o hash de um contato
    */
    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome);
    }
}
