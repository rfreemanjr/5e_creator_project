/**
 * 
 */
package character;

/**
 * This class aims to mimic the typical character sheet
 * Associated with Dungeons & Dragons Fifth edition.
 * The plan is to have this utilized with a UI later.
 * @author Ronney Freeman
 *
 */
public class Character {
	private String charName;
	private String charClass;
	private String charBackground;
	private String playerName;
	private String Race;
	private String Alignment;
	private int charLevel;
	private int expPoints;
	private int inspiration;
	private int profBonus;
	private int strength;
	private int dex;
	private int con;
	private int intel;
	private int wis;
	private int charisma;
	
	/**
	 * 
	 * Character.java's constructor.
	 * * @param playerName the name of the player.
	 * @param charName the name of the player's Character.
	 */
	public Character(String playerName, String charName) {
		setPlayerName(playerName);
		setCharName(charName);
	}
	public void setPlayerName(String player) {
		this.playerName = player;
	}
	public void setCharName(String character) {
		this.charName = character;
	}
}
