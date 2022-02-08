/*
  Solution BEE1048 https://www.beecrowd.com.br/judge/pt/problems/view/1048
*/


#include <iostream>
#include <iomanip>

using namespace std;

int main(){

  double salary, percentage, salaryReadjust;

  cin >> salary;

  if (salary <= 400){
    percentage = 0.15;
    salaryReadjust = (salary * percentage);
    salary += salaryReadjust;
  } else if (salary > 400 && salary <= 800){
    percentage = 0.12;
    salaryReadjust = (salary * percentage);
    salary += salaryReadjust;
  } else if (salary > 800 && salary <= 1200){
    percentage = 0.10;
    salaryReadjust = (salary * percentage);
    salary += salaryReadjust;
  } else if (salary > 1200 && salary <= 2000){
    percentage = 0.07;
    salaryReadjust = (salary * percentage);
    salary += salaryReadjust;
  } else if (salary > 2000){
    percentage = 0.04;
    salaryReadjust = (salary * percentage);
    salary += salaryReadjust;
  }

  cout.setf(ios::fixed);
  cout << "Novo salário: " << setprecision(2) << salary << endl;
  cout << "Reajuste ganho: " << setprecision(2) << salaryReadjust << endl;
  cout << "Em percentual: "<< setprecision(0) << (percentage * 100) << " %";

  return 0;
}
