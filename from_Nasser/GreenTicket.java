public class GreenTicket {

    public int greenTicket(int a, int b, int c) {

      if(a!=b && b!=c & a!=c) return 0;
      else if (b == c && c == a)return 20;
      else return 10;

    }


}
