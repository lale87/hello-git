package poker;

public enum ECards {
SPADES_TWO(ESuits.SPADES, ECardValues.TWO, 2),
SPADES_THREE(ESuits.SPADES, ECardValues.THREE, 3),
SPADES_FOUR(ESuits.SPADES, ECardValues.FOUR, 4),
SPADES_FIVE(ESuits.SPADES, ECardValues.FIVE, 5),
SPADES_SIX(ESuits.SPADES, ECardValues.SIX, 6),
SPADES_SEVEN(ESuits.SPADES, ECardValues.SEVEN, 7),
SPADES_EIGHT(ESuits.SPADES, ECardValues.EIGHT, 8),
SPADES_NINE(ESuits.SPADES, ECardValues.NINE, 9),
SPADES_TEN(ESuits.SPADES, ECardValues.TEN, 10),
SPADES_JACK(ESuits.SPADES, ECardValues.JACK, 11),
SPADES_QUEEN(ESuits.SPADES, ECardValues.QUEEN, 12),
SPADES_KING(ESuits.SPADES, ECardValues.KING, 13),
SPADES_ACE(ESuits.SPADES, ECardValues.ACE, 14),

HEARTS_TWO(ESuits.HEARTS, ECardValues.TWO, 2),
HEARTS_THREE(ESuits.HEARTS, ECardValues.THREE, 3),
HEARTS_FOUR(ESuits.HEARTS, ECardValues.FOUR, 4),
HEARTS_FIVE(ESuits.HEARTS, ECardValues.FIVE, 5),
HEARTS_SIX(ESuits.HEARTS, ECardValues.SIX, 6),
HEARTS_SEVEN(ESuits.HEARTS, ECardValues.SEVEN, 7),
HEARTS_EIGHT(ESuits.HEARTS, ECardValues.EIGHT, 8),
HEARTS_NINE(ESuits.HEARTS, ECardValues.NINE, 9),
HEARTS_TEN(ESuits.HEARTS, ECardValues.TEN, 10),
HEARTS_JACK(ESuits.HEARTS, ECardValues.JACK, 11),
HEARTS_QUEEN(ESuits.HEARTS, ECardValues.QUEEN, 12),
HEARTS_KING(ESuits.HEARTS, ECardValues.KING, 13),
HEARTS_ACE(ESuits.HEARTS, ECardValues.ACE, 14),

DIAMONDS_TWO(ESuits.DIAMONDS, ECardValues.TWO, 2),
DIAMONDS_THREE(ESuits.DIAMONDS, ECardValues.THREE, 3),
DIAMONDS_FOUR(ESuits.DIAMONDS, ECardValues.FOUR, 4),
DIAMONDS_FIVE(ESuits.DIAMONDS, ECardValues.FIVE, 5),
DIAMONDS_SIX(ESuits.DIAMONDS, ECardValues.SIX, 6),
DIAMONDS_SEVEN(ESuits.DIAMONDS, ECardValues.SEVEN, 7),
DIAMONDS_EIGHT(ESuits.DIAMONDS, ECardValues.EIGHT, 8),
DIAMONDS_NINE(ESuits.DIAMONDS, ECardValues.NINE, 9),
DIAMONDS_TEN(ESuits.DIAMONDS, ECardValues.TEN, 10),
DIAMONDS_JACK(ESuits.DIAMONDS, ECardValues.JACK, 11),
DIAMONDS_QUEEN(ESuits.DIAMONDS, ECardValues.QUEEN, 12),
DIAMONDS_KING(ESuits.DIAMONDS, ECardValues.KING, 13),
DIAMONDS_ACE(ESuits.DIAMONDS, ECardValues.ACE, 14),

CLUBS_TWO(ESuits.CLUBS, ECardValues.TWO, 2),
CLUBS_THREE(ESuits.CLUBS, ECardValues.THREE, 3),
CLUBS_FOUR(ESuits.CLUBS, ECardValues.FOUR, 4),
CLUBS_FIVE(ESuits.CLUBS, ECardValues.FIVE, 5),
CLUBS_SIX(ESuits.CLUBS, ECardValues.SIX, 6),
CLUBS_SEVEN(ESuits.CLUBS, ECardValues.SEVEN, 7),
CLUBS_EIGHT(ESuits.CLUBS, ECardValues.EIGHT, 8),
CLUBS_NINE(ESuits.CLUBS, ECardValues.NINE, 9),
CLUBS_TEN(ESuits.CLUBS, ECardValues.TEN, 10),
CLUBS_JACK(ESuits.CLUBS, ECardValues.JACK, 11),
CLUBS_QUEEN(ESuits.CLUBS, ECardValues.QUEEN, 12),
CLUBS_KING(ESuits.CLUBS, ECardValues.KING, 13),
CLUBS_ACE(ESuits.CLUBS, ECardValues.ACE, 14);

private ESuits suit;
private ECardValues value;
private int worth;

private ECards(ESuits suit, ECardValues value, int worth){
	this.suit = suit;
	this.value = value;
	this.worth = worth;
}

public ESuits getSuit(){
	return this.suit;
}

public ECardValues getValue(){
	return this.value;
}

public int getWorth(){
	return this.worth;
}

}
