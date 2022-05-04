package org.salazar.hammyquest.phase03.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.salazar.hammyquest.phase03.obstacule.CageObstacule;
import org.salazar.hammyquest.phase03.obstacule.DoorObstacule;
import org.salazar.hammyquest.phase03.obstacule.Obstacule;
import org.salazar.hammyquest.phase03.obstacule.OwnerObstacule;
import org.salazar.hammyquest.phase03.reward.BananaReward;
import org.salazar.hammyquest.phase03.reward.CookieReward;
import org.salazar.hammyquest.phase03.reward.CornReward;
import org.salazar.hammyquest.phase03.reward.Reward;

public class Game {
	private Hammy hammy;
	private List<Obstacule> obstacules;
	private List<Reward> rewards;
	private Scanner console = new Scanner(System.in);
	private Random random = new Random();

	public void start() {
		boolean isPlaying = true;
		this.init();

		String hammyName = getInput("Please provide a cute name to your brave Hammy");
		this.hammy.setName(hammyName);

		while (isPlaying) {
			Integer luck = random.nextInt(1, 100);

			if (luck <= 60) {
				this.getObstacule().message(hammy);
			} else {
				this.getreward().message(hammy);
			}

			if (hammy.getHappiness() <= 0) {
				System.out.println(String.format("%s is to sad to continue playing :(", hammy.getName()));
				break;
			}
			
			System.out.println(String.format("%s happines is %s", hammy.getName(), hammy.getHappiness()));
			
			String input = getInput("Continue? [Y/N]");
			if ("N".equalsIgnoreCase(input))
				break;

			
		}
		System.out.println("Thank you for playing");
	}

	private String getInput(String msg) {
		System.out.println(msg);
		return console.nextLine();
	}

	private Obstacule getObstacule() {
		Integer luck = random.nextInt(0, 2);
		return this.obstacules.get(luck);
	}

	private Reward getreward() {
		Integer luck = random.nextInt(0, 2);
		return this.rewards.get(luck);
	}

	private void init() {
		this.hammy = new Hammy();
		obstacules = new ArrayList<>();
		obstacules.add(new OwnerObstacule());
		obstacules.add(new DoorObstacule());
		obstacules.add(new CageObstacule());

		rewards = new ArrayList<>();
		rewards.add(new BananaReward());
		rewards.add(new CookieReward());
		rewards.add(new CornReward());

	}

}
