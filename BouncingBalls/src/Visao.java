import javax.swing.*;
import java.util.ArrayList;

public class Visao extends JFrame {
    //Propiedades da classe
    private static final long serialVersionUID = 1L;
    private ArrayList<Bola> colecao = new ArrayList<Bola>();
    private Painel objPainel = new Painel(colecao);
    private Movimentacao objMovimentacao = new Movimentacao(objPainel, colecao);
    private JButton btnOk = new JButton("Ok");

    //Método Principal de execucao da classe
    public static void main(String[] args) {
        new Visao().setVisible(true);
    }
    //metodo construtor da classe
    public Visao() {
        //Configuracao da janela
        setTitle("Java Bouncing Balls !!!");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Configuracao do painel
        objPainel.setLayout(null);
        setContentPane(objPainel);

        //Configuracao do Botao
        btnOk.setBounds(250,520,100,30);
        btnOk.addActionListener(new ControladorOk(colecao));
        objPainel.add(btnOk);

        objMovimentacao.start();
    }
}

//