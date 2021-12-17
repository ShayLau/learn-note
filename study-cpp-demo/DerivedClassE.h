#pragma once
#include "BaseClassA.h"
#include <iostream>
using namespace std;

class DerivedClassE :private BaseClassA
{
public:
	void printBaseProperties() {
		cout << "" << b <<endl;
		cout << "" << a << endl;
	}
};
