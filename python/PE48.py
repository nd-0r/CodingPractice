def main():
    num = 0
    for i in range(1, 1001):
        tmp = i
        for _ in range(1, i):
            tmp *= i
        num += tmp
        if num >= 100000000000:
            num %= 100000000000
    print(num)


if __name__ == '__main__':
    main()
