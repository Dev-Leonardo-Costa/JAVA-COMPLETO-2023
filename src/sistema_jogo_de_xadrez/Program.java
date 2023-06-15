package sistema_jogo_de_xadrez;

import sistema_jogo_de_xadrez.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();

        UI.printboard(chessMatch.getPieces());
    }
}
