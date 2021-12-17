#include "Calculate.h"
#include <cmath>
#include <iostream>
using namespace std;

double Calculate::distance(PhysicalLocaltion& local1, PhysicalLocaltion& local2) {
	double xDistance = local1.x - local2.x;
	double yDistance = local1.y - local2.y;
	return sqrt(xDistance * xDistance + yDistance * yDistance);
}

bool Calculate::isTriangle(PhysicalLocaltion &localA, PhysicalLocaltion& localB, PhysicalLocaltion& localC) {

	 double ab=	distance(localA, localB);
	 cout << "ab" << ab<<endl;
	 double bc = distance(localB,localC);
	 cout << "bc" << bc<< endl;
	 double ac = distance(localA, localC);
	 cout << "ac" << ac<< endl;
	 return  ab + bc > ac && bc + ac > ab&&ab+ac>bc;
}