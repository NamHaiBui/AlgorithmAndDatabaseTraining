def FiboRecursion(n):
    if n <= 1:
        return n
    else:
        return FiboRecursion(n-1) + FiboRecursion(n -2)
if( __name__ == '__main__'):
    print(
        FiboRecursion(6)
    )
