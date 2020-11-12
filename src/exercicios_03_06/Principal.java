package exercicios_03_06;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		ListaDeAlunos lista_alunos = new ListaDeAlunos();
		ListaDeDisciplinas lista_dis = new ListaDeDisciplinas();
		ListaDeMedias Lista_med = new ListaDeMedias();
		
		int idAluno = 1;
		int idDisciplina = 10;
		double media;
		String nome, curso, semestre;
		
		int opc = -1;
		while(opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Opção: " + "\n"
		+ "1 - Inserir Novo Aluno" + "\n"
		+ "2 - Inserir Nova Disciplina" + " \n"
		+ "3 - Inserir Média Final" + "\n"
		+ "4 - Listar as Médias dos Alunos" + "\n"
		+ "5 - Quantidade de Alunos com Média >=8" + "\n"
		+ "9 - Sair do Sistema" + "\n"));
		
		
		switch(opc) {
			case 1:
				nome = JOptionPane.showInputDialog("Nome do Aluno: ");
				curso = JOptionPane.showInputDialog("Nome do Curso: ");
				semestre = JOptionPane.showInputDialog("Semestre do Aluno: ");
				Aluno aluno = new Aluno(idAluno, nome, curso, semestre);
				idAluno+=2;
				lista_alunos.inserirFinal(aluno);
				break;
			
			case 2:
				nome = JOptionPane.showInputDialog("Nome da Disciplina: ");
				Disciplina dis = new Disciplina(idDisciplina, nome);
				idDisciplina+=2;
				lista_dis.inserirFinal(dis);
				break;
				
			case 3:
				if(lista_dis.isEmpty()) {
					System.out.println("Não há nenhuma disciplina no sistema. Por favor, cadastre uma disciplina.");
					break;
				}
				
				if(lista_alunos.isEmpty()) {
					System.out.println("Não há nenhum aluno no sistema. Por favor, adicione um aluno.");
					break;
				}
				
				lista_alunos.mostraLista();
				int idA = Integer.parseInt(JOptionPane.showInputDialog(null, "Os nomes e ids dos alunos estão disponibilizados no console." + "\n" + 
				"Por favor, digite o ID do aluno"));
				lista_dis.mostraLista();
				int idD = Integer.parseInt(JOptionPane.showInputDialog(null, "Os nomes e ids das disciplinas estão disponibilizados no console." + "\n" + 
						"Por favor, digite o ID da disciplina"));
				media = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a média do aluno (use ponto, não vírgula):"));
				Media med = new Media(idA, idD, media);
				Lista_med.inserirFinal(med);
				break;
				
			case 4:
				if(Lista_med.isEmpty()) {
					System.out.println("Não há médias inseridas no sistema!");
					break;
				}
				int sort = Integer.parseInt(JOptionPane.showInputDialog("Você quer ordenar por: \n 1 - Merge Sort \n 2 - Quick Sort" ));
				Lista_med.ordenaLista(sort);
				Lista_med.mostraLista();
				break;
				
			case 5:
				Lista_med.mediaMaiorQueOito();
				break;
				
			case 9:
				System.out.println("FINALIZADO!");
				break;
				
			default:
				System.out.println("Valor inválido. Tente novamente");
				break;
				
		}	
				
		}
	}

}
