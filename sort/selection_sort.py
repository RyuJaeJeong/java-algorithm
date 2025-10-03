def swap(arr:list, idx1: int, idx2: int):
    temp = arr[idx1]
    arr[idx1] = arr[idx2]
    arr[idx2] = temp

def sort(arr):
    length = len(arr)
    for i in range(length-1):
        min = i
        for j in range(i+1, length):
            if arr[j] < arr[min]:
                min = j
        if min != i:        
            swap(arr, i, min)        

if __name__=="__main__":
    length = int(input())
    arr = input().split(" ")
    arr = [int(num) for num in arr]
    sort(arr)
    print(arr)