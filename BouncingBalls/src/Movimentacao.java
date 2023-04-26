import java.util.ArrayList;

public class Movimentacao extends Thread{
    //Propriedades da classe
    private Painel objPainel = null;
    private ArrayList<Bola> colecao = null;

    //metodo construtor cheio da classe
    public Movimentacao(Painel objPainel, ArrayList<Bola> colecao) {
        this.objPainel = objPainel;
        this.colecao = colecao;
    }

    //Metodo de execucao paralela da classe
    public void run() {
        while (true) {
            boolean bateu = false;
            for (Bola objBola : colecao) {
                objBola.setX(objBola.getX() + objBola.getDx());
                objBola.setY(objBola.getY() + objBola.getDy());

                if((objBola.getX() < 0) || (objBola.getX() > 580)) {
                    objBola.setDx(-objBola.getDx());
                    bateu = true;

                }
                if((objBola.getY() < 0) || (objBola.getY() > 520)) {
                    objBola.setDy(-objBola.getDy());
                    bateu = true;
                }
                if (bateu) {
                    colecao.add(new Bola());
                }
            }

            try {sleep(10);} catch (Exception e) {}

            objPainel.repaint();
        }
    }
}
