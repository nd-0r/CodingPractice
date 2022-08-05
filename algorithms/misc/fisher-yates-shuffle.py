import random

def fisher_yates_shuffle(arr):
    out = [i for i in arr]
    part = 0
    while part < len(out):
        idx = random.randint(part, len(out) - 1)
        while (idx > part):
            temp = out[idx - 1]
            out[idx - 1] = out[idx]
            out[idx] = temp
            idx -= 1
        part += 1
    return out


