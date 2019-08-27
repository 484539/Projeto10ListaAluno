/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // instanciar 10 objetos da class aluno usando o 
        // o construtor cheio
        
        Aluno alun01 = new Aluno (1, "Joao", "111111");
        Aluno alun02 = new Aluno (2, "Andre", "222222");
        Aluno alun03 = new Aluno (3, "Pedro", "333333");
        Aluno alun04 = new Aluno (4, "Luan", "444444");
        Aluno alun05 = new Aluno (5, "Joa", "555555");
        Aluno alun06 = new Aluno (6, "elo", "666666");
        Aluno alun07 = new Aluno (7, "Gabi", "777777");
        Aluno alun08 = new Aluno (8, "Dani", "888888");
        Aluno alun09 = new Aluno (9, "Lucas", "999999");
        Aluno alun10 = new Aluno (10, "Will", "000000");
        
    // Objeto 'listaAlunos' pertence 'a Classe ArrayList
    //instanciando uma lista vazia que só receberá objetos da 
    //classe Aluno
    //Classe TIPADA ArrayList<T>
    
    ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
    
    //ADICIONANDO 10 OBJETOS DA CLASSE Aluno
    //na lista instanciada usando metodo add()
    
    listaAluno.add(alun01);
    listaAluno.add(alun02);
    listaAluno.add(alun03);
    listaAluno.add(alun04);
    listaAluno.add(alun05);
    listaAluno.add(alun06);
    listaAluno.add(alun07);
    listaAluno.add(alun08);
    listaAluno.add(alun09);
    listaAluno.add(alun10);
    
    //listaAluno.add("Aluno11"); Erro - LISTA TIPADA
    //NAO ACEITA 
    //for (int j =11;j<=15;j++){
     //   Aluno objAluno = new Aluno(j, "aluno"+j, "999-0000"+j+j);
    //    listaAluno.add(objAluno);
    //}
    
    
    // NOVOS OBJETOS DEFINIDOS FORA DO FOR
    // TEREMOS A REFERENCIA A UM UNICO OBJETO (GLOBAL)
    
    //nesse caso teremos de colocar o objeto dentro do laço for
    //***** não posso declarar fora do for********
    
    for (int j =11;j<=15;j++){
        Aluno objAluno = new Aluno();
        objAluno.setIdAluno(j);
        objAluno.setNome("novo-aluno"+j);
        objAluno.setCelular("XXX"+j+j);
        listaAluno.add(objAluno);
    }
    
    // LEITURA DOS OBJETOS ADICIONADOS DENTRO DA LISTA
    //USANDO O LAÇO FOR 
    //METODO SIZE() RETORNA O TAMANHO DA LISTA
    // METODO get(index) retorna o elemento da posicao INDEX
    
    //for (int i = 0; i < listaAluno.size(); i++){
    //    System.out.println("Aluno"+listaAluno.get(i).getIdAluno()+ " - "+listaAluno.get(i).getNome());
        
    //}
    
    //****** não devo declarar dentro do laço
    
    Aluno objAluno = new Aluno();
    for (int i = 0; i < listaAluno.size(); i++){
        if(objAluno.getIdAluno()==8){
            System.out.println("Encontrei o "+objAluno.getNome());
        }
        objAluno = listaAluno.get(i);
        System.out.println("ID :"+objAluno.getIdAluno()+ " - "+"Aluno :"+objAluno.getNome()+ " - "+ "Celular : "+objAluno.getCelular());
        
    }

}
}