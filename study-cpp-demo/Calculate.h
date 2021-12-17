#pragma once
#include "PhysicalLocaltion.h"
class Calculate
{
public:
	bool isTriangle(PhysicalLocaltion& localA, PhysicalLocaltion& localB, PhysicalLocaltion& localC);
protected:
	double distance(PhysicalLocaltion& local1, PhysicalLocaltion& local2);
};

