#python version 3.8.2

salary = float(input())

if(salary > 0 and salary <= 2000.00):
  print("Isento")
elif(salary > 2000.00 and salary <= 3000.00):
  discount = (salary - 2000.00) * 0.08
  print(f"R$ {discount:0.2f}")
elif(salary > 3000.00 and salary <= 4500.00):
  discount = ((salary - 3000.00) * 0.18) + (1000.00 * 0.08)
  print(f"R$ {discount:0.2f}")
else:
  discount = (((salary - 4500.00) * 0.28) +(1000.00 * 0.08) + (1500.00 * 0.18))
  print(f"R$ {discount:0.2f}")
