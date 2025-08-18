public class EvenlySpaced {
  public boolean evenlySpacedBetweenThreeNumber(int a,int b,int c) {
        int minValue=Math.min(a,Math.min(b,c));
        int mediumValue=0;
        int largeValue=Math.max(a,Math.max(b,c));
        if(a>minValue&&a<largeValue)mediumValue=a;
        else if(b>minValue&&b<largeValue)mediumValue=b;
        else mediumValue=c;
        return mediumValue - minValue == largeValue - mediumValue;
    }
	}