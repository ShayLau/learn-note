#pragma once
class Parent
{
public:
	Parent();
	Parent(int number1, int number2);
	int number1;
	int number2;
	void printParent();
	void printFriend();
	void useFriend();
private:
	void show();
};

