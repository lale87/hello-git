package poker;

public interface ICard {
	
	/**
	 * returns a card's suit
	 * @return suit <ESeuits>
	 */
	ESuits getSuit();
	
	/**
	 * returns the value of a card
	 * @return value <ECardValues>
	 */
	ECardValues getValue();
	
	
}
