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
	private int level;
	private int expPoints;
	private int inspiration;
	private int profBonus;
	private int str;
	private int dex;
	private int con;
	private int intel;
	private int wis;
	private int ch;
	
	
	//TODO: MAKE SETTERS FOR THE REMAINDER AND MAKE GETTERS AS WELL
	
	/**
	 * 
	 * Character.java's constructor.
	 * * @param playerName the name of the player.
	 * @param charName the name of the player's Character.
	 */
	public Character(String playerName, String charName) {
		setPlayerName(playerName);
		setCharName(charName);
		setLevel(level); //This may need to alter the proficiency bonus
		setInitialAbilityScores();
		
	}
	private void setInitialAbilityScores() {
		setStr(str);
		setDex(dex);
		setCon(con);
		setInt(intel);
		setWis(wis);
		setChar(ch);
		
	}
	private void setChar(int ch) {
		this.ch = ch;
		
	}
	private void setWis(int wis) {
		this.wis = wis;
		
	}
	private void setInt(int intel) {
		this.intel = intel;
		
	}
	private void setCon(int con) {
		this.con = con;
		
	}
	private void setDex(int dex) {
		this.dex = dex;
		
	}
	private void setStr(int str) {
		this.str = str;
		
	}
	private void setLevel(int level) {
		this.level = level;		
	}
	public void setPlayerName(String player) {
		this.playerName = player;
	}
	public void setCharName(String character) {
		this.charName = character;
	}
}
