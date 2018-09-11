//³¯Â¥ : 5¿ù 28ÀÏ 
//ÀúÀÚ : ¼ÛÅÂ¾ç
//Á¦¸ñ : 7. »ý¼ºÀÚ(¿¤¸®º£ÀÌÅÍ)
package E07_Constructor_Elevator;

public class Elevator2_k08 {

		int limit_up_floor;
		int limit_down_floor;
		int floor;
		String help;
		
		// ÃÖ»óÃþ 10, ÃÖÇÏÃþ 1, ÇöÀçÃþ 1·Î ÁØ°ø.
		Elevator2_k08() {
			limit_up_floor = 10;
			limit_down_floor = 1;
			floor = 1;
			System.out.printf("¿¤¸®º£ÀÌÅÍ ÁØ°ø ¿Ï·á, ÃÖ»óÃþ 10Ãþ, ÃÖÇÏÃþ 1Ãþ\n");
		}
		
		// ÃÖ»óÃþ top, ÃÖÇÏÃþ bottom, ÇöÀçÃþ 1·Î ÁØ°ø.
		Elevator2_k08(int top, int bottom) {
			limit_up_floor = top;
			limit_down_floor = bottom;
			floor = 1;
			System.out.printf("¿¤¸®º£ÀÌÅÍ ÁØ°ø ¿Ï·á, ÃÖ»óÃþ %dÃþ, ÃÖÇÏÃþ %dÃþ\n", top, bottom);
		}
		
		// ÃÖ»óÃþ 10, ÃÖÇÏÃþ 1, ÇöÀçÃþ a·Î ¸¸µê.
		Elevator2_k08(int a) {
			this();
		
			if(a > 0) {
				for(int i = 0; i < a; i++) this.up();
			}
			else if(a < 0) {
				for(int i = 0; i < (a*-1); i++) this.down();
			}
		}
				
		void up() {
			if(floor == limit_up_floor) {
				help = "¸¶Áö¸·ÃþÀÔ´Ï´Ù.";
			}
			else {
				floor++;
				help = String.format("%dÃþÀÔ´Ï´Ù.", floor);
			}
		}
		
		void down() {
			if(floor == limit_down_floor) { 
				help = "Ã³À½ÃþÀÔ´Ï´Ù.";
			}
			else {
				floor--;
				help = String.format("%dÃþÀÔ´Ï´Ù.", floor);
			}
		}
}


