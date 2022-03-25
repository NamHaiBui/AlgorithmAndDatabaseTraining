# Uses python3
import sys

def get_change(m):
    #Safe move: Take the largest change then move down


    return int(m/10) + int((m%10)/5) + (m%10)%5

if __name__ == '__main__':
    #Changes: 1, 5, 10
    m = int(input())
    print(get_change(m))
