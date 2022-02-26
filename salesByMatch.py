# https://www.hackerrank.com/challenges/sock-merchant/problem

def sockMerchant(n, ar):
    pearsColor = set()
    pears = 0
    for i in range(len(ar)):
        if ar[i] not in pearsColor:
            pearsColor.add(ar[i])
        else:
            pears += 1 
            pearsColor.remove(ar[i])
    return pears
