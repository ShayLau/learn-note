#include "DerivedClassC.h"

void DerivedClassC::printBaseClassField()
{
	cout<<"" << DerivedClassC::BaseClassA::a<<endl;
	cout<<"" << DerivedClassC::BaseClassB::a<< endl;
}
