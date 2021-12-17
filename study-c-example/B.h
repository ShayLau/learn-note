#pragma once
#include "A.h"
class B
{
private:
	int number;
	int age;
public:
	void getNumber();
	friend void  A::printNumber();
};

