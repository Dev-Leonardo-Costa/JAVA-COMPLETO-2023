package sistema_jogo_de_xadrez.chess.chess_pieces;

import sistema_jogo_de_xadrez.boardgame.BoardException;

public class ChessException extends BoardException {

    private static final long serialVersionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }

}
