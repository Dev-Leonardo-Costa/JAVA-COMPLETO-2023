package sistema_jogo_de_xadrez.chess;

import sistema_jogo_de_xadrez.boardgame.Board;
import sistema_jogo_de_xadrez.boardgame.Piece;
import sistema_jogo_de_xadrez.chess.Color;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
}
