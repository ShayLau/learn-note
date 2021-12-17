#include "BaseClassA.h"
#include "BaseClassB.h"
#include  <iostream>
using namespace std;

class DerivedClassC :public BaseClassA,public BaseClassB {
public:
	void printBaseClassField();
};