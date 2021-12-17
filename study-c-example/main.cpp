#include "Student.h"
#include "Person.h"
#include "Dog.h"
#include "PhysicalLocaltion.h"
#include "Calculate.h"
#include "A.h"
#include "B.h"
#include "CalculateNumber.h"
#include "StreamOper.h"
#include "Parent.h"
#include "Child.h"
#include "Friend.h"
#include "DerivedClassC.h"
#include "DerivedClassD.h"
#include "DerivedClassE.h"
#include "ChildD.h"
#include "ParentA.h"
#include "string.h"
#include <iostream>
using namespace std;

// Dog *dog=new Dog();

// void classLoadTest() {
// 	//测试构造函数 和析构函数
// 	Student* stu = new Student(10, 'c');
// 	stu->printStudent();
// 	Person* person = new Person(*stu);
// 	delete person;
// 	//
// 	Student studentB;
// 	studentB.print();

// 	//在main方法外声明类实例，进行作用域测试
// 	dog->color = 1;
// 	delete dog;
	
// 	//测试const
// 	const Person personB;
// 	personB.show();
// }
// //测试三角形
// void testTriangle() {
// 	PhysicalLocaltion* localA = new PhysicalLocaltion(1, 1);
// 	PhysicalLocaltion* localB = new PhysicalLocaltion(1, 3);
// 	PhysicalLocaltion* localC = new PhysicalLocaltion(3, 1.5);
// 	Calculate calculate;
// 	calculate.isTriangle(*localA, *localB, *localC)? cout << "yes" :cout << "no" << endl;
// }
// void testFrildClass() {
// 	B b;
// 	b.getNumber();
// 	A a;
// 	a.printNumber();
// }

// /*
// * 测试面向对象
// */
// void testDog() {
// 	int color = 10;
// 	Dog* d = new Dog(color);
// 	delete d;
// }
// /*
// * 测试运算符重载 加减乘除
// */
// void calculateNumberDemo() {
// 	CalculateNumber var1(10,10,20), var2(10, 10, 20);
// 	var1 + var2;

// 	CalculateNumber var3(10, 10, 20), var4(10, 10, 20);
// 	var3 - var4;

// 	CalculateNumber var5(10, 10, 20), var6(10, 10, 20);
// 	var5* var6;

// 	CalculateNumber var7(10, 10, 20), var8(10, 10, 20);
// 	var7 / var8;

// 	CalculateNumber var9(10, 10, 20), var10(10, 10, 20);
// 	CalculateNumber  var11=var9 % var10;
// 	cout << "number1:" << var11.number1 << "number2:" << var11.number2 << "number3:" << var11.getNumber3 ()<< endl;
// }

// /*
// *测试 流运算符重载的测试
// */
// void streamOutOperator() {
// 	StreamOper  *oper=new StreamOper();
// 	oper->age = 20;
// 	cout << oper;
// }

// /*
// *测试 流运算符重载的测试
// */
// void streamInOperator() {
// 	StreamOper *oper=new StreamOper();
// 	oper->age = 10;
// 	oper->name="hello";
// 	cin >> oper;
// 	cout << oper;
// }

// /*
// 测试继承
// */
// void testExtend() {
// 	Child child;
// 	child.number1 = 1;
// 	child.number2 = 2;
// 	child.number3 = 3;
// 	child.printChild();
// }
// /*
// * 测试基类Parent作为Friend的友元类
// */
// void testFriendExtend() {
// 	Child*child = new Child();
// 	child->Parent::printParent();
// 	child->useFriend();
// }

// /*
// *测试派生类继承两个基类，两个基类中存在同名属性，产生二义性调用
// */
// void printBaseClassFieldDemo() {
// 	DerivedClassC c;
// 	c.printBaseClassField();
// }

// /*
// * 测试基类和派生类兼容性
// */
// void testClasscompatibility() {
// 	BaseClassA baseA;
// 	DerivedClassC derivedc;
// 	derivedc.BaseClassA::a = 100;
// 	baseA = derivedc;
// 	cout << "使用派生类对象赋值基类对象，基类 a:" <<baseA.a << endl;

// 	BaseClassA* baseB=new BaseClassA();
// 	DerivedClassC *derivedC2 = new DerivedClassC();
// 	derivedC2->BaseClassA::a = 200;
// 	baseB = derivedC2;
// 	cout << "使用派生类引用指针赋值基类指针，基类 a:" << baseB->a << endl;

// 	DerivedClassC derivedC3;
// 	derivedC3.BaseClassA::a=300;
// 	BaseClassA& baseA3 = derivedC3;
// 	cout << "使用派生类对象赋值基类指针引用，基类 a:" << baseA3.a << endl;
// }


// /**
// * 测试派生类使用不同变量访问符访问变量
// */
// void testActionScope() {
// 	DerivedClassD derivedD;
// 	derivedD.printBaseProperties();
// 	DerivedClassE derivedE;
// 	derivedE.printBaseProperties();
// }

// /*
// * 测试基类和派生类类型转换
// */
// void testTypeConvert() {
// 	BaseClassA* baseA = new BaseClassA();
// 	DerivedClassC* derivedC = new DerivedClassC();
// 	derivedC = (DerivedClassC*)baseA;
// 	derivedC->printBaseClassField();
// }


/*
* 测试虚基类
*/
void testVirtualBaseClass() {
	ChildD *cd = new ChildD();
	//ParentA *pa = new ChildD();
	cd->print();
}

int main()
{	
	//testTriangle();

	//testFrildClass();

	//testDog();
	
	// calculateNumberDemo;

	//streamOutOperator();

	//streamInOperator();

	//testExtend();
 
	//testFriendExtend();

	//printBaseClassFieldDemo();

	//testClasscompatibility();

	//testActionScope();

	//testTypeConvert();

	 testVirtualBaseClass();
	return 0;
}
			