from typing import List

def merge_sort(arr: List[int]) -> List[int]:
    if len(arr) < 2:
        return arr
    arr0 = arr[:len(arr) // 2]
    arr1 = arr[len(arr) // 2:]
    if (arr0[0] < arr1[0]):
        return merge_sort(arr0) + merge_sort(arr1)
    else:
        return merge_sort(arr1) + merge_sort(arr0)

