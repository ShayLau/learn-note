#include "Person.h"
#include<iostream>
using namespace std;
Person::Person()
{
	cout << "person construct"<<endl;
}
Person::Person(Student &stu) {
	cout << "person param construct"<<endl;
	//���ƹ��캯��
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
* ��������
*/
void Person::show()const {
	//��������
	const int number = 10;
	std::cout << "const show()" << endl;
	std::cout << "const number:"<<number << endl;
}