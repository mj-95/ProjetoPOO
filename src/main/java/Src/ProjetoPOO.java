/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Src;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class ProjetoPOO extends javax.swing.JFrame {
    
    /**
     *
     */
    protected ArrayList <Pessoa> pessoas;

    /**
     *
     */
    protected Projeto projetoSelec;

    /**
     *
     */
    protected ArrayList <Projeto> projetos;

    /**
     *
     */
    protected ArrayList <String> auxPessoas[];
    
    /**
     *
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public ProjetoPOO() throws IOException, ClassNotFoundException {
        pessoas = new ArrayList<>();
        projetos = new ArrayList<>();
        lerPessoas(pessoas);
        
        try{
            lerProjObj();
        }
        catch(NullPointerException | IOException e) {
            projetos = new ArrayList<>();
        }
        initComponents();
    }
    
    /**
     *
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void lerProjObj() throws IOException, ClassNotFoundException{
        FicheirosDeObjetos proj = new FicheirosDeObjetos();
        proj.abreLeitura("Proj.ser");
        projetos = (ArrayList<Projeto>) proj.leObjeto();
        proj.fechaLeitura();
    }
    
    /**
     *
     * @throws IOException
     */
    public void escrevePessoas() throws IOException{
        FicheiroDeTexto pes = new FicheiroDeTexto();
        pes.abreEscrita("FichPessoas.txt");
        String aux;
        Licenciado lic;
        Mestrado mes;
        Doutorado dou;
        Docente doc;
        for(int i=0;i<pessoas.size();i++){
            aux = "";
            if(pessoas.get(i).getTipo().equals("B")){
                if(pessoas.get(i).getTipoBols().equals("L")){
                    lic = (Licenciado)pessoas.get(i);
                    aux+= lic.getNome() + ";";
                    aux+= lic.getEmail() + ";";
                    aux+= "B" + "/";
                    aux+= lic.getDataInicBolsa().getDia() + ":" + lic.getDataInicBolsa().getMes() + ":" + lic.getDataInicBolsa().getAno() + ";";
                    aux+= lic.getDataFinBolsa().getDia() + ":" + lic.getDataFinBolsa().getMes() + ":" + lic.getDataFinBolsa().getAno() + ";";
                    aux+= lic.getCustoProjeto() + ";";
                    aux+= "L" + "/";
                    if(lic.getDocentes().isEmpty()){
                        aux+= " /";
                    }
                    else{
                        for(int j=0;j<lic.getDocentes().size();j++){
                            if(j==lic.getDocentes().size()-1){
                                aux+= lic.getDocentes().get(j) +"/";
                                break;
                            }
                            aux+= lic.getDocentes().get(j) +";";
                        }
                    }
                }
                else if(pessoas.get(i).getTipoBols().equals("M")){
                    mes = (Mestrado)pessoas.get(i);
                    aux+= mes.getNome() + ";";
                    aux+= mes.getEmail() + ";";
                    aux+= "B" + "/";
                    aux+= mes.getDataInicBolsa().getDia() + ":" + mes.getDataInicBolsa().getMes() + ":" + mes.getDataInicBolsa().getAno() + ";";
                    aux+= mes.getDataFinBolsa().getDia() + ":" + mes.getDataFinBolsa().getMes() + ":" + mes.getDataFinBolsa().getAno() + ";";
                    aux+= mes.getCustoProjeto() + ";";
                    aux+= "M" + "/";
                    if(mes.getDocentes().isEmpty()){
                        aux+= " /";
                    }
                    else{
                        for(int j=0;j<mes.getDocentes().size();j++){
                            if(j==mes.getDocentes().size()-1){
                                aux+= mes.getDocentes().get(j) +"/";
                                break;
                            }
                            aux+= mes.getDocentes().get(j) +";";
                        }
                    }
                }
                else if(pessoas.get(i).getTipoBols().equals("Dou")){
                    dou = (Doutorado)pessoas.get(i);
                    aux+= dou.getNome() + ";";
                    aux+= dou.getEmail() + ";";
                    aux+= "B" + "/";
                    aux+= dou.getDataInicBolsa().getDia() + ":" + dou.getDataInicBolsa().getMes() + ":" + dou.getDataInicBolsa().getAno() + ";";
                    aux+= dou.getDataFinBolsa().getDia() + ":" + dou.getDataFinBolsa().getMes() + ":" + dou.getDataFinBolsa().getAno() + ";";
                    aux+= dou.getCustoProjeto() + ";";
                    aux+= "D" + "/";
                }
            }
            else if(pessoas.get(i).getTipo().equals("Doc")){
                doc = (Docente)pessoas.get(i);
                aux+= doc.getNome() + ";";
                aux+= doc.getEmail() + ";";
                aux+= "D" + "/";
                aux+= doc.getnMecanografico()+";";
                aux+= doc.getAreaInvestigacao() +"/";
                }
            pes.escreveLinha(aux);
        }
        pes.fechaEscrita();
    }

    /**
     *
     * @throws IOException
     */
    public void save() throws IOException {
        FicheirosDeObjetos proj = new FicheirosDeObjetos();
        proj.abreEscrita("Proj.ser");
        proj.escreveObjeto(projetos);
        proj.fechaEscrita();
        escrevePessoas();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPrincipal = new javax.swing.JPanel();
        Título = new javax.swing.JLabel();
        CriarProj = new javax.swing.JButton();
        ProjNaoConc = new javax.swing.JButton();
        ProjConc = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        ProcurarProj = new javax.swing.JButton();
        ProcurarProjeto = new javax.swing.JPanel();
        Título1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ProcurarProjetoNome = new javax.swing.JComboBox<>();
        VoltarProcurarProj = new javax.swing.JButton();
        SeguinteProcurarProj = new javax.swing.JButton();
        AlterarTarefa = new javax.swing.JPanel();
        TituloTarefa = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        VoltarAlterarTarefa = new javax.swing.JButton();
        SubAlterarTarefa = new javax.swing.JButton();
        ProgressoTarefa = new javax.swing.JProgressBar();
        jLabel22 = new javax.swing.JLabel();
        AlteraTaxa = new javax.swing.JTextField();
        ResponsavelTarefa = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        ResponsavelTarefaAtual = new javax.swing.JLabel();
        MenuProjNaoConc = new javax.swing.JPanel();
        TituloProj = new javax.swing.JLabel();
        FimProjBotao = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        AreaCusto = new javax.swing.JLabel();
        VoltarFimProj = new javax.swing.JButton();
        NovaTarefaBotao = new javax.swing.JButton();
        EliminarTarefaBotao = new javax.swing.JButton();
        AlterarTarefaBotao = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        ListaTarefas = new javax.swing.JList<>();
        EscolherEstadoTarefa = new javax.swing.JComboBox<>();
        OkEscolherEstadoTarefa = new javax.swing.JButton();
        MenuProjConc = new javax.swing.JPanel();
        TituloProj2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        VoltarProjConc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        InformacaoProj = new javax.swing.JTextArea();
        ListarProjNaoConc = new javax.swing.JPanel();
        TituloListaNaoConc = new javax.swing.JLabel();
        VoltarListaNaoConc = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        NomeListaNaoConc = new javax.swing.JTextArea();
        ListarProjConc = new javax.swing.JPanel();
        TituloListaConc = new javax.swing.JLabel();
        VoltarListaConc = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        NomeListaConc = new javax.swing.JTextArea();
        CriarProjeto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cpNome = new javax.swing.JTextField();
        cpAcronimo = new javax.swing.JTextField();
        cpDiaIn = new javax.swing.JTextField();
        cpDuracaoprev = new javax.swing.JTextField();
        VoltarCriarProj = new javax.swing.JButton();
        SeguinteCriarProj = new javax.swing.JButton();
        cpMesIn = new javax.swing.JTextField();
        cpAnoIn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CriarTarefa = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        NomeTarefa = new javax.swing.JTextField();
        ctDia = new javax.swing.JTextField();
        ctDuracaoprev = new javax.swing.JTextField();
        VoltarCriarTarefa = new javax.swing.JButton();
        SeguinteCriarTarefa = new javax.swing.JButton();
        ctMes = new javax.swing.JTextField();
        ctAno = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        TipoTarefaCriar = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        CriarProjeto2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        addInvPrinc = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        invest = new javax.swing.JScrollPane();
        addInvest = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        addBols = new javax.swing.JList<>();
        SeguinteCriarProjeto2 = new javax.swing.JButton();
        VoltarCriarProjeto2 = new javax.swing.JButton();
        CriarProjeto3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        SelecBolseiro = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SelecOrientador = new javax.swing.JScrollPane();
        SelecOrientadorLista = new javax.swing.JList<>();
        FinalizarCriarProjeto = new javax.swing.JButton();
        VoltarCriarProjeto3 = new javax.swing.JButton();
        ConfirmarOrientador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        MenuPrincipal.setPreferredSize(new java.awt.Dimension(700, 500));

        Título.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Título.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Título.setText("Menu Principal");

        CriarProj.setText("Criar um projeto");
        CriarProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarProjActionPerformed(evt);
            }
        });

        ProjNaoConc.setText("Lista de Projetos não Concluidos");
        ProjNaoConc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProjNaoConcActionPerformed(evt);
            }
        });

        ProjConc.setText("Lista de projetos Concluidos");
        ProjConc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProjConcActionPerformed(evt);
            }
        });

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        ProcurarProj.setText("Procurar projeto");
        ProcurarProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcurarProjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPrincipalLayout = new javax.swing.GroupLayout(MenuPrincipal);
        MenuPrincipal.setLayout(MenuPrincipalLayout);
        MenuPrincipalLayout.setHorizontalGroup(
            MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Título, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(261, Short.MAX_VALUE)
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ProjConc, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProjNaoConc, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CriarProj, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProcurarProj, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(258, 258, 258))
        );
        MenuPrincipalLayout.setVerticalGroup(
            MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Título, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(CriarProj)
                .addGap(35, 35, 35)
                .addComponent(ProcurarProj)
                .addGap(36, 36, 36)
                .addComponent(ProjNaoConc)
                .addGap(31, 31, 31)
                .addComponent(ProjConc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(Sair)
                .addContainerGap())
        );

        getContentPane().add(MenuPrincipal, "card2");

        ProcurarProjeto.setPreferredSize(new java.awt.Dimension(700, 500));

        Título1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Título1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Título1.setText("Procurar Projeto");

        jLabel15.setText("Selecionar Projeto:");

        ProcurarProjetoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcurarProjetoNomeActionPerformed(evt);
            }
        });

        VoltarProcurarProj.setText("Voltar");
        VoltarProcurarProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarProcurarProjActionPerformed(evt);
            }
        });

        SeguinteProcurarProj.setText("Seguinte");
        SeguinteProcurarProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeguinteProcurarProjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProcurarProjetoLayout = new javax.swing.GroupLayout(ProcurarProjeto);
        ProcurarProjeto.setLayout(ProcurarProjetoLayout);
        ProcurarProjetoLayout.setHorizontalGroup(
            ProcurarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProcurarProjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Título1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ProcurarProjetoLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProcurarProjetoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(ProcurarProjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VoltarProcurarProj, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SeguinteProcurarProj, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ProcurarProjetoLayout.setVerticalGroup(
            ProcurarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProcurarProjetoLayout.createSequentialGroup()
                .addGroup(ProcurarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProcurarProjetoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Título1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProcurarProjetoLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(ProcurarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(ProcurarProjetoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                .addGroup(ProcurarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VoltarProcurarProj)
                    .addComponent(SeguinteProcurarProj))
                .addContainerGap())
        );

        getContentPane().add(ProcurarProjeto, "card4");

        AlterarTarefa.setPreferredSize(new java.awt.Dimension(700, 500));

        TituloTarefa.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        TituloTarefa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel20.setText("Atualizar Taxa de Execução:");

        VoltarAlterarTarefa.setText("Voltar");

        SubAlterarTarefa.setText("Submeter Alterações");
        SubAlterarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubAlterarTarefaActionPerformed(evt);
            }
        });

        ProgressoTarefa.setForeground(new java.awt.Color(153, 0, 204));
        ProgressoTarefa.setToolTipText("");
        ProgressoTarefa.setName(""); // NOI18N

        jLabel22.setText("Responsável pela Tarefa:");

        AlteraTaxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlteraTaxaActionPerformed(evt);
            }
        });

        ResponsavelTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResponsavelTarefaActionPerformed(evt);
            }
        });

        jLabel11.setText("Alterar Responsável:");

        javax.swing.GroupLayout AlterarTarefaLayout = new javax.swing.GroupLayout(AlterarTarefa);
        AlterarTarefa.setLayout(AlterarTarefaLayout);
        AlterarTarefaLayout.setHorizontalGroup(
            AlterarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlterarTarefaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AlterarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloTarefa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(AlterarTarefaLayout.createSequentialGroup()
                        .addComponent(VoltarAlterarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SubAlterarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(AlterarTarefaLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(AlterarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlterarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ProgressoTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AlterarTarefaLayout.createSequentialGroup()
                            .addGroup(AlterarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(AlterarTarefaLayout.createSequentialGroup()
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlterarTarefaLayout.createSequentialGroup()
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(248, 248, 248)))
                            .addGroup(AlterarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(AlteraTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ResponsavelTarefaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(ResponsavelTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AlterarTarefaLayout.setVerticalGroup(
            AlterarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlterarTarefaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ProgressoTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(AlterarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(AlteraTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(AlterarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(ResponsavelTarefaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AlterarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlterarTarefaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(AlterarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VoltarAlterarTarefa)
                            .addComponent(SubAlterarTarefa)))
                    .addGroup(AlterarTarefaLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResponsavelTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 123, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(AlterarTarefa, "card4");

        MenuProjNaoConc.setPreferredSize(new java.awt.Dimension(700, 500));

        TituloProj.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        TituloProj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        FimProjBotao.setText("Terminar Projeto");
        FimProjBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FimProjBotaoActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Custo total do Projeto:");

        AreaCusto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        VoltarFimProj.setText("Voltar");
        VoltarFimProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarFimProjActionPerformed(evt);
            }
        });

        NovaTarefaBotao.setText("Nova Tarefa");
        NovaTarefaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovaTarefaBotaoActionPerformed(evt);
            }
        });

        EliminarTarefaBotao.setText("Eliminar Tarefa");
        EliminarTarefaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarTarefaBotaoActionPerformed(evt);
            }
        });

        AlterarTarefaBotao.setText("Alterar Tarefa");
        AlterarTarefaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarTarefaBotaoActionPerformed(evt);
            }
        });

        ListaTarefas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(ListaTarefas);

        EscolherEstadoTarefa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Tarefas por inicializar", "Tarefas não Concluídas na data Estimada", "Tarefas Concluídas" }));
        EscolherEstadoTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscolherEstadoTarefaActionPerformed(evt);
            }
        });

        OkEscolherEstadoTarefa.setText("OK");

        javax.swing.GroupLayout MenuProjNaoConcLayout = new javax.swing.GroupLayout(MenuProjNaoConc);
        MenuProjNaoConc.setLayout(MenuProjNaoConcLayout);
        MenuProjNaoConcLayout.setHorizontalGroup(
            MenuProjNaoConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuProjNaoConcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuProjNaoConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloProj, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(MenuProjNaoConcLayout.createSequentialGroup()
                        .addComponent(VoltarFimProj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FimProjBotao)))
                .addContainerGap())
            .addGroup(MenuProjNaoConcLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(MenuProjNaoConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuProjNaoConcLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                        .addGroup(MenuProjNaoConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AreaCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MenuProjNaoConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NovaTarefaBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EliminarTarefaBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AlterarTarefaBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MenuProjNaoConcLayout.createSequentialGroup()
                        .addGroup(MenuProjNaoConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(MenuProjNaoConcLayout.createSequentialGroup()
                                .addComponent(EscolherEstadoTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OkEscolherEstadoTarefa))
                            .addComponent(jScrollPane6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(120, 120, 120))
        );
        MenuProjNaoConcLayout.setVerticalGroup(
            MenuProjNaoConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuProjNaoConcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloProj, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(MenuProjNaoConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EscolherEstadoTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkEscolherEstadoTarefa))
                .addGap(27, 27, 27)
                .addGroup(MenuProjNaoConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuProjNaoConcLayout.createSequentialGroup()
                        .addComponent(NovaTarefaBotao)
                        .addGap(18, 18, 18)
                        .addComponent(AlterarTarefaBotao)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarTarefaBotao)
                        .addGap(0, 119, Short.MAX_VALUE))
                    .addComponent(jScrollPane6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuProjNaoConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(AreaCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(MenuProjNaoConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VoltarFimProj)
                    .addComponent(FimProjBotao))
                .addContainerGap())
        );

        getContentPane().add(MenuProjNaoConc, "card7");

        MenuProjConc.setPreferredSize(new java.awt.Dimension(700, 500));

        TituloProj2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        TituloProj2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Custo total do Projeto:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        VoltarProjConc.setText("Voltar");

        InformacaoProj.setColumns(20);
        InformacaoProj.setRows(5);
        jScrollPane1.setViewportView(InformacaoProj);

        javax.swing.GroupLayout MenuProjConcLayout = new javax.swing.GroupLayout(MenuProjConc);
        MenuProjConc.setLayout(MenuProjConcLayout);
        MenuProjConcLayout.setHorizontalGroup(
            MenuProjConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuProjConcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloProj2, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(MenuProjConcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VoltarProjConc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MenuProjConcLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(MenuProjConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuProjConcLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MenuProjConcLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
        );
        MenuProjConcLayout.setVerticalGroup(
            MenuProjConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuProjConcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloProj2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuProjConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(VoltarProjConc)
                .addContainerGap())
        );

        getContentPane().add(MenuProjConc, "card6");

        ListarProjNaoConc.setPreferredSize(new java.awt.Dimension(700, 500));

        TituloListaNaoConc.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        TituloListaNaoConc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloListaNaoConc.setText("Projetos Não Concluídos na Data Estimada");

        VoltarListaNaoConc.setText("Voltar");

        NomeListaNaoConc.setColumns(20);
        NomeListaNaoConc.setRows(5);
        jScrollPane4.setViewportView(NomeListaNaoConc);

        javax.swing.GroupLayout ListarProjNaoConcLayout = new javax.swing.GroupLayout(ListarProjNaoConc);
        ListarProjNaoConc.setLayout(ListarProjNaoConcLayout);
        ListarProjNaoConcLayout.setHorizontalGroup(
            ListarProjNaoConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarProjNaoConcLayout.createSequentialGroup()
                .addGroup(ListarProjNaoConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListarProjNaoConcLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TituloListaNaoConc, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                    .addGroup(ListarProjNaoConcLayout.createSequentialGroup()
                        .addGroup(ListarProjNaoConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ListarProjNaoConcLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(VoltarListaNaoConc))
                            .addGroup(ListarProjNaoConcLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ListarProjNaoConcLayout.setVerticalGroup(
            ListarProjNaoConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarProjNaoConcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloListaNaoConc, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(VoltarListaNaoConc)
                .addContainerGap())
        );

        getContentPane().add(ListarProjNaoConc, "card6");

        ListarProjConc.setPreferredSize(new java.awt.Dimension(700, 500));

        TituloListaConc.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        TituloListaConc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloListaConc.setText("Projetos Concluídos");

        VoltarListaConc.setText("Voltar");

        NomeListaConc.setColumns(20);
        NomeListaConc.setRows(5);
        jScrollPane2.setViewportView(NomeListaConc);

        javax.swing.GroupLayout ListarProjConcLayout = new javax.swing.GroupLayout(ListarProjConc);
        ListarProjConc.setLayout(ListarProjConcLayout);
        ListarProjConcLayout.setHorizontalGroup(
            ListarProjConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarProjConcLayout.createSequentialGroup()
                .addGroup(ListarProjConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListarProjConcLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TituloListaConc, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                    .addGroup(ListarProjConcLayout.createSequentialGroup()
                        .addGroup(ListarProjConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ListarProjConcLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(VoltarListaConc))
                            .addGroup(ListarProjConcLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ListarProjConcLayout.setVerticalGroup(
            ListarProjConcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarProjConcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloListaConc, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(VoltarListaConc)
                .addContainerGap())
        );

        getContentPane().add(ListarProjConc, "card6");

        CriarProjeto.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Criar novo Projeto");

        jLabel2.setText("Nome:");

        jLabel3.setText("Acrónimo:");

        jLabel4.setText("Data de Inicio:");

        jLabel5.setText("Duração prevista:");

        cpNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpNomeActionPerformed(evt);
            }
        });

        cpAcronimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpAcronimoActionPerformed(evt);
            }
        });

        cpDiaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpDiaInActionPerformed(evt);
            }
        });

        VoltarCriarProj.setText("Voltar");
        VoltarCriarProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarCriarProjActionPerformed(evt);
            }
        });

        SeguinteCriarProj.setText("Seguinte");
        SeguinteCriarProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeguinteCriarProjActionPerformed(evt);
            }
        });

        jLabel6.setText("/");

        jLabel7.setText("/");

        javax.swing.GroupLayout CriarProjetoLayout = new javax.swing.GroupLayout(CriarProjeto);
        CriarProjeto.setLayout(CriarProjetoLayout);
        CriarProjetoLayout.setHorizontalGroup(
            CriarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CriarProjetoLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addGap(104, 104, 104))
            .addGroup(CriarProjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VoltarCriarProj, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SeguinteCriarProj, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(CriarProjetoLayout.createSequentialGroup()
                .addGroup(CriarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CriarProjetoLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(CriarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CriarProjetoLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpAcronimo))
                            .addGroup(CriarProjetoLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CriarProjetoLayout.createSequentialGroup()
                        .addGroup(CriarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CriarProjetoLayout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CriarProjetoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CriarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CriarProjetoLayout.createSequentialGroup()
                                .addComponent(cpDiaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpMesIn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpAnoIn))
                            .addComponent(cpDuracaoprev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CriarProjetoLayout.setVerticalGroup(
            CriarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CriarProjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addGroup(CriarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(CriarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cpAcronimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(CriarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cpDiaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpMesIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpAnoIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(54, 54, 54)
                .addGroup(CriarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpDuracaoprev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(CriarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VoltarCriarProj)
                    .addComponent(SeguinteCriarProj))
                .addContainerGap())
        );

        getContentPane().add(CriarProjeto, "card3");

        CriarTarefa.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Criar nova Tarefa");

        jLabel27.setText("Nome:");

        jLabel28.setText("Tipo:");

        jLabel29.setText("Data de Inicio:");

        jLabel30.setText("Duração prevista:");

        NomeTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeTarefaActionPerformed(evt);
            }
        });

        ctDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctDiaActionPerformed(evt);
            }
        });

        VoltarCriarTarefa.setText("Voltar");
        VoltarCriarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarCriarTarefaActionPerformed(evt);
            }
        });

        SeguinteCriarTarefa.setText("Criar Tarefa");
        SeguinteCriarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeguinteCriarTarefaActionPerformed(evt);
            }
        });

        jLabel31.setText("/");

        jLabel32.setText("/");

        TipoTarefaCriar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desenvolvimento", "Design", "Documentação" }));
        TipoTarefaCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoTarefaCriarActionPerformed(evt);
            }
        });

        jLabel36.setText("dias");

        javax.swing.GroupLayout CriarTarefaLayout = new javax.swing.GroupLayout(CriarTarefa);
        CriarTarefa.setLayout(CriarTarefaLayout);
        CriarTarefaLayout.setHorizontalGroup(
            CriarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CriarTarefaLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addGap(104, 104, 104))
            .addGroup(CriarTarefaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VoltarCriarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SeguinteCriarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(CriarTarefaLayout.createSequentialGroup()
                .addGroup(CriarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CriarTarefaLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(CriarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CriarTarefaLayout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TipoTarefaCriar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(CriarTarefaLayout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CriarTarefaLayout.createSequentialGroup()
                        .addGroup(CriarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CriarTarefaLayout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CriarTarefaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CriarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CriarTarefaLayout.createSequentialGroup()
                                .addComponent(ctDia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctMes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ctDuracaoprev))
                        .addGroup(CriarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CriarTarefaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CriarTarefaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ctAno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        CriarTarefaLayout.setVerticalGroup(
            CriarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CriarTarefaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addGap(89, 89, 89)
                .addGroup(CriarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(NomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(CriarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(TipoTarefaCriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(CriarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(ctDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addGap(59, 59, 59)
                .addGroup(CriarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctDuracaoprev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(CriarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VoltarCriarTarefa)
                    .addComponent(SeguinteCriarTarefa))
                .addContainerGap())
        );

        getContentPane().add(CriarTarefa, "card3");

        CriarProjeto2.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Criar novo Projeto");

        addInvPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInvPrincActionPerformed(evt);
            }
        });

        jLabel23.setText("Investigador Principal:");

        jLabel24.setText("Adicionar Investigadores:");

        jLabel25.setText("Adicionar Bolseiros Disponíveis:");

        invest.setViewportView(addInvest);

        jScrollPane5.setViewportView(addBols);

        SeguinteCriarProjeto2.setText("Seguinte");
        SeguinteCriarProjeto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeguinteCriarProjeto2ActionPerformed(evt);
            }
        });

        VoltarCriarProjeto2.setText("Voltar");
        VoltarCriarProjeto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarCriarProjeto2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CriarProjeto2Layout = new javax.swing.GroupLayout(CriarProjeto2);
        CriarProjeto2.setLayout(CriarProjeto2Layout);
        CriarProjeto2Layout.setHorizontalGroup(
            CriarProjeto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CriarProjeto2Layout.createSequentialGroup()
                .addGroup(CriarProjeto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CriarProjeto2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CriarProjeto2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addInvPrinc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CriarProjeto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invest, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CriarProjeto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
            .addGroup(CriarProjeto2Layout.createSequentialGroup()
                .addGroup(CriarProjeto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CriarProjeto2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CriarProjeto2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VoltarCriarProjeto2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SeguinteCriarProjeto2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        CriarProjeto2Layout.setVerticalGroup(
            CriarProjeto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CriarProjeto2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(70, 70, 70)
                .addGroup(CriarProjeto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addGap(38, 38, 38)
                .addGroup(CriarProjeto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addInvPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5)
                    .addComponent(invest, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(CriarProjeto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeguinteCriarProjeto2)
                    .addComponent(VoltarCriarProjeto2))
                .addContainerGap())
        );

        getContentPane().add(CriarProjeto2, "card5");

        CriarProjeto3.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Criar novo Projeto");

        SelecBolseiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecBolseiroActionPerformed(evt);
            }
        });

        jLabel9.setText("Selecione um Bolseiro:");

        jLabel10.setText("Adicionar Orientadores:");

        SelecOrientador.setViewportView(SelecOrientadorLista);

        FinalizarCriarProjeto.setText("Criar");
        FinalizarCriarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarCriarProjetoActionPerformed(evt);
            }
        });

        VoltarCriarProjeto3.setText("Voltar");
        VoltarCriarProjeto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarCriarProjeto3ActionPerformed(evt);
            }
        });

        ConfirmarOrientador.setText("OK");
        ConfirmarOrientador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarOrientadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CriarProjeto3Layout = new javax.swing.GroupLayout(CriarProjeto3);
        CriarProjeto3.setLayout(CriarProjeto3Layout);
        CriarProjeto3Layout.setHorizontalGroup(
            CriarProjeto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CriarProjeto3Layout.createSequentialGroup()
                .addGroup(CriarProjeto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CriarProjeto3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VoltarCriarProjeto3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FinalizarCriarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CriarProjeto3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(CriarProjeto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CriarProjeto3Layout.createSequentialGroup()
                                .addGroup(CriarProjeto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CriarProjeto3Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(SelecBolseiro, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CriarProjeto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CriarProjeto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SelecOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ConfirmarOrientador, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72))
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE))))
                .addContainerGap())
        );
        CriarProjeto3Layout.setVerticalGroup(
            CriarProjeto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CriarProjeto3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(70, 70, 70)
                .addGroup(CriarProjeto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(38, 38, 38)
                .addGroup(CriarProjeto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelecBolseiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelecOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfirmarOrientador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(CriarProjeto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FinalizarCriarProjeto)
                    .addComponent(VoltarCriarProjeto3))
                .addContainerGap())
        );

        getContentPane().add(CriarProjeto3, "card5");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProjNaoConcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProjNaoConcActionPerformed
        MenuPrincipal.setVisible(false);
        ListarProjConc.setVisible(true);
    }//GEN-LAST:event_ProjNaoConcActionPerformed

    private void ProjConcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProjConcActionPerformed
        MenuPrincipal.setVisible(false);
        ListarProjNaoConc.setVisible(true);
    }//GEN-LAST:event_ProjConcActionPerformed

    private void CriarProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarProjActionPerformed
        MenuPrincipal.setVisible(false);
        CriarProjeto.setVisible(true);
    }//GEN-LAST:event_CriarProjActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void cpNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpNomeActionPerformed

    private void ProcurarProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcurarProjActionPerformed
        String dd[] = new String[projetos.size()];

        for(int i=0;i<projetos.size();i++){
            if (!projetos.get(i).isEstado()){
                dd[i] = projetos.get(i).getNome() + " - Não Concluído";
            }
            else {
                dd[i] = projetos.get(i).getNome() + " - Concluído";

            }
        }
        ProcurarProjetoNome.setModel(new javax.swing.DefaultComboBoxModel<>(dd));

        MenuPrincipal.setVisible(false);
        ProcurarProjeto.setVisible(true);
    }//GEN-LAST:event_ProcurarProjActionPerformed

    private void VoltarCriarProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarCriarProjActionPerformed
        CriarProjeto.setVisible(false);
        MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_VoltarCriarProjActionPerformed

    private void SeguinteCriarProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeguinteCriarProjActionPerformed
        int aux=0;
        cpNome.setBackground(null);
        cpAcronimo.setBackground(null);
        cpDiaIn.setBackground(null);
        cpMesIn.setBackground(null);
        cpAnoIn.setBackground(null);
        cpDuracaoprev.setBackground(null);
        if (cpNome.getText().equals("")){
            cpNome.setBackground(Color.red);
            aux++;
        }
        else{
            for (int i = 0; i < projetos.size();i++){
                if (projetos.get(i).getNome().equals(cpNome.getText())){
                    cpNome.setBackground(Color.red);
                    JOptionPane.showInputDialog("Nome já existente!");
                    cpNome.setBackground(null);
                    aux++;
                    break;
                }
            }
        }
        
        if (cpAcronimo.getText().equals("")){
            cpAcronimo.setBackground(Color.red);
            aux++;
        }
        try{
        if (cpDiaIn.getText(). equals("") || Integer.parseInt(cpDiaIn.getText())>31 || Integer.parseInt(cpDiaIn.getText())<1){
            cpDiaIn.setBackground(Color.red);
            aux++;
        }}
        catch (Exception e){
            cpDiaIn.setBackground(Color.red);
            aux++;
        }
        try{
        if (cpMesIn.getText(). equals("") || Integer.parseInt(cpMesIn.getText())>12 || Integer.parseInt(cpMesIn.getText())<1){
            cpMesIn.setBackground(Color.red);
            aux++;
        }}
        catch (Exception e){
            cpMesIn.setBackground(Color.red);
            aux++;
        }
        try{
        if (cpAnoIn.getText(). equals("") || Integer.parseInt(cpAnoIn.getText())<0){
            cpAnoIn.setBackground(Color.red);
            aux++;
        }}
        catch (Exception e){
            cpAnoIn.setBackground(Color.red);
            aux++;
        }
        
       
        
        try{
        if (cpDuracaoprev.getText(). equals("") || Integer.parseInt(cpDuracaoprev.getText())<1){
            cpDuracaoprev.setBackground(Color.red);
            aux++;
        }}
        catch (Exception e){
            cpDuracaoprev.setBackground(Color.red);
            aux++;
        }
        if (aux > 0){
            JOptionPane.showInputDialog("Por favor verifique os campos a vermelho.");
        }
        else{
            int aux2 = 0;
            String dd[] = new String[pessoas.size()];
            
            for(int j=0;j<pessoas.size();j++){
                if (pessoas.get(j).getTipo().equals("Doc")){
                    dd[aux2] = (pessoas.get(j).getNome());
                    aux2++;
                }
            }
            addInvest.setListData(dd);
            addInvPrinc.setModel(new javax.swing.DefaultComboBoxModel<>(dd));
            
            aux2 = 0;
            dd = new String[pessoas.size()];
            
            for(int j=0;j<pessoas.size();j++){
                if (pessoas.get(j).getTipo().equals("B")){
                    
                    Bolseiro bolseiro= (Bolseiro) pessoas.get(j);
                    if(bolseiro.getCustoProjeto()==0){
                        dd[aux2] = (pessoas.get(j).getNome()) +" - "+ pessoas.get(j).getTipoBols();
                        aux2++;
                        
                    }
                    
                }
            }
            addBols.setListData(dd);
            
            CriarProjeto.setVisible(false);
            CriarProjeto2.setVisible(true);
        }
    }//GEN-LAST:event_SeguinteCriarProjActionPerformed

    private void cpAcronimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpAcronimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpAcronimoActionPerformed

    private void FinalizarCriarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarCriarProjetoActionPerformed
        ArrayList<Pessoa> pp = new ArrayList<>();
        List<String> aux1;
        List<String> aux2;
        int k=0;
        for(int i=0;i<auxPessoas.length;i++){
            if(auxPessoas[i] == null){
                k++;
            }
        }
        if(k==0){
            aux1 = addBols.getSelectedValuesList();
            aux2 = addInvest.getSelectedValuesList();
            Docente docente = null;
            for (int i=0;i<pessoas.size();i++){
                if(pessoas.get(i).getNome().equals(addInvPrinc.getSelectedItem())){
                    docente = (Docente) pessoas.get(i);
                    break;
                }
            }
            for (int i=0;i<aux1.size();i++){
                for (int j=0;j<pessoas.size();j++){
                    if(pessoas.get(j).getNome().equals(aux1.get(i).split(" - ")[0])){
                        pessoas.get(j).setCusto(Integer.parseInt(cpDuracaoprev.getText()));
                        pp.add(pessoas.get(j));
                        
                    }
                }
            }
            for (int i=0;i<aux2.size();i++){
                for (int j=0;j<pessoas.size();j++){
                    if(pessoas.get(j).getNome().equals(aux2.get(i)) && !aux2.get(i).equals(addInvPrinc.getSelectedItem())){
                        pp.add(pessoas.get(j));
                    }
                }
            }
            for (int i =0;i<auxPessoas.length;i++){
                for(int j =0;j<pessoas.size();j++){
                    if(pessoas.get(j).getNome().equals(addBols.getSelectedValuesList().get(i).split(" - ")[0])){
                        if(pessoas.get(j).getTipoBols().equals("L")){
                            pessoas.get(j).setDocentes(auxPessoas[i]);
                        }
                    }
                }
            }
            Projeto projeto = new Projeto(cpNome.getText(),cpAcronimo.getText(), new Data(Integer.parseInt(cpDiaIn.getText()),Integer.parseInt(cpMesIn.getText()),Integer.parseInt(cpAnoIn.getText())), Integer.parseInt(cpDuracaoprev.getText()), docente, pp);
            projetos.add(projeto);
            try {
                save();
            } catch (IOException ex) {
                Logger.getLogger(ProjetoPOO.class.getName()).log(Level.SEVERE, null, ex);
            }
            CriarProjeto3.setVisible(false);
            MenuPrincipal.setVisible(true);
            
        }
        
    }//GEN-LAST:event_FinalizarCriarProjetoActionPerformed

    private void SelecBolseiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecBolseiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelecBolseiroActionPerformed

    private void VoltarCriarProjeto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarCriarProjeto3ActionPerformed
        CriarProjeto3.setVisible(false);
        CriarProjeto2.setVisible(true);
    }//GEN-LAST:event_VoltarCriarProjeto3ActionPerformed

    private void cpDiaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpDiaInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpDiaInActionPerformed

    private void FimProjBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FimProjBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FimProjBotaoActionPerformed

    private void ProcurarProjetoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcurarProjetoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProcurarProjetoNomeActionPerformed

    private void NovaTarefaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovaTarefaBotaoActionPerformed
        MenuProjNaoConc.setVisible(false);
        CriarTarefa.setVisible(true);
    }//GEN-LAST:event_NovaTarefaBotaoActionPerformed

    private void EliminarTarefaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarTarefaBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarTarefaBotaoActionPerformed

    private void AlterarTarefaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarTarefaBotaoActionPerformed
        String dd[] = new String[projetoSelec.getPessoas().size()];
        String t = ListaTarefas.getSelectedValue();
        Tarefa tar = null;
        double aux =0;
        int aux2 =0; 
        for(int k =0;k<projetoSelec.getTarefas().size();k++ ){
            if(projetoSelec.getTarefas().get(k).getNome().equals(t) ){
                TituloTarefa.setText(t);
                tar = projetoSelec.getTarefas().get(k);
                if(projetoSelec.getTarefas().get(k).getPessoa() != null){
                    ResponsavelTarefaAtual.setText(projetoSelec.getTarefas().get(k).getPessoa().getNome());
                    dd[0] = projetoSelec.getTarefas().get(k).getPessoa().getNome();
                    aux2=1;
                }
                ProgressoTarefa.setValue(projetoSelec.getTarefas().get(k).getTaxaExecucao());
                break;
            }
        }
        for(int i = 0;i<projetoSelec.getPessoas().size();i++){
            aux=0;
            for(int j=0;j<projetoSelec.getTarefas().size();j++){
                if(projetoSelec.getTarefas().get(j).getPessoa() != null){
                    if(projetoSelec.getTarefas().get(j).getPessoa().getNome().equals(projetoSelec.getPessoas().get(i).getNome())&& projetoSelec.getTarefas().get(j).getTaxaExecucao() != 100){
                        aux+=projetoSelec.getTarefas().get(j).getEsforco();
                    }
                }
                
            }
            System.out.println(tar.getTipo() + " "+ tar.getEsforco());
            if(aux+tar.getEsforco()<=1){
                dd[aux2] = projetoSelec.getPessoas().get(i).getNome();
                System.out.println(dd[aux2]);
                aux2++;
            }
            
        }
        
        
        ResponsavelTarefa.setModel(new javax.swing.DefaultComboBoxModel<>(dd));
        MenuProjNaoConc.setVisible(false);
        AlterarTarefa.setVisible(true);
    }//GEN-LAST:event_AlterarTarefaBotaoActionPerformed

    private void EscolherEstadoTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscolherEstadoTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EscolherEstadoTarefaActionPerformed

    private void SubAlterarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubAlterarTarefaActionPerformed
        int t;
        t = Integer.parseInt(AlteraTaxa.getText());
        String nome;
        nome = (String)ResponsavelTarefa.getSelectedItem();
        Pessoa p = null;
        int aux = 0;
        try{
        if(Integer.parseInt(AlteraTaxa.getText()) <0 || Integer.parseInt(AlteraTaxa.getText()) >100){
            //erroooooooooooooo
        }
        else{
            for(int i= 0;i<pessoas.size();i++){
                if(pessoas.get(i).getNome().equals(nome)){
                    p=pessoas.get(i);
                }
            }
            for(int i=0;i<projetoSelec.getTarefas().size();i++){
                if(projetoSelec.getTarefas().get(i).getNome().equals(TituloTarefa.getText())){
                    projetoSelec.getTarefas().get(i).setTaxaExecucao(Integer.parseInt(AlteraTaxa.getText()));
                    projetoSelec.getTarefas().get(i).setPessoa(p);
                }
            }
            AlterarTarefa.setVisible(false);
            MenuPrincipal.setVisible(true);
        }
        }catch(Exception e){
        
    }
        
    }//GEN-LAST:event_SubAlterarTarefaActionPerformed

    private void addInvPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInvPrincActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addInvPrincActionPerformed

    private void SeguinteCriarProjeto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeguinteCriarProjeto2ActionPerformed
        if(addInvPrinc.getSelectedItem()!= null && !addInvest.getSelectedValuesList().isEmpty() && !addBols.getSelectedValuesList().isEmpty()){
            int aux = 0;
            List<String> d = addBols.getSelectedValuesList();
            List<String> d2;
            String dd[] = new String[d.size()];
            
            for(int j=0;j<d.size();j++){
                if(!d.get(j).split(" - ")[1].equals("Dou")){
                    dd[aux] = d.get(j).split(" - ")[0];
                    aux++;
                }
            }
            
            SelecBolseiro.setModel(new javax.swing.DefaultComboBoxModel<>(dd));
            
            String p = (String)addInvPrinc.getSelectedItem();
            d = addInvest.getSelectedValuesList();
            dd = new String[d.size()+1];
            dd[0] = p;
            for(int i=1;i<d.size()+1;i++){
                if(!d.get(i-1).equals(p)){
                    dd[i] = d.get(i-1);
                }
                
            }
            
            SelecOrientadorLista.setListData(dd);
            d = addBols.getSelectedValuesList();
            d2 = new ArrayList<>();
            for(int i=0;i<d.size();i++){
                if(!d.get(i).split(" - ")[1].equals("Dou")){
                    d2.add(d.get(i));
                }
            }
            auxPessoas= new ArrayList[d2.size()];

            
            CriarProjeto2.setVisible(false);
            CriarProjeto3.setVisible(true);
        }
        
    }//GEN-LAST:event_SeguinteCriarProjeto2ActionPerformed

    private void VoltarCriarProjeto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarCriarProjeto2ActionPerformed
        CriarProjeto2.setVisible(false);
        CriarProjeto.setVisible(true);
    }//GEN-LAST:event_VoltarCriarProjeto2ActionPerformed

    private void AlteraTaxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlteraTaxaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlteraTaxaActionPerformed

    private void ResponsavelTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResponsavelTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResponsavelTarefaActionPerformed

    private void NomeTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeTarefaActionPerformed

    private void ctDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctDiaActionPerformed

    private void VoltarCriarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarCriarTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VoltarCriarTarefaActionPerformed

    private void SeguinteCriarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeguinteCriarTarefaActionPerformed
        NomeTarefa.setBackground(null);
        ctDia.setBackground(null);
        ctMes.setBackground(null);
        ctAno.setBackground(null);
        ctDuracaoprev.setBackground(null);
        int aux=0;
        if (NomeTarefa.getText().equals("")){
            cpNome.setBackground(Color.red);
            aux++;
        }
        else{
            for (int i = 0; i < projetoSelec.getTarefas().size();i++){
                if (projetoSelec.getTarefas().get(i).getNome().equals(NomeTarefa.getText())){
                    NomeTarefa.setBackground(Color.red);
                    JOptionPane.showInputDialog("Nome já existente!");
                    NomeTarefa.setBackground(null);
                    aux++;
                    break;
                }
            }
        }
        
        
        try{
        if (ctDia.getText().equals("") || Integer.parseInt(ctDia.getText())>31 || Integer.parseInt(ctDia.getText())<1){
            ctDia.setBackground(Color.red);
            aux++;
        }}
        catch (Exception e){
            ctDia.setBackground(Color.red);
            aux++;
        }
        try{
        if (ctMes.getText().equals("") || Integer.parseInt(ctMes.getText())>12 || Integer.parseInt(ctMes.getText())<1){
            ctMes.setBackground(Color.red);
            aux++;
        }}
        catch (Exception e){
            ctMes.setBackground(Color.red);
            aux++;
        }
        try{
        if (ctAno.getText().equals("") || Integer.parseInt(ctAno.getText())<0){
            ctAno.setBackground(Color.red);
            aux++;
        }}
        catch (Exception e){
            ctAno.setBackground(Color.red);
            aux++;
        }
        
       
        
        try{
        if (ctDuracaoprev.getText(). equals("") || Integer.parseInt(ctDuracaoprev.getText())<1){
            ctDuracaoprev.setBackground(Color.red);
            aux++;
        }}
        catch (Exception e){
            ctDuracaoprev.setBackground(Color.red);
            aux++;
        }
        if (aux > 0){
            JOptionPane.showInputDialog("Por favor verifique os campos a vermelho.");
        }
        else{
            Data data = new Data(Integer.parseInt(ctDia.getText()),Integer.parseInt(ctMes.getText()),Integer.parseInt(ctAno.getText()));
           
            String t = (String)TipoTarefaCriar.getSelectedItem(); 
            if(t.equals("Design")){
                projetoSelec.setTarefa(new Design(data,Integer.parseInt(ctDuracaoprev.getText()), NomeTarefa.getText()));
            }
            else if(t.equals("Desenvolvimento")){
                projetoSelec.setTarefa(new Desenvolvimento(data,Integer.parseInt(ctDuracaoprev.getText()), NomeTarefa.getText()));
            }
            else{
                projetoSelec.setTarefa(new Documentacao(data,Integer.parseInt(ctDuracaoprev.getText()), NomeTarefa.getText()));
            }
            try {
                save();
            } catch (IOException ex) {
                Logger.getLogger(ProjetoPOO.class.getName()).log(Level.SEVERE, null, ex);
            }
            CriarTarefa.setVisible(false);
            MenuPrincipal.setVisible(true);
            
        }
    }//GEN-LAST:event_SeguinteCriarTarefaActionPerformed

    private void ConfirmarOrientadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarOrientadorActionPerformed
        
        int aux;
        if(!SelecOrientadorLista.getSelectedValuesList().isEmpty() && SelecBolseiro.getSelectedItem()!= null){
            List <String> d1 = addBols.getSelectedValuesList();
            List <String> d2 = new ArrayList<String>();            
            List <String> dd = SelecOrientadorLista.getSelectedValuesList();
            d1.remove((String)addInvPrinc.getSelectedItem());
            for(int i=0;i<d1.size();i++){
                d2.add(d1.get(i).split(" - ")[0]);
            }
            
            aux = d2.indexOf((String)SelecBolseiro.getSelectedItem());
            for(int i=0;i<dd.size();i++){
                if(auxPessoas[aux] != null){
                    if(!auxPessoas[aux].contains(dd.get(i))){
                        auxPessoas[aux].add(dd.get(i));
                    }
                }else{
                    auxPessoas[aux]= new ArrayList<>();
                    auxPessoas[aux].add(dd.get(i));
                }
            }
        }
        

    }//GEN-LAST:event_ConfirmarOrientadorActionPerformed

    private void SeguinteProcurarProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeguinteProcurarProjActionPerformed
        String aux[] = ((String)ProcurarProjetoNome.getSelectedItem()).split(" - ");
        String tarefa[];
        for(int i=0;i<projetos.size();i++){
            if(projetos.get(i).getNome().equals(aux[0])){
                projetoSelec = projetos.get(i);
                if(projetos.get(i).isEstado()){
                    ProcurarProjeto.setVisible(false);
                    MenuProjConc.setVisible(true);
                }else{
                    TituloProj.setText(projetos.get(i).getNome());
                    tarefa = new String[projetos.get(i).getTarefas().size()];
                    for(int j = 0;j<projetos.get(i).getTarefas().size();j++){
                        tarefa[j] = projetos.get(i).getTarefas().get(j).getNome();
                    }
                    ListaTarefas.setListData(tarefa);
                    AreaCusto.setText(Integer.toString(projetoSelec.custo()));
                    ProcurarProjeto.setVisible(false);
                    MenuProjNaoConc.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_SeguinteProcurarProjActionPerformed

    private void VoltarFimProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarFimProjActionPerformed
        MenuProjNaoConc.setVisible(false);
        MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_VoltarFimProjActionPerformed

    private void VoltarProcurarProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarProcurarProjActionPerformed
        ProcurarProjeto.setVisible(false);
        MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_VoltarProcurarProjActionPerformed

    private void TipoTarefaCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoTarefaCriarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoTarefaCriarActionPerformed

    /**
     * @param pessoas
     * @throws java.io.IOException
     */
    public static void lerPessoas(ArrayList<Pessoa> pessoas) throws IOException {
        FicheiroDeTexto fichPessoas = new FicheiroDeTexto();
        fichPessoas.abreLeitura("fichPessoas.txt");

        String linhafich;
        linhafich = fichPessoas.leLinha();
        while(linhafich != null){
            String parts[] = linhafich.split("/");
            String partPessoa[] = parts[0].split(";");  
            if (partPessoa[2].equals("D")) {
                String partDocente[] = parts[1].split(";");
                Docente docente = new Docente(Integer.parseInt(partDocente[0]), partDocente[1], partPessoa[0], partPessoa[1]);
                pessoas.add(docente);
            }
            else if (partPessoa[2].equals("B")) {
                String partBolseiro[] = parts[1].split(";");
                String partDataIni[] = partBolseiro[0].split(":");
                String partDataFim[] = partBolseiro[1].split(":");
                Data dataIni = new Data(Integer.parseInt(partDataIni[0]),Integer.parseInt(partDataIni[1]),Integer.parseInt(partDataIni[2]));
                Data dataFim = new Data(Integer.parseInt(partDataFim[0]),Integer.parseInt(partDataFim[1]),Integer.parseInt(partDataFim[2]));
                if(partBolseiro[3].equals("D")){
                    Doutorado doutorado = new Doutorado(dataIni, dataFim,Integer.parseInt(partBolseiro[2]) , partPessoa[0], partPessoa[1]);
                    pessoas.add(doutorado);
                }
                else if(parts[2].equals(" ")){
                    if(partBolseiro[3].equals("L")){
                        Licenciado licenciado = new Licenciado(dataIni, dataFim,Integer.parseInt(partBolseiro[2]) , partPessoa[0], partPessoa[1]);
                        pessoas.add(licenciado);
                    }
                    else if(partBolseiro[3].equals("M")){
                        Mestrado mestrado = new Mestrado(dataIni, dataFim,Integer.parseInt(partBolseiro[2]) , partPessoa[0], partPessoa[1]);
                        pessoas.add(mestrado);
                    }
                }
                else{
                    String partOrientador[] = parts[2].split(";");
                    ArrayList<String> orientadores = new ArrayList<>();
                    for(int i=0; i<partOrientador.length;i++){
                        orientadores.add(partOrientador[i]);
                    }
                    if(partBolseiro[3].equals("L")){
                        Licenciado licenciado = new Licenciado(orientadores, dataIni, dataFim,Integer.parseInt(partBolseiro[2]) , partPessoa[0], partPessoa[1]);
                        pessoas.add(licenciado);
                    }
                    else if(partBolseiro[3].equals("M")){
                        Mestrado mestrado = new Mestrado(orientadores, dataIni, dataFim,Integer.parseInt(partBolseiro[2]) , partPessoa[0], partPessoa[1]);
                        pessoas.add(mestrado);
                    }
                }
                
            }
            
            linhafich = fichPessoas.leLinha();
        }
        fichPessoas.fechaLeitura();
    }
    
    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String args[]) throws IOException {
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ProjetoPOO().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ProjetoPOO.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ProjetoPOO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlteraTaxa;
    private javax.swing.JPanel AlterarTarefa;
    private javax.swing.JButton AlterarTarefaBotao;
    private javax.swing.JLabel AreaCusto;
    private javax.swing.JButton ConfirmarOrientador;
    private javax.swing.JButton CriarProj;
    private javax.swing.JPanel CriarProjeto;
    private javax.swing.JPanel CriarProjeto2;
    private javax.swing.JPanel CriarProjeto3;
    private javax.swing.JPanel CriarTarefa;
    private javax.swing.JButton EliminarTarefaBotao;
    private javax.swing.JComboBox<String> EscolherEstadoTarefa;
    private javax.swing.JButton FimProjBotao;
    private javax.swing.JButton FinalizarCriarProjeto;
    private javax.swing.JTextArea InformacaoProj;
    private javax.swing.JList<String> ListaTarefas;
    private javax.swing.JPanel ListarProjConc;
    private javax.swing.JPanel ListarProjNaoConc;
    private javax.swing.JPanel MenuPrincipal;
    private javax.swing.JPanel MenuProjConc;
    private javax.swing.JPanel MenuProjNaoConc;
    private javax.swing.JTextArea NomeListaConc;
    private javax.swing.JTextArea NomeListaNaoConc;
    private javax.swing.JTextField NomeTarefa;
    private javax.swing.JButton NovaTarefaBotao;
    private javax.swing.JButton OkEscolherEstadoTarefa;
    private javax.swing.JButton ProcurarProj;
    private javax.swing.JPanel ProcurarProjeto;
    private javax.swing.JComboBox<String> ProcurarProjetoNome;
    private javax.swing.JProgressBar ProgressoTarefa;
    private javax.swing.JButton ProjConc;
    private javax.swing.JButton ProjNaoConc;
    private javax.swing.JComboBox<String> ResponsavelTarefa;
    private javax.swing.JLabel ResponsavelTarefaAtual;
    private javax.swing.JButton Sair;
    private javax.swing.JButton SeguinteCriarProj;
    private javax.swing.JButton SeguinteCriarProjeto2;
    private javax.swing.JButton SeguinteCriarTarefa;
    private javax.swing.JButton SeguinteProcurarProj;
    private javax.swing.JComboBox<String> SelecBolseiro;
    private javax.swing.JScrollPane SelecOrientador;
    public javax.swing.JList<String> SelecOrientadorLista;
    private javax.swing.JButton SubAlterarTarefa;
    private javax.swing.JComboBox<String> TipoTarefaCriar;
    private javax.swing.JLabel TituloListaConc;
    private javax.swing.JLabel TituloListaNaoConc;
    private javax.swing.JLabel TituloProj;
    private javax.swing.JLabel TituloProj2;
    private javax.swing.JLabel TituloTarefa;
    private javax.swing.JLabel Título;
    private javax.swing.JLabel Título1;
    private javax.swing.JButton VoltarAlterarTarefa;
    private javax.swing.JButton VoltarCriarProj;
    private javax.swing.JButton VoltarCriarProjeto2;
    private javax.swing.JButton VoltarCriarProjeto3;
    private javax.swing.JButton VoltarCriarTarefa;
    private javax.swing.JButton VoltarFimProj;
    private javax.swing.JButton VoltarListaConc;
    private javax.swing.JButton VoltarListaNaoConc;
    private javax.swing.JButton VoltarProcurarProj;
    private javax.swing.JButton VoltarProjConc;
    private javax.swing.JList<String> addBols;
    private javax.swing.JComboBox<String> addInvPrinc;
    public javax.swing.JList<String> addInvest;
    private javax.swing.JTextField cpAcronimo;
    private javax.swing.JTextField cpAnoIn;
    private javax.swing.JTextField cpDiaIn;
    private javax.swing.JTextField cpDuracaoprev;
    private javax.swing.JTextField cpMesIn;
    private javax.swing.JTextField cpNome;
    private javax.swing.JTextField ctAno;
    private javax.swing.JTextField ctDia;
    private javax.swing.JTextField ctDuracaoprev;
    private javax.swing.JTextField ctMes;
    private javax.swing.JScrollPane invest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
}
