package pbl.pblsemestre;

import pbl.pblsemestre.clubes.Clube;
import pbl.pblsemestre.empregados.Jogador;
import pbl.pblsemestre.empregados.Tecnico;
import pbl.pblsemestre.orgaosreguladores.CBF;

import java.util.Scanner;

public class FootballManager {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)){
            Boolean on = true;
            while (on) {
                CBF cbf = new CBF("Confederação Brasileira", "CBF", "BR", 899000);
                Clube arsenal = new Clube("Arsenal", "ARS", 5646846, "Não sei");
                Tecnico Abel = new Tecnico("Abel Ferreira", 556944);
                Jogador Veiga = new Jogador("Rony Rústico", "Brasilian", 449854, 20);

                System.out.println("""
                        Opções: \s
                        [1] Criar um Orgão Regulador derivado da CBF \s
                        [2] Criar um clube (Palmeiras) \s
                        [3] Menu de opções do orgão regulador \s
                        [4] Menu de opções do clube \s
                        [5] Declarar um técnico (Abel Ferreira) \s
                        [6] Declarar um jogador (Rony Rústico) \s
                        [7] Menu de opções do técnico \s
                        [8] Menu de opções do jogador \s
                        [9] Sair do programa \s
                        """);
                int opcao = scan.nextInt();

                switch (opcao) {
                    case 1:
                        CBF CampeonatoPaulista = new CBF("Campeonato Paulista", "FPF", "BR",
                                123665);
                        System.out.println("Orgão: " + CampeonatoPaulista + " criado com sucesso.");
                        break;

                    case 2:
                        Clube Palmeiras = new Clube("Palmeiras", "SEP", 12565451, "Abel Ferreira");
                        System.out.println("Clube: " + Palmeiras + " criado com sucesso.");
                        break;

                    case 3:
                        System.out.println("""
                                Opções: \s
                                [1] Mostrar dados do orgão regulador \s
                                [2] Associar clube \s
                                [3] Remover clube \s
                                [4] Multar clube \s
                                [5] Premiar clube \s
                                [6] Voltar \s
                                """);
                        opcao = scan.nextInt();

                        switch (opcao) {
                            case 1:
                                cbf.dadosDaOrganizacao();
                                break;
                            case 2:
                                cbf.associarClube(arsenal, "Arsenal", "ARS", "Inglaterra");
                                break;
                            case 3:
                                cbf.removerClube(-1);
                                break;
                            case 4:
                                cbf.multarClube(arsenal, 59999);
                                break;
                            case 5:
                                cbf.premiarClube(arsenal, 89489898);
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("Opção inválida, tente novamente.");
                        }
                        break;

                    case 4:
                        System.out.println("""
                                Opções: \s
                                [1] Adicionar titular \s
                                [2] Adicionar reserva \s
                                [3] Adicionar fundos \s
                                [4] Remover fundos \s
                                [5] Contratar um técnico \s
                                [6] Voltar \s
                                """);
                        opcao = scan.nextInt();

                        switch (opcao) {
                            case 1:
                                arsenal.adicionarTitular("Ozzyl", "Chinês", 788789789, 91);
                                break;
                            case 2:
                                arsenal.adicionarReservas("Raphael Veiga", "Uruguaio",
                                        444441, 12);
                                break;
                            case 3:
                                arsenal.receberFundos(456666);
                                break;
                            case 4:
                                arsenal.retirarFundos(50001);
                                break;
                            case 5:
                                arsenal.contratarTecnico("Abel Ferreira", 91123);
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("Opção inválida, tente novamente.");
                                break;
                        }
                        break;

                    case 5:
                        Tecnico AbelFerreira = new Tecnico("Abel Ferreira", 556944);
                        break;

                    case 6:
                        Jogador RonyRustico = new Jogador("Rony Rústico",
                                "Brasilian", 449854, 20);
                        break;


                    case 7:
                        System.out.println("Preguiça de fazer o restante, vou apenas demonstrar");
                        Abel.assinarPatrocinio("Disney", 5551);
                        Abel.associarClube(arsenal, "Arsenal", 4999999);
                        Abel.darEntrevista();
                        break;


                    case 8:
                        System.out.println("Preguiça de fazer o restante, vou apenas demonstrar");
                        Veiga.assinarPatrocinio("Nestle", 1111212);
                        Veiga.associarClube(arsenal, "Arsenal", 9999999);
                        break;

                    case 9:
                        on = false;
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente!");
                }
            }
        } catch (Exception ex) {
            ex.getCause();
            ex.printStackTrace();
        }
    }
}
