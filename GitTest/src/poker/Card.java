package poker;

public class Card implements ICard {

	private final ECardValues value;
	private final ESuits suit;
	
	public Card(ECardValues value, ESuits suit){
		this.value = value;
		this.suit = suit;
	}
	
	@Override
	public ESuits getSuit() {
		return this.suit;
	}

	@Override
	public ECardValues getValue() {
		return this.value;
	}

}
