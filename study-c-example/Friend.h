#pragma once
#include "Parent.h"

#include <iostream>
using namespace std;
class Friend
{

friend class Parent;
void friend  Parent::printParent();
public:
	int age;
private:
	int name;
	void friendInfo();
};

