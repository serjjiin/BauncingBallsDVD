import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Painel extends JPanel {
    //Propriedades da classe
    ArrayList<Bola> colecao = null;

    //Metodo Construtor Cheio da Classe
    public Painel(ArrayList<Bola> colecao) {
        this.colecao = colecao;
    }

    //Metodo sobrescrito da classe
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(Bola objBola : colecao) {
            //g.fillOval(objBola.getX(), objBola.getY(), 10, 10);
            ImageIcon objImagem = new ImageIcon("midia.png");
            g.drawImage(objImagem.getImage(), objBola.getX(),
                    objBola.getY(),
                    80, 80, null);
        }
    }
}
