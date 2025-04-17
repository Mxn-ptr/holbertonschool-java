import food.Food;
import mood.Angry;
import mood.Happy;
import mood.Mood;
import mood.Sad;
import mood.VeryHappy;

public class Character {
	public int happinessPoints = 0;

	public Mood getCurentMood() {
		if (happinessPoints < -5) {
        return new Angry();
		} else if (happinessPoints <= 0) {
			return new Sad();
		} else if (happinessPoints <= 15) {
			return new Happy();
		} else {
			return new VeryHappy();
		}
	}

	public void eat(Food[] foods) {
		for (Food food: foods) {
			happinessPoints += food.getHappinessPoints();
		}
	}

	@Override
	public String toString() {
		return String.format("%d - %s", happinessPoints, getCurentMood().getClass().getSimpleName());
	}
}
