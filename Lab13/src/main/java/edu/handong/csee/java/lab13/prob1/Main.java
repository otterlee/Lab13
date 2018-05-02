package edu.handong.csee.java.lab13.prob1;

public class Main { //this is main class that Create instances and call methods to distinguish friends and print the output.
	public static void main(String[] args) {
		Friend friend1 = new Friend(); //create instance based on class Friend.
		SchoolFriend friend2 = new SchoolFriend();//create instance based on class SchoolFriend.
		ClassFriend friend3 = new ClassFriend();//create instance based on class ClassFriend.
		InstanceOf.whatFriend(friend1); //call static method 'whatFriend' and put 'friend1' as parameter
		InstanceOf.whatFriend(friend2); //call static method 'whatFriend' and put 'friend2' as parameter
		InstanceOf.whatFriend(friend3);	//call static method 'whatFriend' and put 'friend3' as parameter
	}
}
