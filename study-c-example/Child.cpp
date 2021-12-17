#include "Child.h"
#include "Parent.h"

Child::Child()
{
	number1 = 0;
	number2 = 0;
	number3 = 0;
}

Child::Child(int number):Parent()
{
	this->number1 = number;
	number2 = 0;
	number3 = 0;
}

void Child::printChild() {
	cout << "child print:" << endl;
	cout << "number1:" << number1 << ",number2:" << number2 << ",number3:" << number3;
	
	this->Parent::useFriend();
}

