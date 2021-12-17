#pragma once
#include "ChildC.h"
#include "ChildB.h"
class ChildD : ChildB,  ChildC
{
public:
	void print();
};

