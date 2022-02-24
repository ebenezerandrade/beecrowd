#2d array ds
#link https://www.hackerrank.com/challenges/2d-array/problem

def calculus(arr, initial_line, initial_colum):
  return arr[initial_line][initial_colum] + arr[initial_line][initial_colum + 1] + arr[initial_line][initial_colum + 2] + arr[initial_line + 1][initial_colum + 1] + arr[initial_line + 2][initial_colum] + arr[initial_line + 2][initial_colum + 1] + arr[initial_line + 2][initial_colum + 2]

def hourglassSum(arr):
  values = [calculus(arr, initial_line, initial_colum) for initial_line in range(0, 4) for initial_colum in range(0,4)]
  return  max(values)
