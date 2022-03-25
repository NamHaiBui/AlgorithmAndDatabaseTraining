# Uses python3
import sys


def get_optimal_value(capacity, weights, values):
    value = 0.
    value_per_weight = []
    for i in range(len(weights)):
        value_per_weight.append(values[i] / weights[i])
    i=0
    while (capacity > 0):

        while (weights[i] > 0 and capacity > 0):
            value += value_per_weight[i]
            weights[i] -= 1
            capacity -= 1
            print(value)
            print(capacity)
            print(weights[i])
        i += 1
        print(i)
    return value


if __name__ == "__main__":
    n, capacity = list(map(int, input().split()))
    values = [0 for i in range(n)]
    weights = [0 for i in range(n)]
    for i in range(n):
        values[i], weights[i] = list(map(int, input().split()))
    # print(n)
    opt_value = get_optimal_value(capacity, weights, values)
    print("{:.10f}".format(opt_value))
