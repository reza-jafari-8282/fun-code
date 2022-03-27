def square(n):
    print(n * "* ")
    m = n - 2
    for i in range(m):
        print("* " + m * "  " + "* ")
    print(n * "* ")

n = input("number : ")
n = int(n)

if n >= 2:
    square(n)
else:
    print("Wrong! enter n >= 2 number.")
