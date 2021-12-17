#pragma once
#include "BaseClassA.h"
#include <iostream>
using namespace std;

class DerivedClassD:protected BaseClassA
{
public:
	void printBaseProperties() {
		cout <<""<< b<<endl;
	}

	
};

