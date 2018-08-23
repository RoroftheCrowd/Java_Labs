
class ElevatorFitter {

	public static void main(String args[]) {
		int weightofAPerson;
		int elevatorWeightLimit;
		int numberOfPeople;
		
		weightofAPerson = 150;
		elevatorWeightLimit = 1400;
		numberOfPeople =
				elevatorWeightLimit / weightofAPerson;
		System.out.print("You can fit ");
		System.out.print(numberOfPeople);
		System.out.println(" people on the elevator.");
	}
}
