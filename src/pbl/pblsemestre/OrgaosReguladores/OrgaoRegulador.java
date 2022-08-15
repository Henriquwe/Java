package pbl.pblsemestre.OrgaosReguladores;

import pbl.pblsemestre.Clubes.Clube;

import java.util.ArrayList;

public interface OrgaoRegulador {
    String nome = "";
    String sigla = "";
    String continente = "";
    ArrayList<Clube> associados = new ArrayList<>();

    default void dadosDaOrganizacao() {
        System.out.println("O nome do orgão é: " + nome);
        System.out.println("Reconhecido pela sigla: " + sigla);
        System.out.println("Gerencia clubes de futebol no continente: " + continente);

        for (Clube associado : associados) {
            System.out.println("Associado:" + associado);
        }
    }

    default void associarClube(Clube clube, String nome, String sigla, String continente) {
        System.out.println("O clube " + nome + "do continente " + continente + "foi associado com sucesso.");
        associados.add(clube);
    }

    default void removerClube(int indice) {
        System.out.println(associados.get(indice));
        associados.remove(indice-1);
        System.out.println("Clube removido!");

    }

    default void multarClube(Clube clube, double multa) {
        System.out.println("Clube:" + clube + "multado em: " + multa + "R$");
        clube.retirarFundos(multa);
    }

    default void premiarClube(Clube clube, double premiacao) {
        System.out.println("Clube:" + clube + "PREMIADO em: " + premiacao + "R$");
        clube.receberFundos(premiacao);
    }
}
