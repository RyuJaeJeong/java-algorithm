def sort(arr: list)->None:
    """단순 삽입정렬"""
    length = len(arr)
    for i in range(1, length):
        tmp = arr[i]
        j = i
        while j>0 and arr[j-1] > tmp:
            arr[j] = arr[j-1]
            j-=1
        arr[j] = tmp

if __name__=="__main__":
    length = int(input())
    arr = input().split()
    arr = list(map(lambda x: int(x), arr))
    sort2(arr)
    print(arr)