package pbl.pblsemestre.OrgaosReguladores;

import pbl.pblsemestre.Clubes.Clube;

import java.util.ArrayList;

public class FIFA implements OrgaoRegulador {
    private String nome;
    private String sigla;
    private String continente;
    private double faturamento;
    private ArrayList<Clube> associados;

    public FIFA(String nome, String sigla, String continente, double faturamento) {
        this.nome = nome;
        this.sigla = sigla;
        this.continente = continente;
        this.faturamento = faturamento;

        associados = new ArrayList<>();
    }

    @Override
    public void dadosDaOrganizacao() {
        System.out.println(nome + "É um orgão regulador do continente " + continente + "Reconhecida pela sigla" +
                sigla + "e possui um faturamento de: " + faturamento);
        System.out.println("Atualmente possuí os seguintes clubes associados:");

        for (Clube associado : associados) {
            System.out.println("Associado:" + associado);
        }
    }

    public void associarClube(Clube clube, String nome, String sigla, String continente) {
        System.out.println("O clube " + nome + "do continente " + continente + "foi associado com sucesso.");
        associados.add(clube);
    }

    public void removerClube(int indice) {
        System.out.println(associados.get(indice));
        associados.remove(indice-1);
        System.out.println("Clube removido!");
    }

    public void multarClube(Clube clube, double multa) {
        System.out.println("Clube:" + clube + "multado em: " + multa + "R$");
        clube.retirarFundos(multa);
    }

    public void premiarClube(Clube clube, double premiacao) {
        System.out.println("Clube:" + clube + "PREMIADO em: " + premiacao + "R$");
        clube.receberFundos(premiacao);
    }
}
