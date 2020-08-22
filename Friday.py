import datetime

def has_friday_13(month, year):
    x = datetime.datetime(year, month, 13)
    if(x.strftime("%A") == "Friday"):
        return True
    return False

def factorial(num):
    if num == 1:
        return 1
    return num*int(factorial(num - 1))

print(factorial(5))