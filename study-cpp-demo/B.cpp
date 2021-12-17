#include "B.h"
#include "A.h"
#include <iostream>
using namespace std;

void B::getNumber() {
	A *a = new A();
	cout <<"a.numberA:" << a->numberA << endl;
}