def selectionSort(arr):
    n= len(arr)
    for i in range(n):
        min = i
        for j in range(i+1,n):
            if arr[min]> arr[j]:
                min = j
        arr[i],arr[min] = arr[min],arr[i]

data = [12,6,7,8,10,2,9]
selectionSort(data)
print(data)