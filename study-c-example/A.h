#pragma once
class A
{
friend class B;
public:
	void printNumber();
private:
	int numberA;
};

