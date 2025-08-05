public class WithoutDoubles {
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {

      if(noDoubles && die1==die2) {
          if (die1 == 6)
              return die1+1;
          else {
              return die1 + die2 + 1;
          }
      }
      else return die1+die2;
    }

    public static void main(String[] args) {
        System.out.println(withoutDoubles(6,6,true));
    }
}
