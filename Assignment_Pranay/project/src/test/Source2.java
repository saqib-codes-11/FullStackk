package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

enum FoodType{
	VEG,NONVEG
}

class Consumer{
	
	final String name;
	final int age;
	final FoodType foodType;
	
	
	
	
	
	public Consumer(String name, int age, FoodType foodType) {
		this.name = name;
		this.age = age;
		this.foodType = foodType;
	}


	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public FoodType getFoodType() {
		return foodType;
	}


	@Override
	public String toString() {
		return "Consumer [name=" + name + ", age=" + age + ", foodType=" + foodType + "]";
	}	
}

class Implementation{
	public List<Consumer> getNonVegetarianList(List<Consumer> consumer){
		List<Consumer> nv= consumer.stream().filter(f-> f.getFoodType().equals(FoodType.NONVEG)).collect(Collectors.toList());
		return nv;
	}
	
	public List<Consumer> sortConsumerByAge(List<Consumer> consumer){
		List<Consumer> sort=consumer.stream().
				sorted(Comparator.comparingInt(Consumer::getAge)).collect(Collectors.toList());
		
		return sort;
	}
}

class Source2{
	public static void main(String[] args) {
		List<Consumer> list=new ArrayList<>();
		list.add(new Consumer("Pranay", 22, FoodType.NONVEG));
		list.add(new Consumer("John", 20, FoodType.VEG));
		list.add(new Consumer("Ankita", 30, FoodType.NONVEG));
		list.add(new Consumer("Naveena", 40, FoodType.VEG));
		list.add(new Consumer("lol", 50, FoodType.NONVEG));
		list.add(new Consumer("Putin", 69, FoodType.NONVEG));
		list.add(new Consumer("Kanye", 99, FoodType.NONVEG));
		Implementation i=new Implementation();
		System.out.println("Non Veg: "+i.getNonVegetarianList(list));
		System.out.println();
		System.out.println("Sorted by age"+i.sortConsumerByAge(list));
	}
}

