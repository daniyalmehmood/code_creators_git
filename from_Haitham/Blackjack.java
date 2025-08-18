public class Blackjack {
public int blackjackNearestFrom21(int a, int b) {
        int nearest=0;
        if(a>nearest&&a<=21)nearest=a;
        if (b>nearest&&b<=21)nearest=b;
        return nearest;
    }
	}