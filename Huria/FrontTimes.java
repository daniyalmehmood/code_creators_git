public String frontTimes(String str, int n) {
    String front;
    // String newString;
    
    if ( str.length() > 2 && n >= 0) {
      front = str.substring(0, 3);
      
      String repeatedVal = "";
      for(int i=0; i<n; i++)
        repeatedVal = repeatedVal + front;
        
      return repeatedVal;
      // newString = front.repeat(n);
      // return newString;
    }
    
    else if (str.length() <= 2 && n >= 0) {
      front = str.substring(0,str.length());
      
      String repeatedVal = "";
      for(int i=0; i<n; i++)
        repeatedVal = repeatedVal + front;
        
      return repeatedVal;
      
      // newString = front.repeat(n);
      // return newString;
    }
    
    else {
      return " ";
    }
}
