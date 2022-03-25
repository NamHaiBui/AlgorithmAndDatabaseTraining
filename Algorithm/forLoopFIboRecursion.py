def FiboRecursion(n):
    m = 0;
    if n <= 1:
        return n
    previous = 0
    current = 1
    for _ in range(n - 1):
        previous, current = current, previous + current

    return current % 10
if( __name__ == '__main__'):
    print(
        FiboRecursion(331)
    )
