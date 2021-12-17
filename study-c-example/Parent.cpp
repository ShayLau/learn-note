#include "Parent.h"
#include "Friend.h"

#include <iostream>
using namespace std;


Parent::Parent()
{
	number1 = 0;
	number2 = 0;
}

Parent::Parent(int number1, int number2)
{
	this->number1 = number1;
	this->number2 = number2;
}

void Parent::printParent()
{
	cout << "parent print:" << endl;
	cout << "number1:" << number1 << ",number2:" << number2<<endl;
}

void Parent::printFriend()
{
	Friend f;
	f.friendInfo();
}

void Parent::useFriend()
{
	Friend f;
	f.friendInfo();
}

void Parent::show()
{
	Friend f;
	f.friendInfo();
}
