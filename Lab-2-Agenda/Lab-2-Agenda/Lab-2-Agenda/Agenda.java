package lp2;

/**
* Representação de uma agenda, toda agenda possui
* lugar para até 100 contatos que recebem suas própias
* informações.
*
* @author Rodrigo Torres Meira - 119110292
*/
public class Agenda {

    /**
    * A lista de contatos da agenda.
    */
    private Contato[] contatos = new Contato[100];

    /**
    * Inicia uma agenda vazia pronta para receber
    * novos contatos
    */
    public Agenda(){

    }

    /**
    * Realiza o cadastro de um novo contato, na posição informada.
    *
    * @param posicao A posicao do contato na agenda.
    * @param nome O nome do contato.
    * @param sobrenome O sobrenome do contato.
    * @param telefone O telefone do contato.
    */
    public void cadastraContato(int posicao, String nome, String sobrenome, String telefone){
        contatos[posicao-1] = new Contato(nome, sobrenome, telefone);
    }

    /**
    * Retorna uma String com todos os contatos da agenda.
    *
    * @return Uma String com os contatos da agenda.
    */
    public String listaContatos() {
        String lista = "\n";

        for (int i = 0; i <= 99; i++) {
            if (contatos[i] != null) {
                lista += (i + 1) + " - " + contatos[i];
            }
        }
        return lista;
    }

    /**
    * Retorna o contato da posição informada.
    * 
    * @param posicao A posição do contato desejado.
    * @return o contato localizado na posição informada.
    */
    public String exibeContato(int posicao) {
        return contatos[posicao-1].getContato();
    }
}