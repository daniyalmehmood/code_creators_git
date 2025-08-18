public class MakeChocolate {
 public int makeChocolateWithSpecificGoal(int small, int big, int goal) {
        if(big*5>goal)
            big=goal/5;
        if(goal-big*5>small)return -1;
        return goal-big*5;
    }
	}