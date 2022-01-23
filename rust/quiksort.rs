fn partition<T: std::cmp::PartialOrd>(arr: &mut Vec<T>, start: usize, end: usize) -> usize {
    let pivot_idx = end - 1;
    let mut partition_idx = start;
    let mut curr_idx = start;

    while curr_idx < pivot_idx {
        if arr[curr_idx] < arr[pivot_idx] {
            arr.swap(curr_idx, partition_idx);
            partition_idx += 1;
        }
        curr_idx += 1;
    }

    arr.swap(partition_idx, pivot_idx);

    partition_idx
}

fn quik_sort<T: std::cmp::PartialOrd>(arr: &mut Vec<T>, start: usize, end: usize) {
    if start >= end {
        return;
    }

    let partition_idx = partition(arr, start, end);
    quik_sort(arr, start, partition_idx);
    quik_sort(arr, partition_idx + 1, end);
}

fn main() {
    let test_vec0 = vec![3, 4, 2, 5, 9, 1];
    let test_vec1 = vec![5, 4, 3, 2, 1];
    let test_vec2 = vec![1, 2, 3, 4, 5];
    let test_vec3 = vec![0];
    let test_vec4 = vec![];

    for vec in vec![test_vec0, test_vec1, test_vec2, test_vec3, test_vec4].iter_mut() {
        quik_sort(vec, 0, vec.len());
        println!("{:?}", vec);
    }
}
