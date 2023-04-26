import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControladorOk implements ActionListener {
    //Propeiedades da classe
    private ArrayList<Bola> colecao = null;

    //Metodo construtor cheio da classe
    public ControladorOk(ArrayList<Bola> colecao) {
        super();
        this.colecao = colecao;
    }

    //Metodo sobrescrito

    public void actionPerformed(ActionEvent e) {
        colecao.add(new Bola());
    }
}
