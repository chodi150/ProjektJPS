/**
  * Created by Piotr on 25.05.2018.
  */
class King extends Figure{

  override def generatePositions(position: Position, chessBoardState: ChessBoardState): Set[Position] = {
    val pseudoPossibleMoves = Range(position.row - 1, position.row + 2)
      .flatMap(x => Range(position.col - 1, position.col + 2)
        .map(y => Position(x, y, 6))).filter(x => x != position && x.positionOnBoard()).toSet
    val possibleMoves = pseudoPossibleMoves -- chessBoardState.playerOnePositions
    possibleMoves
  }
}