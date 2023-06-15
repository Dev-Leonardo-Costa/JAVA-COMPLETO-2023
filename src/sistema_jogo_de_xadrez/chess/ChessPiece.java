package sistema_jogo_de_xadrez.chess;

import sistema_jogo_de_xadrez.boardgame.Board;
import sistema_jogo_de_xadrez.boardgame.Piece;
import sistema_jogo_de_xadrez.boardgame.Position;

public abstract class ChessPiece extends Piece {

    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getMoveCount() {
        return moveCount;
    }

    protected void increaseMoveCount() {
        moveCount++;
    }

    protected void decreaseMoveCount() {
        moveCount--;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}