def swap(arr:list, idx1: int, idx2: int):
    """
    idx1과 idx2의 인자를 교환
    @param arr 교환 대상 배열
    @param idx1 교환 대상 인덱스1
    @param idx2 교환 대상 인덱스2
    """
    temp = arr[idx1]
    arr[idx1] = arr[idx2]
    arr[idx2] = temp

def sort(arr):
    """
    버블 정렬을 수행
    @param arr 정렬할 배열
    """
    length = len(arr)
    for i in range(length-1):
        for j in range(length-1, i, -1):
            if arr[j] < arr[j-1]:
                swap(arr, j, j-1)    

def sort2(arr):
    """
    버블 정렬을 수행
    @param arr 정렬할 배열
    """
    length = len(arr)
    for i in range(length-1):
        for j in range(0, length-1-i):
            if arr[j] > arr[j+1]:
                swap(arr, j, j+1)    
                

if __name__=="__main__":
    length = int(input())
    arr = input().split()
    arr = [int(num) for num in arr]
    sort2(arr)
    print(arr)