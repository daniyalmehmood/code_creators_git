public class MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        if(big*5>goal)
            big=goal/5;
        if((goal-(big*5))<=small)return true;
        return false;
    }
	}