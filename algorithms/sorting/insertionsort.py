from typing import List

def insertion_sort(arr: List[int]) -> List[int]:
    for idx in range(len(arr)):
        target_idx = idx
        while (target_idx > 0 and arr[target_idx] < arr[target_idx - 1]):
            tmp = arr[target_idx - 1]
            arr[target_idx - 1] = arr[target_idx]
            arr[target_idx] = tmp

            target_idx -= 1
    return arr

