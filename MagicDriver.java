public class MagicDriver {
    public static void main(String [] args) {
	Magic card = new Magic();
	System.out.println(card.toString());
	Magic vexingDevil = new Magic("Vexing Devil", "Avacyn Restored", "R", "Creature");
	System.out.println(vexingDevil.toString());
    }
}
