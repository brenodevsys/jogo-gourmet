import javax.swing.*;

public class JogoGourmet {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Jogo Gourmet\n\nPense em um prato que gosta.", "Jogo Gourmet", JOptionPane.PLAIN_MESSAGE);
        Prato newPrato = new Prato();

        int resposta = JOptionPane.showConfirmDialog(null, "O prato que você pensou é massa?", "Jogo Gourmet", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {

            resposta = JOptionPane.showConfirmDialog(null, "O prato que você pensou é lasanha?", "Jogo Gourmet", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Acertei de novo!", "Jogo Gourmet", JOptionPane.PLAIN_MESSAGE);
            } else {

                String novoPrato = JOptionPane.showInputDialog(null, "Qual prato você pensou?", "Jogo Gourmet", JOptionPane.QUESTION_MESSAGE);
                newPrato.setNome(novoPrato);
                if (novoPrato != null && !novoPrato.isEmpty()) {

                    String caracteristica = novoPrato + " é _______ mas lasanha não.";
                    newPrato.setCaracteristica(caracteristica);
                    String novaCaracteristica = JOptionPane.showInputDialog(null, caracteristica, "Jogo Gourmet", JOptionPane.QUESTION_MESSAGE);
                    if (novaCaracteristica != null && !novaCaracteristica.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Obrigado por jogar!", "Jogo Gourmet", JOptionPane.PLAIN_MESSAGE);
                    }
                }
            }
        } else {
            String novoPrato = JOptionPane.showInputDialog(null, "Qual prato você pensou?", "Jogo Gourmet", JOptionPane.QUESTION_MESSAGE);
            newPrato.setNome(novoPrato);
            if (novoPrato != null && !novoPrato.isEmpty()) {

                String caracteristica = novoPrato + " é _______ mas lasanha não.";
                newPrato.setCaracteristica(caracteristica);
                String novaCaracteristica = JOptionPane.showInputDialog(null, caracteristica, "Jogo Gourmet", JOptionPane.QUESTION_MESSAGE);
                if (novaCaracteristica != null && !novaCaracteristica.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Obrigado por jogar. Jogo Gourmet Desenvolvido por Breno Delgado!", "Jogo Gourmet do dev Breno Delgado.", JOptionPane.PLAIN_MESSAGE);
                }
            }
        }
    }
}