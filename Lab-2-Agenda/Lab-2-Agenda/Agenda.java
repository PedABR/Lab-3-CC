package lp2;

public class Agenda {

    private Contato[] contatos;

    public Agenda(){
        contatos = new Contato[100];
    }

    public void cadastraContato(int posicao, String nome, String sobrenome, String telefone){
        contatos[posicao-1] = new Contato(nome, sobrenome, telefone);
    }

    public String listaContatos() {
        String lista = "\n";

        for (int i = 0; i <= 99; i++) {
            if (contatos[i] != null) {
                lista += (i + 1) + " - " + contatos[i];
            }
        }
        return lista;
    }

    public String exibeContato(int posicao) {
        return contatos[posicao-1].getContato();
    }
}
