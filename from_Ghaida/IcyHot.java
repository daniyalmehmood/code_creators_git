public class IcyHot{
	public static  void main(String[] args){
		System.out.println(icyHot(120, -1)); //true
		System.out.println(icyHot(-1, 120));//true
		System.out.println(icyHot(2, 120));//false
	}
	
	public static boolean icyHot(int temp1, int temp2){
		if((temp1 < 0) && (temp2 > 100)){
			return true;
		}
		else if(((temp2 < 0) && (temp1 > 100))){
			return true;
		}
		else {
			return false;
		}
	}
}