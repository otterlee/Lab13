package edu.handong.csee.java.lab13.prob1;

public class InstanceOf { //Distinguish the object Friend, SchoolFriend, ClassFriend.
	public static void whatFriend(Friend f) {//take object from class 'Friend', 'SchoolFriend' or 'ClassFriend' 
		//method that only distinguishes without holding specific data, so it is static method.
		if(f instanceof ClassFriend) {//if f is the derived class 'ClassFriend'
			((ClassFriend)f).classFriend();//cast f as ClassFriend and call method 'justFriend'.
		}
		else if(f instanceof SchoolFriend) {//if f is the derived class 'SchoolFriend'
			((SchoolFriend)f).schoolFriend();//cast f as SchoolFriend and call method 'schoolFriend'.
		}
		else if(f instanceof Friend) {//if f is the super class 'Friend'
			f.justFriend();//call method 'justFriend'
		}
	}
}
