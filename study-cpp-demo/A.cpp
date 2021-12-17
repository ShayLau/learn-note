#include "A.h"
#include "B.h"
#include<iostream>
using namespace std;

void A::printNumber() {
	B *b=new B();
	cout << "b.age:" << b->age << endl;
	
	cout << "a:number" << A::numberA;
}