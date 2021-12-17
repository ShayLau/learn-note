#pragma once
#include "Parent.h"
#include <iostream>
using namespace std;
class Child :public Parent
{
public:
	Child();
	Child(int number);
	int number3;
	void printChild();
private:


};

