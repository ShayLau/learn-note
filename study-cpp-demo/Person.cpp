#include "Person.h"
#include<iostream>
using namespace std;
Person::Person()
{
	cout << "person construct"<<endl;
}
Person::Person(Student &stu) {
	cout << "person param construct"<<endl;
	//复制构造函数
	Person::stu = stu;
}
Person::~Person(){
	cout << "person destruct"<<endl;
}
void Person::printPerson() {
	Student stu = getstudent();
	stu.printStudent();
}

Student Person::getstudent() {
	return stu;
}

/*
* 常量函数
*/
void Person::show()const {
	//常量数据
	const int number = 10;
	std::cout << "const show()" << endl;
	std::cout << "const number:"<<number << endl;
}