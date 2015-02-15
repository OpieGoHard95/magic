public class MagicDriver {
    public static void main(String [] args) {
	Magic card = new Magic();
	System.out.println(card.toString());
	Magic vexingDevil = new Magic("Vexing Devil", "Avacyn Restored", "R", "Creature");
	System.out.println(vexingDevil.toString());
	Magic giantGrowth = new Magic("Giant Growth");
	System.out.println(giantGrowth.toString());
	Magic frostTitan = new Magic("Frost Titan", "Magic 2012");
	System.out.println(frostTitan.toString());
    }
}
