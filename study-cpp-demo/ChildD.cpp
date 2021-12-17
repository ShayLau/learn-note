#include "ChildD.h"
#include "ChildC.h"
#include "ChildB.h"
#include  <iostream>
using namespace std;

void ChildD::print()
{
	cout << ChildB::a << endl;
}
