#include <iostream>
#include <iomanip>

using namespace std;

int main(){

  double income;
  cin >> income;

  cout.setf(ios::fixed);

  if(income <= 2000.00){
      cout << "Isento " << '\n';
  } else if (income > 2000.00 && income <= 3000.00) {
      cout << "R$ " << setprecision(2) << income*0.08 << '\n';
  } else if (income > 3000.00 && income <= 4500.00) {
      income -= 3000.00;
      cout << "R$ " << setprecision(2) << ((income*0.18) + 80.00) << '\n';
  } else if (income > 4500.00) {
      income-= 4500.00;
      cout << "R$ " << setprecision(2) << ((income*0.28) + 80.00 + 270) << '\n';
  }
  return 0;
}
