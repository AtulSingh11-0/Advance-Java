package io.github.enums;

/**
 * @author cocat
 * @created 07-08-2024 - 11:22 AM
 * @package-name io.github.enums
 * @project Advance-Java
 */
public enum Animal {
	DOG("this is a dog", "woof", 4),
	CAT("this is a cat", "meow", 4),
	COW("this is a cow", "moo", 4),
	CHICKEN("this is a chicken", "cluck", 2),
	FISH("this is a fish", "blub", 0),;

	private final String description;
	private final String sound;
	private final int limbs;

	Animal (String description, String sound, int limbs) {
		this.description = description;
		this.sound = sound;
		this.limbs = limbs;
	}

	public String getDescription() {
		return description;
	}

	public String getSound() {
		return sound;
	}

	public int getLimbs() {
		return limbs;
	}

	@Override
	public String toString () {
		return "Animal{" +
				"description='" + description + '\'' +
				", sound='" + sound + '\'' +
				", limbs=" + limbs +
				'}';
	}
}
